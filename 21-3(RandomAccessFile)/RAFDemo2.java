/*****
RandomAccessFile
   该类不算是IO体系中的子类，而是直接继承自Object

   但它是IO包中的成员，因为它具备读写功能
   内部封装了一个数组，而且通过指针对数组中的元素进行操作。
   可以通过getFilePointer获取指针位置
   同时可以通过seek改变指针位置

   其实完成读写的原理就是内部封装了字节输入和输出流。
   
   通过构造函数可以看出，该类只能操作文件！
   而且操作文件还有模式:
   
   写入字符和int类：
   (1)RAF.write("xxx".getBytes());
   (2)RAF.writeInt(int类);
   
   读取字符和int类：
   (1)RAF.read(buffer);
      String str = new String(buffer);
   (2)RAF.readInt();

   该对象的构造函数要操作的文件如果存在，也不会对文件进行覆盖
*****/

import java.io.*;
import java.util.*;

class RAFDemo2
{
	public static void main(String[] args) throws IOException
	{
		writeFile();
		readFile();
	}

	public static void writeFile()throws IOException
	{
		RandomAccessFile RAF = new RandomAccessFile("random2.txt","rw");

        RAF.seek(8*0);
		RAF.write("周期".getBytes());
		RAF.writeInt(433);
		RAF.close();
	}
	public static void readFile()throws IOException
	{
		RandomAccessFile RAF = new RandomAccessFile("random2.txt","r");

		byte[] buffer = new byte[7];
		RAF.read(buffer);
		String str = new String(buffer);
		int num=RAF.readInt();
		System.out.println("str:"+str);
		System.out.println("num"+num);

		RAF.close();
	}
}
