/***
   前面例子是关于字符流File读写操作：
   FileReader();
   FileWriter();
   （加入）缓冲工具：
   BufferedReader();
   BufferedWriter();
   
   本例是字节流读写操作：
   InputStream
      |---FileInputStream(); 这个子类可以直接写入write(); 不需要刷新flush();
   OutputStream
      |---FileOutputStream();
   需求：想要操作图片数据，这时候就需要用到字节流。

   字节流操作的是字节类型byte，而字符流的数据是String类和char类
***/
import java.util.*;
import java.io.*;

class FileStream
{
	public static void main(String[] args)throws IOException 
	{
		write();
		read1();
		read2();
	}
    
	//写入字节的方法：File.OutputStream();
	public static void write()throws IOException
	{
		FileOutputStream FOS = new FileOutputStream("Demo.txt");
		FOS.write("Saber".getBytes());
		FOS.close();
	}

	//读取字节的方法1：FileInputStream();
	public static void read1()throws IOException
	{
		FileInputStream FIS = new FileInputStream("Demo.txt");
		while(true)
		{
			int ch = FIS.read();
		    if(ch==-1){break;}
			System.out.print((char)ch);
		}
		FIS.close();
	}

	//读取字节的方法2：使用FIS.available();来获取字符长度，从而可以利用该长度建立一个刚刚好的缓冲区，也就不用再循环了
	public static void read2()throws IOException
	{
		FileInputStream FIS = new FileInputStream("Demo.txt");
		byte[] buffer = new byte[FIS.available()];
		FIS.read(buffer);//将读取到的字节存到buffer缓冲区里面来
		System.out.println(new String(buffer)); //作为String类型进行输出
	}
}
