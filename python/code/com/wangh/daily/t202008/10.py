import os
import time

with open('1.txt', 'wt') as f:  # 写入文件
    for x in range(20):
        f.write(str(x ** 2))
        f.write('\n')

with open('1.txt', 'rt') as f:  # 读取文件
    print(f.read())

os.remove('1.txt')  # 删除文件


def sumOfN(n):
    if n == 1:
        return 1
    else:
        return n + sumOfN(n - 1)


print(sumOfN(100))

print(time.time(), str(time.time())[-6:])
