import xlrd

'''
读取Excel每个sheet的第一列和第二列的值,拼接成json串,写入文件

'''


def resolveExcel():
    # 获取excel文件
    data = xlrd.open_workbook("/you/excel/location/?.xlsx", encoding_override='utf-8')
    # 获取一个excel有多少个sheet
    sheetNames = list(data.sheet_names())
    print(sheetNames)
    # 写入目标文件位置
    with open('/aim/file/location/?.txt', "r+") as f:
        read_data = f.read()
        f.seek(0)
        f.truncate()  # 清空文件
    # 遍历sheet
    for name in sheetNames:
        # 获取sheet
        sheet = data.sheet_by_name(name)
        # 获取总行数
        nrows = sheet.nrows
        print(nrows)
        # 获取总列数
        ncols = sheet.ncols
        print(ncols)
        # 获取一行的数值
        # table.row_values(i)
        # 获取一列的数值
        key = sheet.col_values(0)
        chinese = sheet.col_values(1)

        # 获取具体单元格的值
        # cell_value = table.cell(0,1).value
        # print(cell_value)

        # 获取一个单元格的数值
        count = 1
        chineseStr = ""

        while count <= nrows - 1:
            chineseString = "\"" + key[count] + "\" = " + "\"" + chinese[count] + "\"" + ";\n"
            chineseStr = chineseStr + chineseString
            count = count + 1

        chinestfile = open('/aim/file/location/?.txt', 'a+', encoding='utf-8')
        chinestfile.write(chineseStr)


if __name__ == '__main__':
    resolveExcel()