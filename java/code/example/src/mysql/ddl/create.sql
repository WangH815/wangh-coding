create user test@localhost identified by 'passwd';  -- 创建本地用户;用户数据表为 mysql.user
create user wangh@'%' identified by 'wangh';        -- 创建无访问限制用户


create database [if not exists] db;    -- 创建数据库
create table [if not exists] tb;       -- 创建数据库

# 存储过程
create procedure proc_name(in inputparam varchar(255), inout inoutparam int)
begin
    declare z int;
    set z = inoutparam + 1;
    set inoutparam = z;
    select inputparam;
    select concat('zyxw', inputparam);
end