import re


def check_qq(user_name, qq):
    m1 = re.match(r'^[0-9a-zA-Z_]{6,20}$', user_name)
    m2 = re.match(r'^[1-9]\d{4,11}$', qq)
    if m1 and m2:
        print('输入信息有效~')
    else:
        print('请输入正确的用户名或qq号....')


def main():
    check_qq('awegaf', '1256455343')


if __name__ == '__main__':
    main()

pt = re.compile(r'(?<=\D)1[34578]\d{9}(?=\D)')
str = '''
重要的事情说8130123456789遍，我的手机号是13512346789这个靓号，
不是15600998765，也是110或119，王大锤的手机号才是15600998765
13642328907
'''
mylist = re.findall(pt, str)
print(mylist)

for x in pt.finditer(str):
    print(x.group(), end=' ')

print()
st = '你丫是傻叉吗? 我操你大爷的. Fuck you.'
st1 = re.sub('[操肏艹]|fuck|shit|傻[比屄逼叉缺吊屌]|煞笔',
             '*', st, flags=re.IGNORECASE)
print(st1)

poem = '窗前明月光，疑是地上霜。举头望明月，低头思故乡。'
st_list = re.split(r'[，。, .]', poem)
while '' in st_list:
    st_list.remove('')
print(st_list)
