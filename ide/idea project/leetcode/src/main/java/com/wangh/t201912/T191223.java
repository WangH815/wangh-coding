package com.wangh.t201912;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class T191223 {

    public static void main(String[] args) throws IOException {
        File f = new File("test191223.txt");
        FileOutputStream fos = new FileOutputStream(f);
        OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");
        osw.append("asdfasd山东分公司\nsdgvfd山东分公司的");
        osw.close();


    }

}

class Parent implements InterfaceExample{
    public void asd(){}
}

class Son extends Parent{}    //继承


