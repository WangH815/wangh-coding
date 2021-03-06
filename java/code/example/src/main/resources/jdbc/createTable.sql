create database if not exists jdbc;

use jdbc;

drop table customer;

create table if not exists `customer`
(
    `Customer_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
    `NAME`        varchar(100)     NOT NULL,
    `AGE`         int(10) unsigned NOT NULL,
    PRIMARY KEY (`Customer_ID`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 1
  DEFAULT CHARSET = utf8mb4;
