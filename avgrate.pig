weblog = LOAD '/home/hduser/Downloads/weblog' USING PigStorage() AS (name,  gateway , time:chararray);

gateway = LOAD '/home/hduser/Downloads/gateway' USING PigStorage() AS (gateway , rate:long);

jointable = join weblog by $1, gateway by $0;

new = group jointable by name;

newtable= foreach new generate group, AVG(jointable.rate);

final = filter newtable by $1>90; 

store final into '/home/hduser/avgrate.txt' USING PigStorage(); 
