import json
from datetime import date
import logging
from array import array
from decimal import *
import cmath
import random

x = json.dumps([1, 'aed', 'asdsd'])
print(x)

# while True:
#     try:
#         x = int(input('please enter a number:'))
#         break
#     except ValueError:
#         print('errror')

print('sfdasdasdfasd'.replace('a', 'A'))

print(date.today())

logging.debug('Debugging information')
logging.info('Informational message')
logging.warning('Warning:config file %s not found', 'server.conf')
logging.error('Error occurred')
logging.critical('Critical error -- shutting down')

arr = array('H', [123, 345, 123, 4564])
print(sum(arr))

print(Decimal(0.125))
print(1 / 10)

print('hello python3')

print('{0} * {1} = {2}'.format(10, 12, 10 * 12))

print(12 ** 0.5)

print(cmath.sqrt(-1 + 1j))  #

print(random.randint(1, 99))

num = 10
if num % 2 == 0:
    print('偶数')
else:
    print('奇数')

num = 2012

