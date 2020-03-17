from time import sleep
from threading import Thread, Lock


class Accout(object):
    def __init__(self):
        self._balance = 0
        self._lock = Lock()

    def deposit(self, money):
        self._lock.acquire()                    # 获取锁
        try:
            newBalance = self._balance + money  # 计算存款余额
            sleep(0.01)                         # 模拟存款耗时
            self._balance = newBalance
        finally:
            self._lock.release()                # 释放锁

    @property        # 装饰器,用于将方法变成属性调用
    def balance(self):
        return self._balance


class AddMoneyThread(Thread):
    def __init__(self, account, money):
        super().__init__()
        self._account = account
        self._money = money

    def run(self):
        self._account.deposit(self._money)


def main():
    account = Accout()
    threads = []
    for _ in range(100):
        t = AddMoneyThread(account, 1)
        threads.append(t)
        t.start()
    for t in threads:
        t.join()
    print('账户余额为：¥{:.2f}'.format(account.balance))


if __name__ == '__main__':
    main()
