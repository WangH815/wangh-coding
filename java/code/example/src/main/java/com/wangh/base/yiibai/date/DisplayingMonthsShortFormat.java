package com.wangh.base.yiibai.date;

import java.text.DateFormatSymbols;

public class DisplayingMonthsShortFormat {
    public static void main(String[] args) {
        String[] shortMonths = new DateFormatSymbols().getShortMonths();

        for (int i = 0; i < (shortMonths.length - 1); i++) {
            String shortMonth = shortMonths[i];
            System.out.println("shortMonth = " + shortMonth);
        }
    }
}
