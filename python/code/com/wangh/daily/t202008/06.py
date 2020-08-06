data = b'1 234dfasdf'  # 字节字符串;只支持ascii字符
print(data[1:2])

print(round(1.26, 1))
print(round(123, -2))
print(0.1 + 0.2)  # 不会显示0.3
print(format(0.1 + 0.2, '2.2f'))
print(bin(123))

import numpy as np

a = np.array([1, 2, 4])
print(a)

import random as rd

values = [1, 5, 9, 2, 7, 4, 8, 3, 0]
print(rd.choice(values))
print(rd.sample(values, 3))
