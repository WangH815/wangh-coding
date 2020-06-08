grant all [privileges] on *.* to 'root'@'%' with grant option;   -- 给用户授所有权限,包括grant;%表示不限ip
grant all on *.* to 'root'@'localhost' with grant option;        -- 同上;localhost表示本地用户
grant proxy on ''@'' to 'root'@'localhost' with grant option;

grant select,insert on tb to 'user'@'ip' identified by 'passwd'; -- 使用 identified by 用户不存在会被创建
