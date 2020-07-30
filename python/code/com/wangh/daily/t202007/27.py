def main():
    print(27)
    for i in range(20):
        print(i, end=' ')
    print()

    name = ('ad', '23', 'sd')
    print(type(name))
    for i in name:
        print(i)

    i = 0
    while i < 10:
        i += 1
        if i % 2 == 0:
            continue
        print(i, end=' ')
    print()

    a = {}  # 空dict;推荐使用dict()
    a = {1}  # set;推荐使用set()
    a = ()  # 空tuple
    a = []  # 空list
    a = (1,)  # 单元素tuple

    print(type(a))
    print(a)


def fuc1(m, n):
    return m / n


def f1(m, n=2):  # n 为默认参数
    return m ** n


def f2(lists):
    return len(lists)


def f3(args):
    return type(args)


def f4(*args):  # 可变参数
    sum = 0
    for x in args:
        sum += x
    return sum


def f5(a, b, **c):  # 关键字参数，key-value方式;key为参数名称
    if 'key' in c:
        print(c)


def mySum(n):
    if not isinstance(n, int):
        print('n is not int.')
        return 0
    if n <= 0:
        return 0
    else:
        return n + mySum(n - 1)


if __name__ == '__main__':
    main()
    print(fuc1(n=2, m=10))
    print(f1(3))
    print(f2([1, 2, 3]))
    print(f3(1))
    print(f4(1, 2, 3))
    print(f4(1, 2, 3, 4))
    f5(1, 2, key=12, d=23)
    print(mySum(100))
    print([1, 2, 3][1:2])

    for x in '1234qawsrqwe':
        print(x, end=' ')
