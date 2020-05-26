import sys
import os
import glob

try:
    f = open('1.txt')
    s = f.readline()
    i = int(s.split())
except OSError as err:
    print('OS error:{0}'.format(err))
except ValueError:
    print('ValueError...')
except:
    print('Unexpected error', sys.exc_info()[0])
    raise


class MyError(Exception):
    def __init__(self, value):
        self.value = value

    def __str__(self):
        return repr(self.value)


try:
    raise MyError(2 ** 2)
except MyError as e:
    print('MyError', e.value)


class people:
    name = ''
    age = 0
    __weight = 0

    def __init__(self, n, a, w):
        self.name = n
        self.age = a
        self.__weight = w

    def speak(self):
        print('{0}说：我{1}岁'.format(self.name, self.age))


p = people('wangh', 10, 30)
p.speak()

print(dir(os))

print(glob.glob('../*/*.py'))

