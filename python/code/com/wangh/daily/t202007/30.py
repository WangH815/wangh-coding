import keyword
import os


def main():
    i = 1
    for x in keyword.kwlist:
        print(x, end=' ')
        i = i + 1
        if i % 6 == 0:
            print()

    # list
    l = [1, 2, 3]
    print(l)

    # tuple
    t = (1, 2, 3)
    print(t)

    # set
    s = {1, 4, 3, 4, 1, 2}
    print(s)

    # dict
    d = {1: 1, 2: 2}
    print(d)
    f()

    print([x for x in range(10)])
    print({x for x in range(10)})
    print((x for x in range(10)))  # 无法直接输出为tuple;生成器对象
    print([[x, 2 * x] for x in range(10)])

    for x in range(10):
        print('{0:d} {1:2d} {2:3d}'.format(x, x ** 2, x ** 3))

    try:
        0 / 0
    except:
        print(0)

    print(os.getcwd())
    print(dir(os))

def f():
    print('f')


if __name__ == '__main__':
    main()
