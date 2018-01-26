import java.io.*;
class CopyPicture
{
	public static void main(String[] args)throws IOException
	{
		COPY();
	}
	public static void COPY()throws IOException
	{
		FileInputStream FIS = new FileInputStream("F:\\最终幻想15.jpg"); //创建读取字节流
		//创建缓冲区，避免创建数组缓冲区
		BufferedInputStream BIS = new BufferedInputStream(FIS);
        
		FileOutputStream FOS = new FileOutputStream("F:\\最终幻想副本.jpg"); //创建写入字节流
		BufferedOutputStream BOS = new BufferedOutputStream(FOS);
		
		System.out.println("传输图片数据中...");
		//读取并写入
		while(true)
		{
			int ch = BIS.read();
			if(ch==-1){break;}
			BOS.write((char)ch);
			BOS.flush();
		}
        System.out.println("传输结束！");
		//关闭
		BIS.close();
		BOS.close();
	}
}