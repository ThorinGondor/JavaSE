/****
编码表:编码--->解码。
       写入时，将字符以UTF-8的方式进行编码后写入文本。
       读取时，再以UTF-8的方式解码来获取原字符。
	   如果编码与解码方式不同，将会输出乱码。
****/
import java.util.*;
import java.io.*;

class EncodeStream 
{
	public static void main(String[] args) throws IOException
	{
		writeText();
		readText();
	}
	public static void writeText()throws IOException
	{
		FileOutputStream FOS = new FileOutputStream("UTF.txt");
		OutputStreamWriter OSW = new OutputStreamWriter(FOS,"UTF-8");//写入时采用UTF-8的编码方式
		BufferedWriter BW = new BufferedWriter(OSW);
		
		//写入
		BW.write("你好");
		BW.newLine();
		BW.write("再见");
		BW.close();
	}
	public static void readText()throws IOException
	{
		FileInputStream FIS = new FileInputStream("UTF.txt");
		InputStreamReader ISR = new InputStreamReader(FIS,"UTF-8");  //如果读取时没有以UTF-8的方式解码，那么将输出乱码
		BufferedReader BR = new BufferedReader(ISR);
		
		//读取
		while(true)
		{
			String str = BR.readLine();
			if(str==null){break;}
			System.out.println("STR:"+str);
		}
		BR.close();
	}
}
