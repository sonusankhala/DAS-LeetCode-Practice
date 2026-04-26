SELECT 
    ROUND(
        COUNT(a2.player_id) / (SELECT COUNT(DISTINCT player_id) FROM Activity), 
        2
    ) AS fraction
FROM (
    -- Step 1: Find the first login date for each player
    SELECT player_id, MIN(event_date) AS first_login
    FROM Activity
    GROUP BY player_id
) a1
-- Step 2: Left join to see if they logged in the next day
LEFT JOIN Activity a2 
    ON a1.player_id = a2.player_id 
    AND a2.event_date = DATE_ADD(a1.first_login, INTERVAL 1 DAY);
