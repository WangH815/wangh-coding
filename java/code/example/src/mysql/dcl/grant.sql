
grant all [privileges] on *.* to 'root'@'%' with grant option;   -- 给用户授所有权限,包括grant;%表示不限ip
grant all on *.* to 'root'@'localhost' with grant option;        -- 同上;localhost表示本地用户
grant proxy on ''@'' to 'root'@'localhost' with grant option;

grant select,insert on tb to 'user'@'ip' identified by 'passwd'; -- 使用 identified by 用户不存在会被创建

flush privileges;     -- 刷新权限

# grant和revoke权限列表参见
13.7.1.4 GRANT Statement部分（Mysql 5.7）