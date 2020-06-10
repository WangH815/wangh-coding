-- 创建数据库
create database if not exists jdbctemplate;

-- 切换到数据库
use jdbctemplate;

-- 删除表
drop table student;

-- 创建表
create table if not exists student
(
    `id`   int(10) unsigned not null auto_increment,
    `name` varchar(100)     not null,
    `age`  int(10) unsigned not null,
    primary key (`id`)
) engine = innodb
  auto_increment = 1
  default charset = utf8mb4;
