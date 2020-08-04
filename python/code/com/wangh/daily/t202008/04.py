my_dict = {1: 1, 2: 2, 3: (1, 2)}
print(my_dict)
del (my_dict[2])
print(my_dict)
print(my_dict.items())

import calendar, sys

print(calendar.month(2020, 8))
print(dir(sys))

print(int("123" * 3) * 3)
print(int("123", 4))

print(hex(65))
print(ord('A'))
print(oct(12))
print(bin(12))

import time
import datetime


# start = datetime.datetime.now()
# time.sleep(1)
# end = datetime.datetime.now()
# print((end - start))
# print(time.time())
# print(time.time_ns())
# print(time.localtime())


# 函数定义
def f():  # 无参函数
    pass


def f1(x):  # 必须参数
    pass


def f2(x, y):  # 两个参数
    pass


def f3(x, y=12):  # y为默认参数，调用时可不传入
    pass


def f4(x, *y):  # y为可变参数，函数调用时后面参数组合为一个tuple
    print(x, y)


f4(1, 2, 3, 4, [5, 6])

with open('./1.txt', 'w+') as f:
    f.write('123\n34523\n13425ase\n')
    print(f.tell())  # 判断游标位置
    f.seek(0, 0)  # 移动游标至第一行行首
    print(f.read())

import os

os.remove('./1.txt')
print(os.getcwd())

import threading
import time

exitFlag = 0


# 多线程步骤
# 1.创建多线程类，继承threading.Thread
# 2.覆盖__init __(self [，args])方法添加其他参数
# 3.重写run(self [, args]);运行逻辑
class MyThread(threading.Thread):
    def __init__(self, threadID, name, counter):
        threading.Thread.__init__(self)
        self.threadID = threadID
        self.name = name
        self.counter = counter

    def run(self):
        print("Starting " + self.name)
        print_time(self.name, self.counter, 5)
        print("Exiting " + self.name)


def print_time(threadName, delay, counter):
    while counter:
        if exitFlag:
            threadName.exit()
        time.sleep(delay)
        print("%s: %s" % (threadName, time.ctime(time.time())))
        counter -= 1

# Create new threads
thread1 = MyThread(1, "Thread-1", 1)
thread2 = MyThread(2, "Thread-2", 2)

# Start new Threads
thread1.start()
thread2.start()
thread1.join()
thread2.join()
print("Exiting Main Thread")
