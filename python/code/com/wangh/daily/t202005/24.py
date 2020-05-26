def main():
    a = list(n for n in range(10))
    b = a[:]
    b[0] = '0'
    print(a)
    print(b)

    myDict = {1: 11, 2: 22, 3: 33}
    for k in myDict:
        print(k)
    for k in myDict:
        print(myDict[k])
    for v in myDict.values():
        print(v)
    for k, v in myDict.items():
        print(k, v)

    for i, v in enumerate([1, 4, 6, 7, 9, 9]):
        print(i, v)

    for x in list(range(10)):
        print(x, end=" ")
    print()

    for x in [x * x for x in range(10)]:
        print(x, end=" ")
    print()

    for x in [x * x for x in range(10) if x % 2 == 0]:
        print(x, end=" ")
    print()

    for x in [[x, y] for x in range(10) for y in range(10)]:
        print(x, end=" ")
    print()

    for x in fib(10):
        print(x, end=' ')
    print()

    print(print.__name__)

    print(int('1010', base=2))   # 二进制字符串转十进制数

    print(__name__)   # 打印当前函数名

    import sys
    print(sys.path)


def fib(max):
    n, a, b = 0, 0, 1
    while n < max:
        yield b
        a, b = b, a + b
        n += 1


if __name__ == '__main__':
    main()
