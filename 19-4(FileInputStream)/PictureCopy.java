/***
   �������󣺿���ͼƬ��
   ��ͼƬΪ�ֽ�������ʹ��FileOutputStream();��FileInputStream();
***/
import java.util.*;
import java.io.*;

class PictureCopy 
{
	public static void main(String[] args)throws IOException 
	{
		try
		{
			FileInputStream FIS = new FileInputStream("F:\\Ferrari.jpg"); //����һ���ֽڶ�ȡ��
		    FileOutputStream FOS = new FileOutputStream("F:\\Copy.jpg");   //����һ���ֽ�д����

			byte[] buffer = new byte[FIS.available()];
			while(true)
			{
				int ch = FIS.read(buffer);  //��ȡ��ȡ�����ֽ�����
				if(ch==-1){break;}
				FOS.write(buffer);      //����ȡ�����ֽ�����д��
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
