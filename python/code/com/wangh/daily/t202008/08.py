import os, math

for x in os.listdir('../'):
    print(x)

print(math.floor(123.6))
print(math.ceil(123.6))
print(0b101)
print(~0b101)
print(0b111)
print(~0b111)
print(-0b111)
print(~-0b111)
print(0b0)
print(~0b0)

print((123).to_bytes(2, byteorder='big'))

# 数字类型
x = int(12)
x = float(12)
x = complex(1, 2)
print(x)

print(str(bin(-123)))
print(float.hex(1.1))

print(hash(12))

print(sorted([1, 5, 1, 7, 8, 9, 0, 5, 8, 0]))

a = list()


