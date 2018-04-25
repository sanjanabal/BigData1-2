file_ip = LOAD '/niit' USING PigStorage() AS (word:chararray);

--words = foreach file_ip generate (TOKENIZE(word)); 
--({(hadoop),(hadoop)})
--({(mahout)})
--({(mahout),(pig)})
--({(hadoop),(pig)})
--({(hbase),(hbase)})
--({(hbase),(hadoop)})

words = foreach file_ip generate FLATTEN(TOKENIZE(word)); 

---(hadoop)
---(hadoop)
---(mahout)
---(mahout)
---(pig)
---(hadoop)
---(pig)
---(hbase)
---(hbase)
---(hbase)
---(hadoop)
  
grouped = group words by $0;

--(pig,{(pig),(pig)})
--(hbase,{(hbase),(hbase),(hbase)})
--(hadoop,{(hadoop),(hadoop),(hadoop),(hadoop)})
--(mahout,{(mahout),(mahout)})


wordcount = foreach grouped generate group, COUNT(words);

--(pig,2)
--(hbase,3)
--(hadoop,4)
--(mahout,2)

store wordcount into '/pig_wordcount'; 
