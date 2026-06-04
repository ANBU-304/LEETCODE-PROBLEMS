# Write your MySQL query statement below
select e.event_day as day , e.emp_id, SUM(e.out_time-e.in_time) as total_time from Employees e where e.emp_id = emp_id GROUP BY e.event_day ,emp_id;