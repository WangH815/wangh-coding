package com.wangh.base.yiibai.exception;

public class PrintStackTrace2 {
    public static void main(String[] args) {
        try {
            ExceptionFunc();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static void ExceptionFunc() throws Throwable {
        Throwable t = new Throwable("This is new Exception in Java...");

        StackTraceElement[] trace = new StackTraceElement[]{
                new StackTraceElement("ClassName", "methodName", "fileName", 5)};
        t.setStackTrace(trace);
        throw t;
    }
}
