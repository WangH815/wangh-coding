def main():
    print('main')


def sum(n):
    if isinstance(n, int):
        return 1
    else:
        return 0


if __name__ == '__main__':
    main()
    print(sum(10))
