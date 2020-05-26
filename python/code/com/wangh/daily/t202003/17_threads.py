from random import randint
from threading import Thread
from time import time, sleep


class DownloadTask(Thread):
    def __init__(self, fileName):
        super().__init__()
        self._fileName = fileName

    def run(self):
        print('开始下载：{}'.format(self._fileName))
        t = randint(5, 10)
        sleep(t)
        print('下载耗时：{}s'.format(t))


def main():
    start = time()
    t1 = DownloadTask('Python')
    t1.start()
    t2 = DownloadTask('Java')
    t2.start()
    t1.join()
    t2.join()
    end = time()
    print('总共耗时{:.2f}s'.format(end - start))


if __name__ == '__main__':
    main()
