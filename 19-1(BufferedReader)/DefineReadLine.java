
/***
   BufferedReader 的readLine()的方法理解以后，可以自定义一个类中包含一个功能和readLine一致，来模拟一下BufferedReader
   注：Jva自带的BufferedReader或者自定义的MyBufferedReader里使用装饰类的方法，装饰的是FileReader，增强其功能
***/
import java.io.*;
import java.util.*;
//自定义MyBufferedReader方法，代替BufferedReader方法
class MyBufferedReader
{
	private FileReader FR;
	MyBufferedReader(FileReader FR)
	{
		this.FR=FR;
	}

	//可以一次读取一行的方法
	public String MyReadLine()throws IOException
	{
		//定义一个临时容器封装字符数组，为演示方便定义一个StringBuilder容器
		StringBuilder SB = new StringBuilder(); //容器
		int ch = 0;
		while((ch=FR.read())!=-1)
		{
			if(ch=='\r'){continue;}
			if(ch=='\n'){return SB.toString();}
			else{SB.append((char)ch);}  //数据加入该容器
		}
		return null;
	}
    //关闭的方法
	public void close()throws IOException
	{
		FR.close();
	}
}

class  DefineReadLine
{
	public static void main(String[] args)throws IOException 
	{
		FileReader FR = new FileReader("Demo.txt");
		MyBufferedReader MBF = new MyBufferedReader(FR);
        while(true)
		{
			String str = MBF.MyReadLine();
			if(str==null){break;}
			System.out.println(str);
		}
	}
}
