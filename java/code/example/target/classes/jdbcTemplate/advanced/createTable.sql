create database if not exists jdbctemplate;

use jdbctemplate;

drop table student;
create table if not exists student
(
    `id`   int(10) unsigned not null auto_increment,
    `name` varchar(100)     not null,
    `age`  int(10) unsigned not null,
    primary key (`id`)
) engine = innodb
  auto_increment = 1
  default charset = utf8mb4;