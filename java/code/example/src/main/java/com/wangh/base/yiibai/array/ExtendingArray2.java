package com.wangh.base.yiibai.array;

public class ExtendingArray2 {
    public void extendArraySize() {
        String[] names = new String[]{"Maxsu", "Minsu", "Sum"};
        String[] extended = new String[5];
        extended[3] = "Sukida";
        extended[4] = "Avg";
        System.arraycopy(names, 0, extended, 0, names.length);

        for (String str : extended)
            System.out.println(str);
    }

    public static void main(String[] args) {
        new ExtendingArray2().extendArraySize();
    }
}
