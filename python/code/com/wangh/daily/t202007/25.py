def main():
    info = '''Python解释器：
1.CPython（默认）
2.IPython（交互式增强）
3.Pypy（执行加速）
4.Jython（编译为Java字节码）
'''
    print(info)


if __name__ == '__main__':
    main()

    # 打印字符串
    print('asdfasd')  # 也可使用双引号
    print('asdfas', 'aeaf', '234')  # 多个字符串，会增加空格

    # 获取输入
    # msg = input()   # 回车结束输出,不识别转义
    # print(msg)

    # 转义
    print('\tasdfa\t123')

    var = 'a', 'b'  # 这种赋值默认为元组
    print(var)
    print(r'123')
    print(65 + 26 + 26)

    print(ord('A'))
    print(chr(66))
    print('asdf'.encode('ascii'))
    print('王'.encode('utf-8'))
    print('123'.format('%7d'))

    myList = [1, 2, 3]  # list
    print(myList)

    myTuple = (1, 2, 3)  # tuple
    print(myTuple)

    myTuple1 = ()
    print(type(myTuple1))

    if 1 < 2:
        print(1)
    elif 2 > 3:
        print(0)
    else:
        print('12')

