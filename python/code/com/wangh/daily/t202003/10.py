import calendar
import datetime
import json

str = '1234123sdfgsd'

print(str.isalnum())
print(calendar.monthrange(2016, 2))
print(calendar.monthlen(2016, 2))

print(datetime.datetime.today())

mylist = [1, 2, 3, 4, 5, 6, 7, 8, 9, 0]
print(mylist)
print(mylist[-1])
print(mylist[0:-1])
print(mylist[0:-2])
print(mylist[1:-2])
print(mylist.index(5))
mylist.append(11)
print(mylist)
mylist.insert(11, 12)
print(mylist)
mylist.remove(12)
print(mylist)
print(mylist.pop())
print(mylist)
print([x ** 3 for x in mylist])
print([x ** 3 for x in mylist if x != 0])
print(mylist[::-1])

data = {'addr': '上海浦东新区',
        'email': 'example@163.com',
        'url': 'http://www.runoob.com'}

print(repr(data))
print(json.dumps(data))
print(json.loads(json.dumps(data)))