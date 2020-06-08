from faker import Faker  # 导包
f = Faker(locale='zh_CN')              # 初始化,默认为en_US;Faker(locale='zh_CN')可使用简体中文，'zh_TW'为繁体

## 常用随机数据类型
f.name()                 # 姓名
f.address()              # 带邮编的地址
f.building_number()      # 楼名
f.city()                 # 完整城市名(市县)
f.city_name()            # 城市名字(不带市县)
f.city_suffix()          # 城市后缀名
f.country()              # 国家名称
f.district()             # 地区
f.postcode()             # 邮编
f.province()             # 省
f.street_address()       # 街道地址
f.street_name()          # 街道名称
f.street_suffix()        # 街道后缀名
