package com.wangh.base.yiibai.dir;

import java.io.File;

public class ParentDirectory {
    public static void main(String[] args) {
        File file = new File("F:\\worksp\\javaexamples\\java_directories\\myfile.txt");
        String strParentDirectory = file.getParent();
        System.out.println("Parent directory is : " + strParentDirectory);
    }
}
