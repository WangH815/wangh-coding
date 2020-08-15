import re

a = '1asdasdasdf阿斯顿发生as|而同人一天玩儿|输入个人'
b = '134251dfqr135ser24566zsfg56awserw3'

print(re.findall('[a-z]', a))  # 返回列表
print(re.findall('\d+', b))  # 返回连续数字
print(re.findall('\d?', b))  # 返回连续数字
print(len(re.findall('\d?', b)))  # 返回连续数字
print(len(b))

print(re.search('\d{2,}', b).group())
