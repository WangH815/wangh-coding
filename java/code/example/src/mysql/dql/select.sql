# 数据库版本
-- MySQL 5.7


# 说明
## 对象           简写      含义
-- database_name  db/db1   数据库名称
-- table_name     tb/tb1   表名
-- column_name    col/col1 字段名
-- {m/n}                   必须项;m或n
-- [m/n]                   可选项;m或n
-- expr/expr1              表达式
-- conditions              条件表达式

# 数据类型

-- 整型
bit[(m)]           [0,2^65-1]         -- m表示最大二进制数位数(无符号),插入值位数小于m时,前面会补0显示;范围为[1,64];默认认为1;
                                      -- 在范围内的整数;对于bit(8)，100/0b111111/b'1111111'都是合法的
tinyint       1    [-128, 127]
smallint      2    [-32768, 32767]
mediumint     3    [-8388608, 8388607]
int           4    [-2147483648, 2147483647]   -- int也可使用integer; 常用
bigint        8    [-9.22E18, 9.22E18]

-- 浮点型
float[(m, d)]     4    -- 总位数为m,小数位为d;无参数是则提供最大精度,小数点后约7位
double[(m, d)]    8    -- 同上;最高精度约为小数点后约15位
decimal[(m[, d])] 8    -- m为精度,默认为10,最大为60;d为小数点后位数,默认为0,最大为30; 常用

-- 字符型
char(n)            -- 定长字符串,n表示字符数,最大为255;一次性分配,性能较好,可能会浪费空间; 常用
varchar(n)         -- 变长字符型,n为最长字符数,最大值受行最大长度(65535,所有行共享)的限制;按需分配,性能较差,但节约空间;
                   -- 会有1或2个字节存储该字段有多少字节的前缀;存储的字符前后有空格实际存储会被去除; 常用
tinyblob           -- 微型blog;最大255(2^8-1)字节;会有1个字节存储该字段有多少字节的前缀
tinytext           -- 微型文本;最大255字符(由字段字符编码决定);会有1个字节存储该字段有多少字节的前缀
blob[(m)]          -- 最大值65535(2^16-1)字节;m表示字节数;会有2个字节存储该字段有多少字节的前缀
text[(m)]          -- 单位为字符,其他同上
mediumblob         -- 最大字节为6,777,215(2^24-1);前缀为3个字节
mediumtext         -- 单位为字符,其他同上
longblob           -- 最大字节为4,294,967,295(2^32−1);前缀为4个字节
longtext           -- 单位为字符,其他同上
binary[(m)]        -- 定长字节型字符串;m默认为1;
varbinary(m)       -- 不定长字符串;m为最大字节数

