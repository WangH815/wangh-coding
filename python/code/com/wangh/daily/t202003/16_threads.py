from random import randint
from multiprocessing import Process
from os import getgid
from time import time, sleep

'''
无法调用 getpid(), 待解决
'''

def download_task(file_name):
    print('启动下载进程:{}'.format(getgid()))
    print('{}开始下载'.format(file_name))
    t = randint(5, 10)
    sleep(t)
    print('下载耗时{}s'.format(t))


def main():
    start = time()
    p1 = Process(target=download_task, args=('Java',))
    p1.start()
    p2 = Process(target=download_task, args=('Python',))
    p2.start()
    p1.join()
    p2.join()
    end = time()
    print('一共耗时{0:.2f}s'.format(end - start))


if __name__ == '__main__':
    main()
