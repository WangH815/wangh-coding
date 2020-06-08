insert into tb (col1,...,coln) values (value1,...,valuen);  -- 指定字段插入
insert into tb values (value1,...,valuen);                  -- 按照表字段顺序插入
insert into tb values (value1,...,valuen),                  -- 插入多组数据
                      (value1,...,valuen),
                      (value1,...,valuen);