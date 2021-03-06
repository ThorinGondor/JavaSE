/****
    本例演示mp3文件的复制，需要通过缓冲区。
	BufferedOutputStream();
	BufferedInputStream();
****/
import java.io.*;
class CopyMedia
{
	public static void main(String[] args)throws IOException 
	{
		long start = System.currentTimeMillis();
		COPY();
		long end = System.currentTimeMillis();
		System.out.println(start+"---"+end);
	}

	public static void COPY()throws IOException
    {
		//建立字节流读取写入流
		FileInputStream FIS = new FileInputStream("F:\\樱花抄.mp3");
		FileOutputStream FOS = new FileOutputStream("F:\\樱花抄副本.mp3");
        
		//加入建立缓存技术
		BufferedInputStream BIS = new BufferedInputStream(FIS);
		BufferedOutputStream BOS = new BufferedOutputStream(FOS);
		//有了上述缓冲区，便不用再建立数组来当做缓冲区

		while(true)
		{
			int ch = BIS.read(); //右式读取数据
			if(ch==-1){break;}   //跳出循环
			BOS.write((char)ch); //写入数据
		}
		BIS.close();
		BOS.close();
	}
}
