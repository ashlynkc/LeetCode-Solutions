# Solution learned and followed by: https://www.youtube.com/watch?v=V0-33jrJgwo
# mySQL 
# LeetCode No. 196

# Please write a DELETE statement and DO NOT write a SELECT statement.
# Write your MySQL query statement below

DELETE p2
FROM Person p1 JOIN Person p2
ON p1.email = p2.email
AND p1.id < p2.id
