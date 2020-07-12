package com.wangh.base.yiibai.array;

import java.util.ArrayList;
import java.util.List;

public class ArrayFindObject {
    @SuppressWarnings("unlikely-arg-type")
    public static void main(String[] args) {
        List<String> objArray = new ArrayList();
        List<String> objArray2 = new ArrayList();
        objArray2.add(0, "common1");
        objArray2.add(1, "common2");
        objArray2.add(2, "notcommon");
        objArray2.add(3, "notcommon1");
        objArray.add(0, "common1");
        objArray.add(1, "common2");
        System.out.println("Array elements of array1" + objArray);
        System.out.println("Array elements of array2" + objArray2);
        System.out.println("Array 1 contains String common2?? "
                + objArray.contains("common1"));
        System.out.println("Array 2 contains Array1?? "
                + objArray2.contains(objArray));
    }
}
