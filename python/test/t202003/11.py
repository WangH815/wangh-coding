import sys
import os

str = 'ws'
num = 1
num1 = 10000000000

print(str.zfill(15))
print(str.index('w'))

mydic = {2: 1, 1: 2}
print(mydic[1])
print(sys.getsizeof(str))
print(sys.getsizeof(num))
print(sys.getsizeof(num1))


def fib(n):
    a, b = 0, 1
    for _ in range(n):
        a, b = b, a + b
        yield a


def main():
    for val in fib(20):
        print(val, end=' ')


if __name__ == '__main__':
    main()
print()


def is_leap(year):
    return year % 4 == 0 and year % 100 != 0 or year % 400 == 0


print(is_leap(2016))
