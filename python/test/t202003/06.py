a = '1234567890'
print(a[2:])
print(a[-2:])

a, b = 0, 1
while a < 10000:
    print(a, end=',')
    a, b = b, a + b

print()
print(18 ** 90)

for x in range(10):
    print(x, end=' ')
print()


def myadd(a1, a2=10):
    return a1 + a2


print(myadd(12, 20))

fs = [1, 2, 3, 4, 5]

print([x ** 2 for x in range(10)])

for x in range(10, 1, -2):
    print(x, end=',')
