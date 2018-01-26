import java.util.*;
import java.io.*;

class PicCopy2
{
	public static void main(String[] args)throws IOException
	{
		copy();
	}
	public static void copy()throws IOException
	{
		//建立字节读取流、字节写入流
		FileInputStream FIS = new FileInputStream("F:\\Porsche.jpg");
		FileOutputStream FOS = new FileOutputStream("F:\\Copy2.jpg");
		//建立字节缓冲区
		byte[] buffer = new byte[FIS.available()];

		while(true)
		{
			int ch = FIS.read(buffer); //（1）右式：读取数据送到缓冲区
			if(ch==-1){break;} //（2）如果读取完毕则跳出循环
			FOS.write(buffer);//（3）将数据写入目标图
		}
		FIS.close();
		FOS.close();
	}
}