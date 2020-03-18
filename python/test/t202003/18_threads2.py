from time import time


def main():
    total = 0
    number_list = [x for x in range(1, 1_0000_0001)]
    start = time()
    for number in number_list:
        total += number
    print(total)
    end = time()
    print('执行时间：{:.3f}s'.format(end - start))


if __name__ == '__main__':
    main()
