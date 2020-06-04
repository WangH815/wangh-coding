package com.wangh.code.leetcode.backup.p0001_0100;

public class L_0012_IntToRoman {
    public static void main(String[] args) {
        System.out.println(intToRoman1(123));
        System.out.println(intToRoman2(123));
        System.out.println(intToRoman3(123));
    }

    public static String intToRoman1(int num) {
        String r = "";
        int count = 0;
        while (num != 0) {
            int pop = num % 10;
            r = getRoman(pop, count) + r;
            count++;
            num /= 10;
        }
        return r;
    }

    public static String getRoman(int num, int count) { //count 表示当前的位数，个位，十位...
        char[] ten = {'I', 'X', 'C', 'M'}; //1,10,100,1000
        char[] five = {'V', 'L', 'D'};//5,50,500
        String r = "";
        if (num <= 3) {
            while (num != 0) {
                r += ten[count];
                num--;
            }
        }
        if (num == 4) {
            r = (ten[count] + "") + (five[count] + "");
        }
        if (num == 5) {
            r = five[count] + "";
        }
        if (num > 5 && num < 9) {
            r = five[count] + "";
            num -= 5;
            while (num != 0) {
                r += ten[count];
                num--;
            }
        }
        if (num == 9) {
            r = (ten[count] + "") + (ten[count + 1] + "");
        }
        return r;
    }

    public static String intToRoman2(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] strs = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                sb.append(strs[i]);
            }
        }
        return sb.toString();
    }

    public static String intToRoman3(int num) {
        String M[] = {"", "M", "MM", "MMM"};//0,1000,2000,3000
        String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};//0,100,200,300...
        String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};//0,10,20,30...
        String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};//0,1,2,3...
        return M[num / 1000] + C[(num % 1000) / 100] + X[(num % 100) / 10] + I[num % 10];
    }
}
