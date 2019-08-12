import time
import re


def getReportDate():
    # 获取年月
    now_date_year = time.strftime('%Y', time.localtime(time.time()))
    now_date_month = time.strftime('%m', time.localtime(time.time()))
    if now_date_month == '01':
        return str(int(now_date_year) - 1) + '12'  # 跨年处理
    else:
        return now_date_year + str(int(now_date_month) - 1).zfill(2)  # 月份格式化填充


def main():
    try:
        file_name = getReportDate() + '.txt'
        with open(file_name, 'r', encoding='utf-8') as f:
            list_context = []
            # 替换换行符、制表符、前后空格和多空格
            list_context = [re.sub(' +', ' ', i.replace('\n', '').replace('\t', ' ').strip())
                            for i in f.readlines() if i.strip() != '']

            dic = {}
            start_index = None
            end_index = None
            # 获取所需数据的下标
            start_index = list_context.index('11 22') + 1
            for i in range(start_index, len(list_context)):
                if list_context[i][:6] != getReportDate():
                    end_index = i
                    break
            # 获取所需数据
            list_data = list_context[start_index:end_index]
            list_data.sort()

            for i in list_data:
                tmp = None
                tmp = i.split(' ', 1)
                dic[tmp[0]] = int(tmp[1])
            print(dic)
            print(list_context)
    except FileNotFoundError:
        print('文件不存在...')
    except LookupError:
        print('指定文件编码错误...')
    except UnicodeDecodeError:
        print('文件解码错误...')


if __name__ == '__main__':
    main()
