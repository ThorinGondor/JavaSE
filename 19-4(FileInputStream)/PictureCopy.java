/***
   本例需求：拷贝图片。
   该图片为字节流，需使用FileOutputStream();和FileInputStream();
***/
import java.util.*;
import java.io.*;

class PictureCopy 
{
	public static void main(String[] args)throws IOException 
	{
		try
		{
			FileInputStream FIS = new FileInputStream("F:\\Ferrari.jpg"); //创建一个字节读取流
		    FileOutputStream FOS = new FileOutputStream("F:\\Copy.jpg");   //创建一个字节写入流

			byte[] buffer = new byte[FIS.available()];
			while(true)
			{
				int ch = FIS.read(buffer);  //获取读取到的字节数据
				if(ch==-1){break;}
				FOS.write(buffer);      //将读取到的字节数据写入
			}
		}
		catch (IOException e)
		{
			e.toString();
		}
		finally
		{
		}
	}
}
