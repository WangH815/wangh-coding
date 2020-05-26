import pymysql
from pymysql.cursors import DictCursor  # select需要


# 其他也类似
def mysql_insert():
    con = pymysql.connect(host='localhost', port=3306,
                          database='hrs', charset='utf8',
                          user='root', password='123456')
    try:
        with con.cursor() as cursor:
            result = cursor.execute('insert into tb_dept values (%s, %s, %s)',
                                    ('no', 'name', 'loc'))
        # 注释部分为select部分
        # with con.cursor(cursor=DictCursor) as cursor:
        #     cursor.execute('select dno as no, dname as name, dloc as loc from tb_dept')
        #     # 返回dic
        #     results = cursor.fetchall()
        #     print(results)
        #     print('编号\t名称\t\t所在地')
        #     for dept in results:
        #         print(dept['no'], end='\t')
        #         print(dept['name'], end='\t')
        #         print(dept['loc'])
        if result == 1:
            print('添加成功!')
        con.commit()
    finally:
        con.close()


def main():
    mysql_insert()


if __name__ == '__main__':
    main()
