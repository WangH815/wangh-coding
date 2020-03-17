from random import randint
from threading import Thread
from time import time, sleep


def download_task(file_name):
    print('开始下载{}'.format(file_name))
    t = randint(5, 10)
    sleep(t)
    print('下载耗时{}s'.format(t))


def main():
    start = time()
    p1 = Thread(target=download_task, args=('Java',))
    p1.start()
    p2 = Thread(target=download_task, args=('Python',))
    p2.start()
    p1.join()
    p2.join()
    end = time()
    print('一共耗时{0:.2f}s'.format(end - start))


if __name__ == '__main__':
    main()
