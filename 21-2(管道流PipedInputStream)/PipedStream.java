/****
管道流：
     输入输出可以直接进行连接，通过结合线程使用。
	 一边写入一边读取。
	 因此最好创建两个线程，通常由一个线程负责从PipedInputStream读取，另一个线程负责从PipedOutputStream负责写入
         |---PipedInputStream
         |---PipedOutputStream
****/
import java.io.*;
import java.util.*;
class PipedStream
{
	public static void main(String[] args)throws IOException
	{
		//创建两个读取写入管道流并相连
		PipedInputStream PIS = new PipedInputStream();
		PipedOutputStream POS = new PipedOutputStream();
		PIS.connect(POS);
        
		//创建两个线程负责读取和写入
		Read r = new Read(POS);
		Write w = new Write(PIS);
		Thread rt = new Thread(r);
		Thread wt = new Thread(w);
		rt.start();
		wt.start();
	}
}

class Read implements Runnable 
{
	private PipedOutputStream POS=null;
	Read(PipedOutputStream POS)
	{
		this.POS=POS;
	}
	public void run()
	{
		try
		{
			FileInputStream FIS = new FileInputStream("F:\\樱花抄.mp3");
			byte[] buffer = new byte[1024];
		    int ch=0;
			while( (ch=FIS.read(buffer))!=-1)
			{
				POS.write(buffer);
			}
			POS.flush();
		    POS.close();
			FIS.close();
		}
		catch (Exception e)
		{
		}
	}
}

class Write implements Runnable 
{
	private PipedInputStream PIS=null;
	Write(PipedInputStream PIS)
	{
		this.PIS=PIS;
	}
	public void run()
	{
		try
		{
			FileOutputStream FOS = new FileOutputStream("F:\\副本.mp3");
			byte[] buffer = new byte[1024];
			int flag = 0;
			while((flag=PIS.read(buffer))!=-1)
			{
				FOS.write(buffer);
			}
			FOS.flush();
			FOS.close();
			PIS.close();
		}
		catch (Exception e)
		{
		}
	}
}