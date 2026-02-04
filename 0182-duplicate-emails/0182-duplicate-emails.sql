# Write your MySQL query statement below
#select p.email as Email from Person p join Person e on p.id=e.id where p.email extent  e.email; 

select email as Email from Person group by email having(count(email)>1) ;
