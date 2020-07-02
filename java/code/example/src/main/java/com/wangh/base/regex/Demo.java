package com.wangh.base.regex;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 参考：
 * https://www.runoob.com/java/java-regular-expressions.html
 * https://www.runoob.com/w3cnote/java-capture-group.html
 * <p>
 * 正则表达式定义了字符串的模式
 * 正则表达式可以用来搜索、编辑或处理文本
 * 正则表达式并不仅限于某一种语言，但是在每种语言中有细微的差别
 * <p>
 * 捕获组(capture group):
 * 1.普通捕获组(Expression);从左至右按括号区分命名组,组0为整个表达式 m,.mn
 * 2.命名捕获组(?Expression)
 * 3.非捕获组(基本用不上)
 */
public class Demo {
    public static void main(String[] args) {
        String str = LocalDate.now().toString() + "1234\n"
                + LocalDate.now().plusDays(1).toString();
        // 普通捕获组
//        String regex = "(\\d{4})-((\\d{2})-(\\d{2}))";
        // 命名捕获组
        String regex = "(?<year>\\d{4})-(?<md>(?<month>\\d{2})-(?<date>\\d{2}))";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            for (int i = 0; i <= matcher.groupCount(); i++) {
                System.out.println(matcher.group(i));
            }
        }
    }
}
