drop database db;              -- 删除数据库
drop table [db.]tb;            -- 删除数据表
drop user username@localhsot;  -- 删除用户;等价于delete from mysql.user where user = 'username' and host = 'localhost'
