show grants for 'root'@'%';
grant all privileges on *.* to 'root'@'%' with grant option;

show grants for 'root'@'localhost';
GRANT ALL PRIVILEGES ON *.* TO 'root'@'localhost' WITH GRANT OPTION;
GRANT PROXY ON ''@'' TO 'root'@'localhost' WITH GRANT OPTION;