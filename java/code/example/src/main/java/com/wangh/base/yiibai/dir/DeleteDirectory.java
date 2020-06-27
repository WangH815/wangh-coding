package com.wangh.base.yiibai.dir;

import java.io.File;

public class DeleteDirectory {
    public static void main(String[] argv) throws Exception {
        String deldir = "F:\\worksp\\javaexamples\\java_directories\\dir1";
        deleteDir(new File(deldir));
    }

    public static boolean deleteDir(File dir) {
        if (dir.isDirectory()) {
            String[] children = dir.list();
            for (int i = 0; i < children.length; i++) {
                boolean success = deleteDir(new File(dir, children[i]));

                if (!success) {
                    return false;
                }
            }
        }
        System.out.println("The directory is deleted.");
        return dir.delete();
    }
}
