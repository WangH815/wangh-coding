package com.wangh.base.yiibai.string;

public class SearchStringEmp {
    public static void main(String[] args) {
        String strOrig = "Hoello, Suokidoa";
        int intIndex = strOrig.indexOf("o");

        if (intIndex == -1) {
            System.out.println("Su not found");
        } else {
            System.out.println("Found Su at index : " + intIndex);
        }
    }
}
