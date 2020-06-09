alter user username@localhost identified by 'newpasswd';  -- 修改用户密码

# 修改数据库表字符集
alter database db character set utf8mb4 collate utf8mb4_unicode_ci;
alter table tb convert to character set utf8mb4 collate utf8mb4_unicode_ci;


