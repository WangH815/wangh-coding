package com.wangh.code.base.yiibai.file;

import java.io.File;
import java.io.IOException;

public class DeleteFileDemo {

	public static void main(String[] args) throws IOException {
		String s1 = "c:/tmp/java/";
		String s2 = "temp";
		
		long start = System.currentTimeMillis();
		myCreate(s1,s2);  //批量创建文件
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		
		File f = new File(s1);
		deleteDir(f);  //批量删除文件
	}
	
	public static void myCreate(String str1,String str2) throws IOException {
		File f1 = new File(str1);		
		f1.mkdirs();
		
		for (int i = 0; i < 10000; i++) {
			File f2 = new File(str1 + str2 + i + ".txt");
			f2.createNewFile();
		}
	}
	
	public static void deleteDir(File f) {
		File[] fs = f.listFiles();
		if(fs != null) {
			for (File f1 : fs) {
				if(f1.isDirectory())
				    deleteDir(f1);
				else
					f1.delete();
			}
		}
	}

}
