import builtins


def myFuction():
    print(dir(builtins))
    print('123'.strip('1'))
    print(type(range(-1, 10, 2)))


def main():
    myFuction()


if __name__ == '__main__':
    main()
