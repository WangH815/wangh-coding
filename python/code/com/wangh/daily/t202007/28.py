def main():
    l = [1, 2, 3, 4, 5]
    print(l[-1:1:-1])

    for i, value in enumerate([1, 3, 5, 7]):
        print(2 * i + 1, value)

    l = (2 * x + 1 for x in range(10))
    for x in l:
        print(x, end=' ')
    print()

    l = []
    for x in range(20):
        l.append(x ** 2)
    print(l)


def f(n):
    return n ** 2


if __name__ == '__main__':
    main()
    l = (1, 2, 3, 4)
    print(list(map(f, [x for x in range(10)])))
    print(list(map(f, l)))
