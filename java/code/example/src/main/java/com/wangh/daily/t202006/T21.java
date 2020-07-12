package com.wangh.daily.t202006;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.lang.Console;
import cn.hutool.core.text.csv.*;
import cn.hutool.core.util.CharsetUtil;
import cn.hutool.core.util.IdcardUtil;

import java.io.File;
import java.util.List;

public class T21 {
    public static void main(String[] args) {

        // csv写入
        File file = FileUtil.file("C:\\Users\\WangH\\Desktop\\test.csv");
        CsvWriter writer = CsvUtil.getWriter(file, CharsetUtil.CHARSET_UTF_8, true);
        writer.write(
                new String[]{"a1", "b1", "c1"},
                new String[]{"a2", "b2", "c2"},
                new String[]{"a3", "b3", "c3"}
        );

        // csv文本读取
        CsvReader reader = CsvUtil.getReader();
        CsvData data = reader.read(file);
        List<CsvRow> rows = data.getRows();
        for (CsvRow csvRow : rows) {
            Console.log(csvRow.getRawList());
        }

        String ID_18 = "321083197812162119";
        System.out.println(IdcardUtil.getProvinceByIdCard(ID_18));
    }
}
