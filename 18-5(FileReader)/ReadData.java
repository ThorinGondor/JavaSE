/***
   本例需求：读取一个文件当中的所有字符。
   创建一个FileReader，用它读取流对象，和指定的文件相关联
   使用FR.read()读到数据，注意这里获取的将是int类，若要打印输出需char转换。
   若读到末尾，FR.read()；返回数据是-1;
***/
import java.io.*;
import java.util.*;

class ReadData
{
	public static void main(String[] args)throws IOException
	{
		FileReader FR = new FileReader("Note.txt"); //创建一个文件FR读取流对象，和指定名称的文件(Note.txt)相关联。
        //读取方法一：
		while(true)
		{
			int ch = FR.read(); //FR.read();是一个int类型数据，如果要打印输出需要强转成char类型。
		    if(ch==-1){break;}  //当读取到末尾以后，FR.read()会返回-1;此时应跳出循环
			sop((char)ch);
		}
		
        /*//读取方法二： 
		char[] buffer = new char[6];
        int num = 0;
		while((num=FR.read())!=-1)
		{
			System.out.println(new String(buffer,0,num));
		}
		*/
		

		FR.close();
	}
	public static void sop(Object o)
	{
		System.out.print(o);
	}
}