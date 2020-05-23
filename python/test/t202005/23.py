import math


def main():
    print("100 + 200: ", 100 + 200)
    print("hello python...")
    # name = input()
    # print(name)

    print('I\'m \"OK\"!')

    print(r'123asd\sdgbs\\bzseg\a\'fv\\')  # 非转义字符串;还是有部分限制，可以自行测试

    print(True)
    aa = []
    print(aa)

    aa = 123
    print(type(aa))
    aa = '123'
    print(type(aa))

    aa = [1, 2, 3]
    print(type(aa))

    bb = aa  # 指向aa列表的引用
    print(type(bb))
    bb[0] = 11  # 修改会影响aa指向的列表
    print(aa)

    # 获取单字符的十进制数表示
    print(ord('A'))
    print(ord('王'))

    # ord的反向操作
    print(chr(29579))
    print(chr(ord('王')))

    # 字节流字符串,<class 'bytes'>;不能出现单字节字符串
    print(b'asdf')
    print(type(b'asdf'))

    # 字符串转字节流编码;简称编码(按指定编码格式编码)
    print('ACB'.encode('ascii'))
    print('ABC'.encode('utf-8'))

    # print('中文'.encode('ascii'))  # 中文字符不吃支持按Ascii编码
    print('中文'.encode('utf-8'))  # 返回两组十六进制编码;utf-8中文编码一般占3个字节
    print('中文'.encode('gb2312'))  # 返回两组十六进制编码;gb2312中文占2字节

    # 字符长度
    print(len('中文'))  # 按照字符编码返回字符长度

    myList = [1, 24, 5, 'aadsf', 'aef']
    print(myList)
    for x in myList:
        print(x, end=' ')
    print()

    print(myList[-1])
    myList.append(12)
    myList.insert(1, 11)
    myList.insert(len(myList), 1234)
    print(myList)

    myTuple = (1, 2, 3, [4, 5])
    myTuple[3].pop()
    print(myTuple)

    for x in range(10):
        print(x)

    mySet = {1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 5, 34, 6, 34, 2,
             34, 7, 34, 5, 3647, 345, 4, 134, 52, 34, 134}
    print(mySet)

    print(set([1, 2, 3, 3, 2, 4]))

    print(mySum(10))

    print(abs(-123))

    print(bool(0))

    print(math.pi)

    print(fact(10))
    print(fact(100))

    myList = []
    n = 1
    while n < 100:
        myList.append(n)
        n += 2

    for x in myList:
        print(x)

    l = [1, 2, 3, 4, 5, 6, 7, 8, 9]
    print(l[1:5])    # 返回索引 [1, 5)的子序列
    print(l[1:])
    print(l[:5])
    print(l[::-1])
    print(l[9:1:-1])

    print(set(range(100)))
    print(list(range(20)))
    print(list(range(20))[::5])


def mySum(n):
    count = 0
    for x in range(n + 1):
        count += x
    return count


def fact(n):
    if n == 1:
        return 1
    return n + fact(n - 1)


# def func(arg)     # 必选参数
# def func(arg='n') # 默认参数
# def func(*args)   # 可变参数;tuple参数
# def func(**args)  # 关键字参数;dic参数


if __name__ == '__main__':
    main()
