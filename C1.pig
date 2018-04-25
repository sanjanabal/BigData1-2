retail = LOAD '/home/hduser/niit/dataretail'  USING PigStorage(';')  AS  (txndt, custid, age:chararray, pincode, category, product:chararray, qty, cost:long, sales:long);

retail = foreach retail generate TRIM($2) as age, TRIM($5) as product, $7, $8;

--retail = limit retail1 10;

groupbyprodage = group retail by (age,product);

profit = foreach groupbyprodage generate group, (SUM(retail.sales) - SUM(retail.cost));

flattengrp = foreach profit generate FLATTEN(group), $1;

A = filter flattengrp by $0 == 'A';

B = filter flattengrp by $0 == 'B';

C = filter flattengrp by $0 == 'C';

A = limit (order A by $2 desc) 5; 

B = limit (order B by $2 desc) 5; 

C = limit (order C by $2 desc) 5;

final = union A, B, C; 

final1 = order final by $0, $2 desc;

dump final1;


