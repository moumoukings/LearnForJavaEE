CREATE TABLE users(
  id INT PRIMARY KEY AUTO_INCREMENT,
  username VARCHAR(100),
  PASSWORD VARCHAR(100)
);

-- 初始化数据
INSERT INTO `users`(username,PASSWORD) VALUES ('a','1'),('b','2');
DROP TABLE sort;
SELECT * FROM sort;