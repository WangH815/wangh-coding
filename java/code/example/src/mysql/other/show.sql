show databases [like 'pattern'];   -- 查询当前所有数据库;
show tables [like 'pattern'];      -- 查询当前数据库下所有表;前提是已经进入某个数据库
show tables from tb;               -- 显示指定数据库下数据表列表
show columns from tb;              -- 显示tb表字段信息(Field/Type/Null/Key/Default/Extra;等价于 desc tb
show grants for 'root'@'%';        -- 显示某个用户的权限;所有用户可使用 select user,host from mysql.user; 查询

show create database db;           -- 显示建库语句
show create table tb;              -- 显示建表语句

# 显示变量信息
show variables;                    -- 显示所有的变量
show variables like 'char%';       -- 显示字符集
show variables like 'collation%';  -- 显示排序字符集

show index from tb;               -- 显示索引信息
show table status from db;        -- 显示数据库/表的统计信息
show character set;               -- 显示支持的字符集
show processlist;                 -- 显示数据库连接情况

show status;                      -- 显示服务器状态
show grants;                      -- 显示当前用户权限
show errors;                      -- 显示错误信息
show warnings;                    -- 显示警告信息