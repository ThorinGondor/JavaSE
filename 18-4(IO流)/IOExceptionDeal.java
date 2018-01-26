/***
   IO流概述：
   （1）IO流可处理设备之间的数据传输。
   （2）Java用于操作流的对象都在IO包中。
   （3）流按照数据分为两种，字节流和字符流。
   （4）流按照流向分为：输出流，输入流

   IO流常用基类：
   （1）字节流常用两个基类：InputStream、OutputStream
    (2) 字符流两个基类：Reader、Writer
***/
/***
    上一例介绍字符流：Reader和Writer。
    先以操作文件为主来演示：
	需求：在硬盘上创建一个文件并写入一些文字数据？

	有一个专门用于操作文件的Writer子类对象：FileWriter
	创建和写入方法：
	FileWriter FW = new FileWriter("Diary.txt"); 
	FW.writre(str);
	FW.flush();
	FW.write(str);
	FW.flush();
	.......
	FW.close();

	本例介绍IOException异常的处理方式：

***/
import java.io.*;
import java.util.*;

class IOExceptionDeal
{
	public static void main(String[] agrs)throws IOException
	{
		FileWriter FW = null;
		try
		{
		    FW = new FileWriter("K:\\IOExceptionDeal.txt");   
		    /***通过字符流传递数据***/
		    FW.write("ABCDE");  //write(str); 将该字符串写入了IO流当中
		    FW.flush();         //刷新该IO流的缓冲区，将缓冲区的数据存到目的文件里去
		    FW.write("GHIJK");
		    FW.flush();
		    FW.write("LMNOP");
		    FW.flush();
		    
		}
		catch (IOException IOE)
		{
			System.out.println("发生异常:"+IOE.toString());
		}
		finally
		{
			/***如果没发生异常，成功创建IO流，才可关闭该IO流***/
		    if(FW!=null)
			{FW.close();}
			System.out.println("OVER");
		}
	}
}