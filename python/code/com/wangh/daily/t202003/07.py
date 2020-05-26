def fib(n):
    result = []
    a, b = 0, 1
    while a < n:
        result.append(a)
        a, b = b, a + b
    return result


print(fib(1000))
print(dir())

for x in range(1, 11):
    print('{0:2d} {1:3d} {2:4d}'.format(x, x ** 2, x ** 3))