-- 时间类型
time[(fsp)]       -- 时间;范围为['-838:59:59.000000','838:59:59.000000'];fsp表示秒小数点后精度(0-6),下同
date              -- 日期;格式为'YYYY-MM-DD',范围为 ['1000-01-01','9999-12-31']; 常用
datetime[(fsp)]   -- 日期时间;范围为['1000-01-01 00:00:00.000000','9999-12-31 23:59:59.999999'];
                  -- 格式为['YYYY-MM-DD HH:MM:SS[.fraction]]; 常用
timestamp[(fsp)]  -- 时间戳;与1970-01-01 00:00:00的时间差值,单位为秒;需考虑数据库时区,东八区则是与1970-01-01 08:00:00相比;
                  -- 显示范围为['1970-01-01 00:00:01.000000','2038-01-19 03:14:07.999999]; 常用
year[(4)]         -- 年份;范围为[1901,2155];MySQL 5.7.5之后不再支持year(2)

-- 复合类型
set('value1','value2',...)    -- 集合类型,限制定义列的值只能出现集合的子集合;最多64个成员
enum('value1','value2',...)   -- 枚举类型,限制定义列的值只能出现枚举值;最多65535(2^16-1)个成员;枚举列默认是有索引的

-- 空间数据类型                 -- 很少用到,暂不讨论

-- json数据类型                 -- MySQL 5.7.8开始支持
['a','b',...]    -- 数组
{'key':'value'}  -- json对象,键值对的形式,键不重复,可为字符串/数字/null/true/false;值可以为任意对象,包括数组和json对象的嵌套;



#   语法顺序
--  1.select [distinct]
--  2.from
--  3.join
--  4.on
--  5.where
--  6.group by
--  7.having
--  8.union [all]
--  9.order by [asc/desc]
-- 10.limit

#   执行顺序
--  1.from         # 查询单个查询对象(表或视图)
--  2.on           # 内/外连接条件
--  3.join         # 内/外连接表
--  4.where        # 过滤条件
--  5.group by     # 分组字段
--  6.having       # 结合group by使用;用于过滤聚合条件
--  7.select       # 显示字段/函数/计算表达式
--  8.distinct     # 取唯一值
--  9.union [all]  # 多个select语句连接;union all会显示所有记录
-- 10.order by     # 排序
-- 11.limit        # 截取数据记录


# 标准格式
SELECT
    [ALL | DISTINCT | DISTINCTROW ]
    [HIGH_PRIORITY]
    [STRAIGHT_JOIN]
    [SQL_SMALL_RESULT] [SQL_BIG_RESULT] [SQL_BUFFER_RESULT]
    [SQL_CACHE | SQL_NO_CACHE] [SQL_CALC_FOUND_ROWS]
    select_expr [, select_expr] ...
    [into_option]
    [FROM table_references
    [PARTITION partition_list]]
    [WHERE where_condition]
    [GROUP BY {col_name | expr | position}
    [ASC | DESC], ... [WITH ROLLUP]]
    [HAVING where_condition]
    [ORDER BY {col_name | expr | position}
    [ASC | DESC], ...]
    [LIMIT {[offset,] row_count | row_count OFFSET offset}]
    [PROCEDURE procedure_name(argument_list)]
    [into_option]
    [FOR UPDATE | LOCK IN SHARE MODE]
into_option: {
    INTO OUTFILE 'file_name'
        [CHARACTER SET charset_name]
        export_options
    | INTO DUMPFILE 'file_name'
    | INTO var_name [, var_name] ...
    }


# 示例
select 1 + 1;     -- 数学计算
select now();     -- 调用数据库函数
select col1, col2 from tb;                      -- 查询两个字段
select * into outfile 'path/data.txt' from tb;  -- 查询结果输出

## as
select col1 as alias, col2 from tb;      -- 字段和表都可以加别名;as可省略
select * from (select 1, 2, 3) as tb;    -- 子查询别名

## where
select col1, col2 from tb where col1 = 1 and col2 like '_a%';  -- 与条件
select col1, col2 from tb where col1 = 1 or col2 like '_a%';   -- 或条件

## like/rlike
[not] like 'pattern'  -- 基本正则匹配;扩展正则匹配使用regexp/rlike
%                     -- 任意数量字符
_                     -- 下划线;单个字符

[NOT] rlike           -- 扩展(正则)匹配
.                     -- 单个字符
[abc]                 -- 括号中任意字符
[a-c]                 -- 支持范围;同上;a-z,0-9等也是支持的
^                     -- 开头
$                     -- 结尾
{n}                   -- 重复{}前n个模式匹配

## limit
select * from tb limit m, n;              -- 从结果集的第m+1开始取n条记录
select * from tb limit m, n;              -- 从结果集的第m+1开始取n条记录
select * from tb limit n;                 -- 取前n条记录;等价于limit 0, n

## order by
select col1, clo2 from tb
order by col1 desc,col2 asc;              -- col1降序;col2升序,asc可省略

## group by having conditions
select col1,col2,sum(col3) as col from tb
group by col1,col2
having col > 100;

## join
### inner join                -- 内连接
select tb1.col1, tb2.col2
from tb1 [inner] join tb2
on tb1.id = tb2.id;

select tb1.col1, tb2.col2
from tb1, tb2
where tb1.id = tb2.id;        -- 同上

select tb1.col1, tb2.col2
from tb1 join tb2             -- join多表可使用 join(tb1, tb2, tb3)
using (id);                   -- 同上,使用using(col1, col2, col3)用于多表同名字段

select tb1.col1, tb2.col2
from tb1 natural join tb2;    -- 自然连接;会自动关联两表所有同名字段

## left [outer] join          -- 左外连接，简称左连接;其他join同理
select tb1.col1, tb2.col2
from tb1 left join tb2
on tb1.id = tb2.id;

## union [all]                 -- 多语句组合,要求每个select字段属性近似,显示以第一组别名为准;all表示保留重复值
select col1, col2 from tb1
union
select col1, col2 from tb2
union
select col1, col2 from tb3;

## 子查询    -- select子句作为一个结果集
select * from tb1 where col1 in (select col2 from t2);
select * from tb1 where col1 = (select max(col2) from t2);
select * from t1 where (col1,col2) = (select col1, col2 from t2);


# 查询函数             -- 部分支持不带小括号

## 数据库函数
select database();    -- 显示当前使用数据库
select version();     -- 显示数据库版本
select user();        -- 显示当前用户

# 字符串连接函数
select concat(col1,col2,col3);                -- 连接多个字段或字符串;不是字符串需先转换; 常用

## 时间日期函数
### 日期格式(date)      yyyy-MM-dd
### 时间格式(time)      hh:mm:ss/hh:mm         -- 秒小数点后最多可有十位精度,实际可使用6位
### 日期时间(datetime)  yyyy-MM-dd hh:mm:ss
### 时间戳(timestamp)   yyyy-MM-dd hh:mm:ss
select now([n]);                    -- 查询当前日期时间(语句开始执行时间);返回datetime;n表示秒小数点后位数,取值范围为[0, 6]
select current_timestamp([n]);      -- 同上;返回timestamp; 常用
select sysdate([n]);                -- 当前函数执行时的时间,其他同上
select current_date();              -- 查询当前日期;格式为: yyyy-MM-dd; 常用
select current_time();              -- 查询当前时间;格式为: hh:mm:ss
select unix_timestamp();            -- 查询unix时间戳,单位为s[int];当前时间与 1970-01-01 00:00:00 的差值;需要考虑时区
select from_unixtime(0);            -- unix时间戳转为日期时间格式格式

# 时间计算
select date_add({date/datetime}, interval n {day/year/...});   -- 日期或日期时间增加;interval意思为间隔;返回格式与第一个参数保持一致; 常用
select date_sub({date/datetime}, interval n {day/year/...});   -- 日期或日期时间减少; 常用
select datediff(date, date);        -- 日期差;左边日期减去右边日期,返回相差天数;参数只要可转化为 date 格式即可
select time_to_sec(time);           -- 时间格式转为秒;参数可转化为 time 即可
select sec_to_time(n);              -- 秒转为时间格式(hh:mm:ss);最大秒为 3020399
select date_format(date, format);   -- 日期格式化; 常用
select time_format(time, format);   -- 时间格式化
select str_to_date(str, format);    -- 字符串转日期

# if条件函数
select(expr1, expr2, expr3);        -- expr1为true时返回expr2的结果,否则为expr3的结果
select(num, expr2, expr3);          -- 数值型num为0或0.0表示false,其他为true
select(num = true, expr2, expr3);   -- num为1或1.0时表示成立，其他不成立
select(num = false, expr2, expr3);  -- 同select(num, expr2, expr3);


#
count(*)          -- 统计数据条数
min(col)/max(col) -- 最值;常用于子查询
avg(col)          -- 平均值
sum(col)          -- 求和
isnull(expr)      -- 空值判断
trim(col)         -- 去除左右空格
ltrim(col)        -- 去除左侧空格
rtrim(col)        -- 去除右侧空格
concat(col1,col2) -- 连接字符串