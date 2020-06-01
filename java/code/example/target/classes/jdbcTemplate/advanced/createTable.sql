create database if not exists jdbcTemplate;

use jdbcTemplate;

drop table student;
create table if not exists student
(
    `id`   int(10) unsigned NOT NULL AUTO_INCREMENT,
    `name` varchar(100)     NOT NULL,
    `age`  int(10) unsigned NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 1
  DEFAULT CHARSET = utf8mb4;