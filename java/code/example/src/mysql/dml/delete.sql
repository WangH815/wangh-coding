delete from tb where conditions;     -- 删除数据表
delete from db where conditions;     -- 删除数据库
delete from mysql.user               -- 删除用户;等价于drop user username@localhsot
where user = 'username' and host = 'localhost';
