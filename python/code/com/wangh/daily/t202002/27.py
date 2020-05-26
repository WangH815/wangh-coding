import re
import pymysql

line = 'qwnf aks difua  apseifqawoeadfqqqwweqw'
print(re.match('q', line))
print(re.search('qq', line))

db = pymysql.connect(host='192.168.88.99', port=3308, user='root', passwd='root')
cursor = db.cursor()
sql = 'select version();'
cursor.execute(sql)
data = cursor.fetchall()
print('Database version:{0}', data)
db.close()
