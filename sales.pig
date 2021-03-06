cust = load  '/home/hduser/niit/custs.txt'  using  PigStorage(',')  AS ( custid, firstname, lastname, age:long, profession);
txn  =  LOAD  '/home/hduser/niit/txns1.txt'  USING PigStorage(',')  AS  ( txnid, date, custid, amount:double, category, product, city, state, type);
txnbycust = group txn by custid;
spendbycust = foreach  txnbycust  generate group as customer_id,  ROUND_TO(SUM(txn.amount ),2) as totalsales;
dump spendbycust;
greater_bag = filter spendbycust by totalsales>500;
newsales = join greater_bag by $0, cust by $0;
age_bag = filter newsales by age>50;
items = order age_bag by $1 desc;
store items into '/home/hduser/agegreater'using PigStorage(',');
--spendgreater = foreach spendbycust generate group as customer_id, totalsales>500;
--dump spendgreater;
