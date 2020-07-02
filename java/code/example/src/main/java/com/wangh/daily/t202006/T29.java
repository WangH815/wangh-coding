package com.wangh.daily.t202006;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Random;
import java.util.logging.Logger;

public class T29 {
    public static void main(String[] args) throws SimpleException {
        // 新的日期时间
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println(localDate.getYear());

        System.out.println(LocalDate.of(2020, 1, 1));

        // 流式编程
        new Random(100)  // 取数范围
                .ints(10, 40)
                .distinct()  // 去重
                .limit(15)   // 取钱7个元素
                .sorted()    // 排序
                .forEach(System.out::println);

//        throw new SimpleException();

        try {
            throw new LoggingException();
        } catch (LoggingException e) {   // 捕获异常
            System.out.println("Caught " + e);
        }

    }
}

// 自定义异常类
class SimpleException extends Exception {
}

// 自定义异常类
class LoggingException extends Exception {
    private static Logger logger = Logger.getLogger("LoggingException");

    LoggingException() {
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}
