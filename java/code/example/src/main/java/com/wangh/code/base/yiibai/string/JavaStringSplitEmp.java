package com.wangh.code.base.yiibai.string;

public class JavaStringSplitEmp {
    public static void main(String args[]) {
        String str = "this-is-my-dog";
        String[] temp;
        String[] temp2;
        String delimeter = "-";
        temp = str.split(delimeter);

        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }

        System.out.println("--------------- line -----------------");
        str = "max.min.avg.sum";
        delimeter = "\\.";
        temp2 = str.split(delimeter);
        for (int i = 0; i < temp2.length; i++) {
            System.out.println(temp2[i]);

        }
    }
}
