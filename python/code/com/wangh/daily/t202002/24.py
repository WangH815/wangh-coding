from collections import deque
import sys

print(type(0))

print(str(1234123)[1:5:2])

print('1234'[::-1])
var = (1, 2, 3)
print(var[0])
print(len(var))

var = {1, 2, 3, 4}
var1 = {4, 5, 6}
print(var | var1)

var = {1: 2, 2: 3, 3: 4}
print(var.keys())

if 2 > 3:
    print('True')
else:
    print('False')

queue = deque(['aa', 'bb', 'cc'])
queue.append('dd')
print(queue)
queue.popleft()
print(queue)

print(list(range(2, 10, 2)))

print([x ** 2 for x in range(10)])

print([x * (x + 1) for x in range(1, 5)])

print(str(queue))

v1 = 1435122
v2 = 3673467
print(v1)
print('{1} {0}'.format(v1, v2))
