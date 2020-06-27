package com.wangh.daily.t202005;

import java.math.BigInteger;

/**
 * T22
 *
 * @author WangH
 * @create 2020-05-22 01:30
 */
public class T22 {
    public static void main(String[] args) {
        int myInt = 123_123_234;
        char charA = '\u005B';
        char charB = '\u005D';
        float f = 1.1f;
        String str = "dcasdf";
        System.out.println("Hello World!" + myInt);
        System.out.println(String.valueOf(charA) + String.valueOf(charB));
        System.out.println(f);
        System.out.println(str.length());

        BigInteger bi1 = new BigInteger("1230975678423652345234623462345623");
        BigInteger bi2 = new BigInteger("23230975678423652345234623462345623");
        System.out.println(bi1.add(bi2));

        for (int i : new int[]{1, 2, 3, 5, 7, 9}) {
            System.out.println(i);
        }

        System.out.println(args);
        new T22().myPrint();

        int[] is = {0,1};
        int[] is2 =is;
        System.out.println(is2[1]);

        is[1] = 5;
        System.out.println(is2[1]);
//        main(new String[]{});     // 会导致栈溢出

        int ii =11;
        myInt(ii);
        System.out.println(ii);
    }

    /**
     * 其他类中构建的实例无法访问
     */
    private void myPrint(){
        System.out.println("hello");
    }

    static void myInt(int i){
        i = 22;
    }
    
}
