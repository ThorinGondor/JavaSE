/*****
RandomAccessFile
   该类不算是IO体系中的子类，而是直接继承自Object

   但它是IO包中的成员，因为它具备读写功能
   内部封装了一个数组，而且通过指针对数组中的元素进行操作。
   可以通过getFilePointer获取指针位置
   同时可以通过seek改变指针位置

   其实完成读写的原理就是内部封装了字节输入和输出流。
   
   通过构造函数可以看出，该类只能操作文件！
   而且操作文件还有模式。
   
   写入字符和int类：
   (1)RAF.write("xxx".getBytes());
   (2)RAF.writeInt(int类);
   
   读取字符和int类：
   (1)RAF.read(buffer);
      String str = new String(buffer);
   (2)RAF.readInt();
*****/

import java.io.*;
import java.util.*;
class RAFDemo //RandomAccessFile
{
	public static void main(String[] args)throws IOException
	{
		writeFile();  //RAF写入
		readFile();   //RAF读取
	}

	public static void writeFile()throws IOException
	{
		RandomAccessFile RAF = new RandomAccessFile("random.txt","rw"); //rw表示文件可读写\
		
		RAF.write("Curry".getBytes());   //getBytes() 将一个字符串转化为一个字节数组byte[]
		RAF.writeInt(452);               //防止数据丢失，靠谱起见，应使用writeInt()方法
		RAF.write("Green".getBytes()); 
		RAF.writeInt(658);
		//存放顺序：Curry452Green658
		RAF.close();
	}

	public static void readFile()throws IOException
	{
		RandomAccessFile RAF = new RandomAccessFile("random.txt","r");  //"r"表示该文件只读
		
		RAF.seek(9);
		byte[] buffer = new byte[5];//创建缓冲存放String类
		RAF.read(buffer); //需先读取String类到buffer
		String str = new String(buffer); //再将buffer内容转为String类
        int num = RAF.readInt();  //而int类型数据可直接读取

		System.out.println("str:"+str);
		System.out.println("num:"+num);
		RAF.close();
	}
}