package com.wangh.base.yiibai.dir;

import java.io.File;

public class HiddenDirectory {
    public static void main(String[] args) {
        File file = new File("C:\\Boot");
        System.out.println(file.isHidden());
    }
}
