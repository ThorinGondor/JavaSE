/****
�ܵ�����
     �����������ֱ�ӽ������ӣ�ͨ������߳�ʹ�á�
	 һ��д��һ�߶�ȡ��
	 �����ô��������̣߳�ͨ����һ���̸߳����PipedInputStream��ȡ����һ���̸߳����PipedOutputStream����д��
         |---PipedInputStream
         |---PipedOutputStream
****/
import java.io.*;
import java.util.*;
class PipedStream
{
	public static void main(String[] args)throws IOException
	{
		//����������ȡд��ܵ���������
		PipedInputStream PIS = new PipedInputStream();
		PipedOutputStream POS = new PipedOutputStream();
		PIS.connect(POS);
        
		//���������̸߳����ȡ��д��
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
			FileInputStream FIS = new FileInputStream("F:\\ӣ����.mp3");
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
			FileOutputStream FOS = new FileOutputStream("F:\\����.mp3");
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