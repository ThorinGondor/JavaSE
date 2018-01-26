/***
   ǰ�������ǹ����ַ���File��д������
   FileReader();
   FileWriter();
   �����룩���幤�ߣ�
   BufferedReader();
   BufferedWriter();
   
   �������ֽ�����д������
   InputStream
      |---FileInputStream(); ����������ֱ��д��write(); ����Ҫˢ��flush();
   OutputStream
      |---FileOutputStream();
   ������Ҫ����ͼƬ���ݣ���ʱ�����Ҫ�õ��ֽ�����

   �ֽ������������ֽ�����byte�����ַ�����������String���char��
***/
import java.util.*;
import java.io.*;

class FileStream
{
	public static void main(String[] args)throws IOException 
	{
		write();
		read1();
		read2();
	}
    
	//д���ֽڵķ�����File.OutputStream();
	public static void write()throws IOException
	{
		FileOutputStream FOS = new FileOutputStream("Demo.txt");
		FOS.write("Saber".getBytes());
		FOS.close();
	}

	//��ȡ�ֽڵķ���1��FileInputStream();
	public static void read1()throws IOException
	{
		FileInputStream FIS = new FileInputStream("Demo.txt");
		while(true)
		{
			int ch = FIS.read();
		    if(ch==-1){break;}
			System.out.print((char)ch);
		}
		FIS.close();
	}

	//��ȡ�ֽڵķ���2��ʹ��FIS.available();����ȡ�ַ����ȣ��Ӷ��������øó��Ƚ���һ���ոպõĻ�������Ҳ�Ͳ�����ѭ����
	public static void read2()throws IOException
	{
		FileInputStream FIS = new FileInputStream("Demo.txt");
		byte[] buffer = new byte[FIS.available()];
		FIS.read(buffer);//����ȡ�����ֽڴ浽buffer������������
		System.out.println(new String(buffer)); //��ΪString���ͽ������
	}
}