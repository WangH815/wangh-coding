package com.wangh.code.base.yiibai.array;

import java.util.ArrayList;
import java.util.List;

public class RemoveArrayElement {
    public static void main(String[] args) {
        List<String> objArray = new ArrayList<String>();
        objArray.clear();
        objArray.add(0, "0th element");
        objArray.add(1, "1st element");
        objArray.add(2, "2nd element");
        System.out.println("Array before removing an element" + objArray);
        objArray.remove(1);
        objArray.remove("0th element");
        System.out.println("Array after removing an element" + objArray);
    }
}
