package com.wangh.base.yiibai.dir;

import java.io.File;

public class DisplayRootDirectories {
    public static void main(String[] args) {
        File[] roots = File.listRoots();
        System.out.println("Root directories in your system are:");

        for (int i = 0; i < roots.length; i++) {
            System.out.println(roots[i].toString());
        }
    }
}
