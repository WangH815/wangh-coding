package com.wangh.daily.t202007;

import java.time.LocalDate;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class T05 {
    public static void main(String[] args) {
        String str = LocalDate.now().toString() + "2020-01-01";

        // ?<year>为分组标签;从左至右依次对应1,2,3,...
        String regex = "(?<year>\\d{4})-(?<md>(?<month>\\d{2})-(?<date>\\d{2}))";

        // Pattern为正则表达式的编译表示
        Pattern pattern = Pattern.compile(regex);
        // 匹配数据
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            for (int i = 0; i <= matcher.groupCount(); i++) {
                System.out.println(matcher.group(i));
            }
        }

        matcher.reset();
        while (matcher.find()) {
            System.out.println(matcher.group(0));
        }

        List<Integer> intList = new MyArrayList(Arrays.asList(1, 2, 4, 6));
        System.out.println(intList);
        System.out.println(intList.get(1));

        int[] intArray = new int[]{1, 2, 3, 5};
        System.out.println(Arrays.toString(intArray));

        System.out.println(1.0 / 0);
    }
}

class MyArrayList<E> extends ArrayList<E> {

    public MyArrayList(Collection<? extends E> c) {
        super(c);
    }

    @Override
    public String toString() {
        Iterator<E> it = iterator();
        if (!it.hasNext())
//            return "[]";
            return "";

        StringBuilder sb = new StringBuilder();
//        sb.append('[');
        for (; ; ) {
            E e = it.next();
            sb.append(e == this ? "(this Collection)" : e);
            if (!it.hasNext())
//                return sb.append(']').toString();
                return sb.toString();
            sb.append(',').append(' ');
        }
    }

}
