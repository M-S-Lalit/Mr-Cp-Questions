CREATE TABLE Users{
    user_id INT PRIMARY KEY,
    username VARCHAR(50) UNIQUE NOT NULL
};
CREATE TABLE Steps(
    step_id INT PRIMARY KEY,
    user_id INT,
    steps_count INT,
    step_date DATE,
    FOREIGN KEY (user_id) REFERENCES Users(user_id)
)


SELECT
    EXTRACT(YEAR FROM step_date) AS year,
    EXTRACT(MONTH FROM step_date) AS month,
    AVG(steps_count) AS avg_steps
FROM Steps
WHERE step_date >= DATE_SUB(CURRENT_DATE, INTERVAL 1 YEAR)
GROUP BY year, month
ORDER BY year, month;
