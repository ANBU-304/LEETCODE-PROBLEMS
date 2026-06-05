# Write your MySQL query statement below
select s.name from SalesPerson s where s.sales_id not IN( sELECT o.sales_id
    FROM Orders o
    JOIN Company c
        ON o.com_id = c.com_id
    WHERE c.name = 'RED'
     ); 