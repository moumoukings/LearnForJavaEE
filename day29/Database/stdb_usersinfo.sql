DROP DATABASE stdb;
CREATE DATABASE stdb;
USE stdb;
CREATE TABLE userinfo(
	id INT(10) PRIMARY KEY AUTO_INCREMENT,
	username VARCHAR(200),
	PASSWORD VARCHAR(200)
);    	
-- insert into userinfo(username,password) values('liuyan','123456'),('wangbaoqiang','123321'),('fangbian','abcd'),('miejueshitai','123abc321');

SELECT * FROM userinfo;