from time import sleep
from threading import Thread


class Accout(object):
    def __init__(self):
        self._balance = 0

    def deposit(self, money):
        newBalance = self._balance + money  # 计算存款余额
        sleep(0.01)                         # 模拟存款耗时
        self._balance = newBalance

    @property
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
    print('账户余额为：¥{}'.format(account.balance))


if __name__ == '__main__':
    main()
