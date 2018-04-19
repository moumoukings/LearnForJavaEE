SELECT * FROM `student`；
USE stdb;
CREATE TABLE student(
	id INT PRIMARY KEY AUTO_INCREMENT,
	NAME VARCHAR(20),
	sex VARCHAR(20),
	score INT(10)
); 
INSERT INTO `stdb`.`student`(`name`,`sex`,`score`)
VALUES ('李少荣','女','80'),('邵凯','男','75'),
('周强','男','95'),('王晓婷','女','55'),('张秀花','女','68')
,('顾会','女','50'),('赵天一','男','32');
SELECT * FROM `student` WHERE sex='女' AND score>='80';	
-- 将姓张的男同学的的成绩改为100
UPDATE `student` SET `score`=68 WHERE NAME LIKE '张%' AND sex='男';
-- 查询成绩大于60的女性,显示姓名,性别,成绩
SELECT NAME,sex,score FROM student WHERE sex='女' AND score>'60';
-- 分别统计所有男同学的平均分，所有女同学的平均分及总平均分
SELECT AVG(score),sex FROM student GROUP BY sex;
-- 分数大于总平均分升序排列
SELECT * FROM student WHERE score>(SELECT AVG(score) FROM student) ORDER BY score;
-- 根据id查询学生信息
SELECT * FROM student WHERE id=1;
DROP TABLE student;