from faker import Faker

f = Faker('zh_CN')

mySet = set()
for _ in range(100):
    mySet.add(f.name())

print(f.address())
print(f.license_plate())
print(f.country_code(representation="alpha-2"))


