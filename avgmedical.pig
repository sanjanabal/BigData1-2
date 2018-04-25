medical = LOAD '/home/hduser/Downloads/medical' USING PigStorage() AS (name, dept, claim:double);

groupbyname = group medical by name;
groupbydept = group medical by dept;

group3 = foreach groupbyname generate group, medical.dept, ROUND_TO(AVG(medical.claim),1);




