package com.wangh.code.base.yiibai.collection;

import java.util.*;

public class ReadonlyCollection {
    public static void main(String[] argv) throws Exception {
        List<String> stuff = Arrays.asList(new String[] { "a", "b" });
        List<String> list = new ArrayList<String>(stuff);
        list = Collections.unmodifiableList(list);
        try {
            list.set(0, "new value");
        } catch (UnsupportedOperationException e) {
        }
        Set<String> set = new HashSet<String>(stuff);
        set = Collections.unmodifiableSet(set);
        Map<Object, Object> map = new HashMap<Object, Object>();
        map = Collections.unmodifiableMap(map);
        System.out.println("Collection is read-only now.");
    }
}
