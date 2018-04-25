txn  =  LOAD  '/home/hduser/niit/txns1.txt'  USING PigStorage(',')  AS  ( txnid, date, custid, amount:double, category, product, city, state, type);
txnbytype = group txn by type;
--dump txnbytype;
typesales = foreach  txnbytype  generate group as type , SUM(txn.amount ) as total;
--dump spendtype;
totalgroup = group typesales all;
totalsales = foreach totalgroup generate SUM(typesales.total) as grandtotal;
final = foreach typesales generate $0, ROUND_TO($1,2), (chararray) ROUND_TO(($1/totalsales.grandtotal)*100,2) as percent;
final1 = foreach final generate $0, $1, CONCAT($2,'%');  
dump final1;
