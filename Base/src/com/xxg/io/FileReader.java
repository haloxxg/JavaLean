package com.xxg.io;

import java.io.*;

public class FileReader {
	public static void main(String args[]) throws IOException{
		File f = new File("res/test.txt");
		InputStream in=new FileInputStream(f);
		byte[] b=new byte[1024];
		int len=in.read(b);
		in.close();
		System.out.println(FileReader.class.getResource(""));
		System.out.println(FileReader.class.getResource("."));
		System.out.println(FileReader.class.getResource("/"));//工程classpath路径，即bin
		System.out.println(FileReader.class.getClassLoader().getResource(""));//工程classpath路径，即bin
		System.out.println(System.getProperty("user.dir"));//工程路径
		System.out.println(System.getProperty("java.class.path"));//系统classpath路径
		System.out.println(new String(b,0,len));
	}
}
