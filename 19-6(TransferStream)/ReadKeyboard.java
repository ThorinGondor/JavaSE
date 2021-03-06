/****
读取键盘录入：
System.out.println();是标准的输出设备：控制台。
System.in 这对应的是标准的输入设备：键盘。

需求：通过键盘输入数据。当录入一行数据时，就将该数据进行打印
如果录入的数据是over，就停止录入
****/
import java.io.*;

class ReadKeyboard
{
	public static void main(String[] args)throws IOException
	{
		InputStream IS = System.in;  //将键盘输入的内容进行读取
		StringBuilder SB = new StringBuilder(); //建立一个容器装载输入的数据
		while(true)
		{
			int ch = IS.read();
			if((char)ch=='*'){break;} //若输入为*;则跳出循环
			SB.append((char)ch);
			System.out.print((char)ch);	
		}
		System.out.println("SB:"+SB);
		
		IS.close();
	}
}
