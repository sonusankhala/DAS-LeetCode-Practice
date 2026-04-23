# Write your MySQL query statement below
Select 
si.user_id,
round(
    avg(
        case
            when action='confirmed' then 1
            else 0
        end
    ),
    2
) confirmation_rate
from Signups si
left join
Confirmations cn
on si.user_id=cn.user_id
group by user_id

