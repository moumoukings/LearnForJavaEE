CREATE TABLE Test(
	id INT PRIMARY KEY AUTO_INCREMENT,
	sname VARCHAR(20) NOT NULL,
	age INT NOT NULL,
	score DOUBLE NOT NULL,
	classroom VARCHAR(20) NOT NULL
);
-- 给学生表中添加10条数据,逐渐自动增长
INSERT INTO Test (id,sname,age,score,classroom) VALUES (1,'张三01',10,80,'一班'),(2,'张三02',11,82,'一班'),
(3,'张三03',12,82,'二班'),(4,'张三04',13,83,'一班'),(5,'张三05',14,84,'一班'),
(6,'张三06',15,85,'一班'),(7,'张三07',16,86,'二班'),(8,'张三08',17,87,'一班'),
(9,'张三09',18,88,'二班'),(10,'张三10',19,89,'一班');
-- 删除表
DROP TABLE `test`;
-- 删除表中元素
DELETE FROM `Test`;
-- 测试修改表的结构
ALTER TABLE `test` MODIFY classroom VARCHAR(15) NOT NULL;
-- 删除一条数据
DELETE FROM `test` WHERE id = 10;
-- 按照成绩降序输出
SELECT * FROM `test` ORDER BY score DESC; 
-- 统计所有总成绩和平均成绩
SELECT SUM(score) FROM `test`;
SELECT AVG(score) FROM `test`;
-- 统计不同班级的总成绩和平均成绩
SELECT SUM(score),classroom FROM `test` GROUP BY classroom;
SELECT AVG(score),classroom FROM `test` GROUP BY classroom;