/***
   本例需求：将Source.txt的内复制粘贴到新的文档当中
***/
import java.util.*;
import java.io.*;

class CopyFile 
{
	public static void main(String[] args)throws IOException 
	{
		//（1）先创建一个IO读取流和一个IO输入流对象
		FileReader FR = new FileReader("Source.txt");
		FileWriter FW = new FileWriter("destination.txt",true);

		//（2）加入缓冲技术，再创建一个BufferedReader和BufferedWriter缓冲区对象,别忘了把之前的IO流对象添加进构造函数
		BufferedReader BR = new BufferedReader(FR);
		BufferedWriter BW = new BufferedWriter(FW);

		//（3）读取并写入
		while(true)
		{
			String str = BR.readLine(); //读取一行数据
			if(str==null){break;}
			BW.write(str);               //写入该行数据
			BW.flush();                  //别忘了刷新
			BW.newLine();                //换行
		}
		BR.close();
		BW.close();
	}
}
