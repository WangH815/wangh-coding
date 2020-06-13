package com.wangh.code.util;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ScatteringByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.channels.FileChannel;
import java.nio.channels.GatheringByteChannel;

public class ScatterGatherIO {
	public static void main(String params[]) throws IOException {
		String data = "Scattering and Gathering example shown in wangh.com王";
		scattergGatherBytes(data);
		
		multichannelDataTransmission();
	}

	// 从缓冲中读取数据写入到文件
	public static void scattergGatherBytes(String data) throws IOException {
		String Path = System.getProperty("user.dir") + "/testout.txt"; // 设置文件路径
		ByteBuffer bb1 = ByteBuffer.allocate(80); // 设置一个80字节随机数缓冲
		ByteBuffer bb2 = ByteBuffer.allocate(400); // 设置一个400字节的待写入缓冲
		bb1.asIntBuffer().put(4200); // 将420写入缓冲区
		bb2.asCharBuffer().put(data); // 将data写入缓冲区
		FileOutputStream fos = new FileOutputStream(Path);
		// 创建文件写入聚集通道
		GatheringByteChannel gatherer = fos.getChannel();
		// 将两个缓冲区内容写入到文件
		gatherer.write(new ByteBuffer[] { bb1, bb2 });
		System.out.println("缓冲写入文件成功...");
		fos.close();

		bb1.clear(); // 清空缓冲区数据，指针设为0，为写入数据做准备
		bb2.clear();

		FileInputStream fis = new FileInputStream(Path);
		ScatteringByteChannel scatter = fis.getChannel(); // 获取文件分散通道
		scatter.read(new ByteBuffer[] { bb1, bb2 }); // 将数据分散到两个缓冲中

		bb1.rewind(); // 指针设为0，为读取数据做准备
		bb2.rewind();

		int bufferOne = bb1.asIntBuffer().get();
		String bufferTwo = bb2.asCharBuffer().toString();
		System.out.println(bufferOne);
		System.out.println(bufferTwo);
		System.out.println("缓冲读取成功...");
		fis.close();
	}

	// 多通道间数据传输，实现多文件合并
	public static void multichannelDataTransmission() throws IOException {
		String relativelyPath = System.getProperty("user.dir");
		// 设置输入文件路径
		String[] inputFiles = new String[] { relativelyPath + "/input1.txt", 
											 relativelyPath + "/input2.txt",
											 relativelyPath + "/input3.txt", 
											 relativelyPath + "/input4.txt" };
		String outputFile = relativelyPath + "/combine_output.txt";  //设置输入文件路径
		FileOutputStream fos = new FileOutputStream(new File(outputFile));	
		WritableByteChannel targetChannel = fos.getChannel();  //输出文件写入通道
		for (int j = 0; j < inputFiles.length; j++) {
			FileInputStream fis = new FileInputStream(inputFiles[j]);
			FileChannel inputChannel = fis.getChannel();  //输入文件通道
			//将输入文件数据追加到输出文件中
			inputChannel.transferTo(0, inputChannel.size(), targetChannel);
			inputChannel.close();
			fis.close();
		}
		targetChannel.close();
		fos.close();
		System.out.println("文件合并成功...");
	}

}
