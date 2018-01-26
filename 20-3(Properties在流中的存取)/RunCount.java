/***
Properties类中有个特殊的函数方法:
   load(FIS);   【Txt to Properties】
该功能能够加载字节读取流，可以自动将读取到的字符中的“=”进行切割，两边分别放进Properties的key和value
   store(FOS,"xxx");   【Properties To Txt】
该功能能够加载字节写入流，可以将设置后的Property的一对映射存入目标txt文档

***/
import java.io.*;
import java.util.*;

class RunCount
{
	public static void main(String[] args) throws IOException
	{
		Properties prop = new Properties();
		
		/***（1）Txt的内容进入Properties**/
		FileInputStream FIS = new FileInputStream("count.ini");
		prop.load(FIS); //将FIS流中的数据加载到了prop集合中
        
		/***（2）修改Properties内部的该内容***/
		int count = 0;
		String value=prop.getProperty("time");
		count = Integer.parseInt(value);  //将该String类的value强转成int类
		count++;
		prop.setProperty("time",count+"");
        
		/***（3）将该修改后的内容返回txt文件***/
		FileOutputStream FOS = new FileOutputStream("count.ini");
		prop.store(FOS,"Accumlate");
	}
}
