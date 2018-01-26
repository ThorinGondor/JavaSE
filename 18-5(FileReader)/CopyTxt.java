import java.util.*;
import java.io.*;

class CopyTxt
{
	public  static void main(String[] args)throws IOException
	{
		Copy2();
	}

	public static void Copy2()throws IOException
	{
		FileWriter FW = null;
		FileReader FR =null;
		try
		{
			FW = new FileWriter("F:\\destination.java",true);
			FR = new FileReader("F:\\Note.txt");

			char[] buff = new char[1024];
			int len=0;
			while(true)
			{
				len=FR.read();
				if(len==-1){break;}
				FW.write((char)len);
			}
		}
		catch (IOException e)
		{
			throw new RuntimeException("��ȡʧ�ܣ�");
		}
		finally
		{
			if(FR!=null)
			{FR.close();}
			if(FW!=null)
			{FW.close();}
		}
	}
/*
	public static void Copy1()throws IOException
	{
		FileWriter FW = new FileWriter("F:\\destination.java");
		FileReader FR = new FileReader("F:\\Note.java");

		int ch = 0;
		while((ch=FR.reader())!=-1)
		{
			FW.writer(ch);
		}
		FW.close();
		FR.close();
	}
*/
}