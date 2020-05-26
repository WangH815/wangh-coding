import calendar

print(max(1, 2, 3, 4))
print(max((1, 2, 3)))
print(max([1, 2, 3, 4]))


def is_prime(n):
    if n > 1:
        for i in range(2, int(n ** 0.5)):
            if n % i == 0:
                print('偶数')
                break
        else:
            print('质数')
    else:
        print('不是质数')


for x in range(100):
    print(x, end=':')
    is_prime(x)


def fac(n):
    if n <= 1:
        return 1
    else:
        return n * fac(n - 1)


print(fac(5))

for i in range(1, 10):
    for j in range(1, i + 1):
        print('{} * {} = {}  '.format(j, i, i * j), end='')
    print()


def fb(n):
    i, j = 0, 1
    reslut = []
    while i < n:
        reslut.append(i)
        i, j = j, i + j
    return reslut



print(fb(100))

print(bin(10))
print(oct(10))
print(hex(10))
print(ord('a'))
print(chr(100))
print(calendar.month(2020, 3))
