# mysql命令行执行;字段以制表符(tab)作为分隔符(\N表示空值)
# windows系统编辑过的文本的数据导入方式;Mac系统请使用 \r
load data local infile '/path/xx.txt' into table tb;
load data local infile '/path/xx.txt' into table tb lines terminated by '\r\n';