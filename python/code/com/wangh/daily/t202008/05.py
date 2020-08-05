import django

print(django.get_version())

# 可迭代对象解压
x = (1, 2, 3, 4)
y, *z, t = x
print(x, y, z, t)

x = [1, 5, 2, 6, 8, 2, 7, 23, 1, 6, 23]


def dedupe(items):
    seen = set()
    for item in items:
        if item not in seen:
            yield item  # 生成器;加入集合前输出
            seen.add(item)


print(list(dedupe(x)))

x = [1, 5, 12, 5, 2, 6, 1]

SLICE = slice(4, 2, -1)  # 切片表达式;主要用于切片较多的场景
print(x[SLICE])

rows = [
    {'fname': 'Brian', 'lname': 'Jones', 'uid': 1003},
    {'fname': 'David', 'lname': 'Beazley', 'uid': 1002},
    {'fname': 'John', 'lname': 'Cleese', 'uid': 1001},
    {'fname': 'Big', 'lname': 'Jones', 'uid': 1004}
]

from operator import itemgetter

print(rows)
print(sorted(rows, key=itemgetter('uid')))

# 过滤器
values = ['1', '2.1', '-3', '-', '4', 'N/A', '5']


def is_int(var):  # 过滤函数
    try:
        int(var)
        return True
    except ValueError:
        return False


print(list(filter(is_int, values)))
