/***
    字符流的缓冲区：
	    缓冲区提高了对数据的读写效率
		在创建缓冲区【new BufferedWriter(FW);】之前，必须先创建IO流对象【例如：new FileWriter("XXX.txt");】
	    对应类：
	    
		|---BufferedWriter： 将文本写入字符输入流。缓冲各个字符，从而提供单个字符、数组、字符串的高效写入。
		                     该缓冲区的写入还提供了一个换行符功能：BW.newLine();
		
		|---BufferedReader： 从字符输入流中读取文本，缓冲各个字符，从而实现文本的高效读取
		                     缓冲区的读取还提供了一个功能：BR.readline();
	    
		综上，缓冲技术在IO流的基础上对IO流的功能进行了增强。
		
***/
import java.io.*;
import java.util.*;
class BuffReadDemo 
{
	public static void main(String[] args)throws IOException 
	{
		//还是要先去建立一个IO流的对象FileReader FR = new FileReader("xxx.txt");它与该txt相关联
		FileReader FR = new FileReader("Demo.txt");
		//为提高效率，再加入缓冲技术：
		//此时再建立一个缓冲对象BufferedReader，用该缓冲对象来读取数据，注意需要将对应的IO流对象添加进构造参数
		BufferedReader BR = new BufferedReader(FR);
		
		/*//原来IO流的读取方式为FR.read();一个一个数据地读取
		while(true)
		{
			int ch = BR.read();
			if(ch==-1){break;}
			System.out.print((char)ch);
		}
		*/
		//有了缓冲区读取技术提供的BR.readLine()；实现了一行一行地读取数据功能，效率提高
		while(true)
		{
			String str = BR.readLine();
			if(str==null)
			{break;}
			System.out.println(str);
		}
		BR.close();
	}
}
