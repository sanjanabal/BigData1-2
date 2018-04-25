--Load monthly data from local into three bags
sales2000 = LOAD '/home/hduser/2000.txt' using PigStorage(',') as (prod_id:long, product:chararray, jan:double, feb:double, mar:double, apr:double, may:double, jun:double, jul:double, aug:double, sep:double, oct:double, nov:double, dec:double);

sales2001 = LOAD '/home/hduser/2001.txt' using PigStorage(',') as (prod_id:long, product:chararray, jan:double, feb:double, mar:double, apr:double, may:double, jun:double, jul:double, aug:double, sep:double, oct:double, nov:double, dec:double);

sales2002 = LOAD '/home/hduser/2002.txt' using PigStorage(',') as (prod_id:long, product:chararray, jan:double, feb:double, mar:double, apr:double, may:double, jun:double, jul:double, aug:double, sep:double, oct:double, nov:double, dec:double);

--Calculate annual sales by adding monthly sales of each year
totsales2000 = foreach sales2000 generate prod_id, product, $2+$3+$4+$5+$6+$7+$8+$9+$10+$11+$12+$13 as total2000;

totsales2001 = foreach sales2001 generate prod_id, product, $2+$3+$4+$5+$6+$7+$8+$9+$10+$11+$12+$13 as total2001;

totsales2002 = foreach sales2002 generate prod_id, product, $2+$3+$4+$5+$6+$7+$8+$9+$10+$11+$12+$13 as total2002;

--dump totsales2000;

--Join all three bags

totsalesall = join totsales2000 by $0, totsales2001 by $0, totsales2002 by $0; 

--removing repetative columns

result = foreach totsalesall generate $0, $1, $2, $5, $8; 

-- to genrate growth form 2000 to 2001 and 2001 to 2002

growth1 = foreach result generate $0, $1, $2, $3, $4, (($3-$2)/$2)*100 as g1,(($4-$3)/$3)*100 as g2; 

--to find average 
avg = foreach growth1 generate $0, $1, $2, $3, $4, $5, $6, ROUND_TO(($5+ $6)/2,2) as avg;
-- avg > 10% 
final = filter avg by avg>10.00;
--avg less than 5%
final2 = filter avg by avg<-5.00;

order1 = foreach result generate $0, $1, $2, $3, $4, ($2+$3+$4) as totsales;

final3 = order order1 by $5 desc;  

