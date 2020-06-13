package com.wangh.code.base.yiibai.dir;

public class FindCurrentDirectory {
    public static void main(String[] args) {
        String curDir = System.getProperty("user.dir");
        System.out.println("You currently working in :" + curDir + " Directory");
    }
}
