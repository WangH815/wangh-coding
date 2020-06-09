# 执行sql脚本
-- shell命令行执行并输出到指定文件
mysql -h host -u user -p < xx.sql > output.txt   -- 需要输入密码;这里的sql符合语法即可

-- 直接使用shell命令行
mysql -h host -u user -p <<!    -- 其他分隔符也可以;常见的还有 EOF
...                             -- sql语句
!                               -- 英文感叹号,必须顶格且之后无任何字符

-- mysql命令行执行脚本;shell脚本中调用mysql相关命令
./xx.sql > data.txt             -- 推荐此方式
sh xx.sql > data.txt            -- 同上