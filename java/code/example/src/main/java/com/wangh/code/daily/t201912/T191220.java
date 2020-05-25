package com.wangh.code.daily.t201912;

public class T191220 {
    private boolean myFlag;
    static final double weeks = 9.5;
    protected static final int BOXWIDTH = 42;

    public static void main(String[] args) {
        int i = 10;
        while (i < 20) {
            System.out.println("i value:" + i++);
        }

        int j = 10;
        do {
            System.out.println("do while:" + j++);
        } while (j < 20);

        for (i = 1; i < 10; i++) {
            System.out.println("for i:" + i);
        }

        int[] num = {12, 13, 56, 75};
        for (int k : num) {
            System.out.println(k);
        }

        switch (i) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            default:
                System.out.println(20);
        }

        System.out.println(Math.sin(0.1));

        System.out.println(Math.ceil(-0.3));
        System.out.println(Math.round(-0.3));

        System.out.println("asd瓦".length());

        StringBuffer sb = new StringBuffer();
        sb.append(1);
        sb.append(2);
        sb.append("a");
        sb.append('b');
        System.out.println(sb);

    }
}
