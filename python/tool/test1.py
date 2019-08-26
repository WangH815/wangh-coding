import builtins


def myFuction():
    print(dir(builtins))
    print('123'.strip('1'))
    print(type(range(-1, 10, 2)))
    mylist = list(set(str(bin(id(x))) for x in range(-10000, 10000)))
    mylist.sort()
    print(mylist[0])
    print(mylist[1])
    print(mylist[2])
    print('-------------------------------------------------')
    print(bin(id(-1)))
    print(bin(id(0)))
    print(bin(id(257)))
    print(bin(id(258)))
    print(bin(0xFFFFFFFF))
    print(bin(0xF1400FFF))

    f = iter(fibonacci(1000003))
    for _ in range(1000000):
        next(f)
    print(next(f))
    print(next(f))
    print(next(f))


def fibonacci(n):  # 生成器函数 - 斐波那契
    a, b, counter = 0, 1, 0
    while True:
        if (counter > n):
            return
        yield a
        a, b = b, a + b
        counter += 1

def main():
    myFuction()


if __name__ == '__main__':
    main()
