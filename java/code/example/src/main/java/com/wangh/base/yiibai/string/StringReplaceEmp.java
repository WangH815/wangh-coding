package com.wangh.base.yiibai.string;

public class StringReplaceEmp {
    public static void main(String args[]) {
        String str = "12121212121";
        System.out.println("Result 1:"+str.replace('W', 'H'));
        System.out.println("Result 2:"+str.replaceFirst("121", "A"));
        System.out.println("Result 3:"+str.replaceAll("121", "A"));
    }
}
