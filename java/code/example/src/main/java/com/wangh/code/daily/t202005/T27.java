package com.wangh.code.daily.t202005;

import com.wangh.code.util.arrays;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static com.wangh.code.algorithm.sort.ArraySort.*;

public class T27 {
    public static void main(String[] args) {
        int[] intArray = arrays.intArrayRandomGenerator(10000, -7000, 7000);
        arrays.intArrayPrint(intArray);
        long start = System.currentTimeMillis();
        insertSort(intArray);
//        Arrays.sort(intArray);
        long end = System.currentTimeMillis();
        arrays.intArrayPrint(intArray);
        System.out.println("排序耗时：" + (end - start) + "ms");

        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);
        List<String> list = new ArrayList<>();
        for (ThreadInfo threadInfo : threadInfos) {
            list.add("[" + threadInfo.getThreadId() + "]" + threadInfo.getThreadName());
        }
        Collections.reverse(list);
        for (String str : list) {
            System.out.println(str);
        }
    }
}
