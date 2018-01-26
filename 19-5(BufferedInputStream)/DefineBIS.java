import java.io.*;
class MyBufferedInputStream
{
	private FileInputStream FIS;
	MyBufferedInputStream(FileInputStream FIS)
	{
		this.FIS=FIS;
	}
	private byte[] buffer = new byte[1024];
	private int pos=0;
	private int count=0;
	
	//一次读取一个字节的方法
	public int read()throws IOException
	{
		if(count==0)
		{
			count=FIS.read(buffer);
			if(count<0)
				return -1;
		    byte b =buffer[pos];
		    count--;
		    pos++;
		    return b;
		}
		else if(count>0)
		{
			byte b =buffer[pos];
			count--;
			pos++;
			return b;
		}
		return -1;
	}
}
class DefineBIS 
{
	public static void main(String[] args)throws IOException 
	{
		FileInputStream FIS = new FileInputStream("F:\\Note.txt");
		MyBufferedInputStream MBIS = new MyBufferedInputStream(FIS);
		while(true)
		{
			int ch = MBIS.read();
			if(ch==-1){break;}
			System.out.print((char)ch);
		}
	}
}
