/***
  本例需求：将Note的文本拷贝到destination文本当中。
  应先使用FileReader读出数据ch，再将ch强转成char类型用FileWriter写入destination文本
***/
import java.util.*;
import java.io.*;

class ReadPractice
{
	public  static void main(String[] args)throws IOException
	{
		FileReader FR = new FileReader("F:\\Note.txt");
		FileWriter FW = new FileWriter("F:\\Destination.java",true);
		while(true)
		{
			int ch = FR.read();  //读取Note的数据
			if(ch==-1){break;}   //如果读取到末尾则跳出循环
			
			FW.write((char)ch);  //将该数据放进IO输入流缓冲区
			FW.flush();          //从IO输入流缓冲区将数据传进文档destination
		    
			System.out.print((char)ch);
		}	
		FR.close();
		FW.close();
	}
}