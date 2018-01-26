/***

演示：如何将流中的数据存储到集合中
如何将Info.txt中的键值数据存到集合中进行操作

法一：
   1.用一个流和info.txt文件关联
   2.读取一行数据，将该行数据用"="进行切割: split("=");
   3.等式左边存入key，右边存入value

法二：
上述方法比较麻烦，Properties类中有个特殊的函数方法:
   load(FIS);   【Txt to Properties】
该功能能够加载字节读取流，可以自动将读取到的字符中的“=”进行切割，两边分别放进Properties的key和value
   store(FOS,"xxx");   【Properties To Txt】
该功能能够加载字节写入流，可以将设置后的Property的一对映射存入目标txt文档

***/
import java.io.*;
import java.util.*;
class TxtToProperties
{
	public static void main(String[] args) throws IOException
	{
		ReadAndWrite1();
		ReadAndWrite2();
	}

	/***法一：（比较麻烦）***/
	public static void ReadAndWrite1()throws IOException
	{
		FileReader FR = new FileReader("Info.txt");
		BufferedReader BR = new BufferedReader(FR);
        Properties prop = new Properties();
		
		while(true) //获取文本文档中的所有数据
		{
			String str = BR.readLine();
			if(str==null)
			{break;}
			String[] arr = str.split("=");  //split();功能可以根据某一字符进行左右切割，切割后是数组类型,切割后放进arr[0]和arr[1]
			prop.setProperty(arr[0],arr[1]); //
		}
		System.out.println(prop);
		BR.close();
	}

	/***法二：prop.load(FIS);***/
	public static void ReadAndWrite2()throws IOException
	{
		FileInputStream FIS = new FileInputStream("Info.txt");
		Properties prop = new Properties();
		prop.load(FIS);//load方法能够加载字节读取流，通过读取流直接将映射存入Properties集合中
		System.out.println(prop);

		prop.setProperty("NickYoung","6");  //在Properties里添加、修改一对映射
		
		FileOutputStream FOS = new FileOutputStream("Info.txt");
		prop.store(FOS,"Shit");//store方法能够加载字节输出流，通过输出流将该映射存入文本文档
		System.out.println(prop);
	}
}
