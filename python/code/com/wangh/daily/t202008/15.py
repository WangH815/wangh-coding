import pymysql

# mysql连接使用
db = pymysql.Connect(host='192.168.99.120',
                     port=3306,
                     user='root',
                     passwd='root',
                     db='test')

cursor = db.cursor()
cursor.execute('select version()')
print(cursor.fetchone())
db.close()
