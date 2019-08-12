import re
import time
import collections

'''

'''


# 获取报表日期
def getReportDate():
    now_year = time.strftime('%Y', time.localtime())
    now_month = time.strftime('%m', time.localtime())
    if now_month == '01':
        report_date = str(int(now_year) - 1) + '12'
    else:
        report_date = now_year + str(int(now_month) - 1).zfill(2)
    return report_date


def main():
    try:
        with open(getReportDate() + '.txt', 'r', encoding='utf-8') as f:  # 只读模式打开文件
            contest1 = [i for i in f.readlines() if i.strip() != '']  # 逐行读取，去除空行
            for i in range(len(contest1)):
                contest1[i] = contest1[i].replace('\t', ' ')
                contest1[i] = contest1[i].replace('\n', '')
                contest1[i] = contest1[i].strip()
                contest1[i] = re.sub(' +', ' ', contest1[i])

            data_index = None
            mm = []
            new_mm = {}
            tmp = None
            data_index = contest1.index('jioyrq jiaoyl') + 1
            for i in range(data_index, len(contest1)):
                if contest1[i][:6] != getReportDate():
                    break
                else:
                    mm.append(contest1[i])
            mm.sort()
            for i in range(len(mm)):
               tmp = mm[i].split(' ', 1)
               new_mm[tmp[0]] = int(tmp[1])
            print(new_mm)
            print(len(new_mm))

    except FileNotFoundError:
        print('文件不存在...')
    except LookupError:
        print('指定文件编码错误...')
    except UnicodeDecodeError:
        print('文件解码错误...')
    finally:
        pass


if __name__ == '__main__':
    main()
