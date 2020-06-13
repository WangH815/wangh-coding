package com.wangh.code.util;

import java.io.File;
import java.io.IOException;

public class Files {

    private Files() {
    }


    public static void createFiles(String path, String prefix, int fileNum) throws IOException {
        File f1 = new File(path);
        f1.mkdirs();

        for (int i = 1; i < fileNum + 1; i++) {
            File f2 = new File(path + prefix + i + ".txt");
            f2.createNewFile();
        }
    }

    public static void deleteDirOrFile(File f) {
        File[] fs = f.listFiles();
        if (fs != null) {
            for (File f1 : fs) {
                if (f1.isDirectory())
                    deleteDirOrFile(f1);
                else
                    f1.delete();
            }
        }
    }
}
