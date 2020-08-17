import time

print(time.time())
print(time.localtime())

x = dict()
x[1] = 1
x[2] = 2
x[3] = 3
print(x)

x = [x for x in range(10)]
x = {x for x in range(10)}

print(type(x))
print(x)
