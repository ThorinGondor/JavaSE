import java.io.*;
import java.net.*;

/****
   ǰ������TCP�������ƶ��о����ԣ�ֻ����һ���ͻ����������������whileѭ������ô�����ͻ���ֻ��һ�����Ŷӵȴ�ִ�С�
   �����Ҫ���̡߳�
   Ϊ�˿����ö���ͻ���ͬʱ���������ӣ���ô����������þ��ǽ�ÿ���ͻ��˷�װ��һ���������߳��У������Ϳ���ͬʱ�������ͻ�������

   ��ζ����߳��أ�
   ֻҪ��ȷ��ÿ���ͻ��˶���Ҫ�ڷ����ִ�еĴ��뼴�ɣ����ô������Runnable��run�����С�
****/

class Server
{
	public static void main(String[] args) throws Exception 
	{
		ServerSocket SS = new ServerSocket(25500);
		while(true)
		{
			/***����һ���߳�ʹ�ÿͻ��������������������߳��������У����ܼ������տͻ��˲�ʹ��Ҳ�������߳�����***/
			Socket S = SS.accept();  //���ϵؽ��ո����ͻ��˲����������ͻ��˶�Ӧ�Ķ���
		    
			//�����̲߳��������߳�
			ServerWork SW = new ServerWork(S);
			new Thread(SW).start();
		}
	}
}

class ServerWork implements Runnable
{
	private Socket S;
	ServerWork(Socket S)
	{
		this.S = S;
	}
	public void run()
	{
		try
		{
			Upload(S);
		}
		catch (Exception e)
		{
			throw new RuntimeException("�ϴ�ʧ��");
		}
	}

	public void Upload(Socket S)throws Exception 
	{
		String IP = S.getInetAddress().getHostAddress();
		long time = System.currentTimeMillis();
		File file = new File(IP+"---"+time+".jpg");
		BufferedInputStream Bin = new BufferedInputStream(S.getInputStream());
		BufferedOutputStream BOS = new BufferedOutputStream(new FileOutputStream(file));
		
		int ch = 0;
		while((ch=Bin.read())!=-1)
		{
			BOS.write((char)ch);
		}
        
		//��ȡ���������
		BufferedWriter Bout = new BufferedWriter(new OutputStreamWriter(S.getOutputStream()));
		Bout.write("�ϴ��ɹ���");
		Bout.newLine();
		Bout.flush();
        
		//�ر�
		BOS.close();
	}
}

class Client0
{
	public static void main(String[] args) throws Exception 
	{
		//����TCPЭ�黷��
		Socket S = new Socket("192.168.1.108",25500);
		//��ȡͼƬ����
		BufferedInputStream BIS = new BufferedInputStream(new FileInputStream("F:\\Ferrari.jpg"));
		//��ȡ���������
		BufferedOutputStream Bout = new BufferedOutputStream(S.getOutputStream());
        
		int ch = 0;
		while((ch=BIS.read())!=-1)
		{
			Bout.write((char)ch);
		}
		//�ر�
		S.shutdownOutput();
        
		//��ȡ����������
        BufferedReader Bin = new BufferedReader(new InputStreamReader(S.getInputStream()));
        String str = Bin.readLine();
		System.out.println(str);
        
		//�ر�
		BIS.close();
		S.close();
	}
}

class Client1
{
	public static void main(String[] args) throws Exception 
	{
		//����TCPЭ�黷��
		Socket S = new Socket("192.168.1.108",25500);
		//��ȡͼƬ����
		BufferedInputStream BIS = new BufferedInputStream(new FileInputStream("F:\\Ferrari.jpg"));
		//��ȡ���������
		BufferedOutputStream Bout = new BufferedOutputStream(S.getOutputStream());
        
		int ch = 0;
		while((ch=BIS.read())!=-1)
		{
			Bout.write((char)ch);
		}
		//�ر�
		S.shutdownOutput();
        
		//��ȡ����������
        BufferedReader Bin = new BufferedReader(new InputStreamReader(S.getInputStream()));
        String str = Bin.readLine();
		System.out.println(str);
        
		//�ر�
		BIS.close();
		S.close();
	}
}

class Client3
{
	public static void main(String[] args)throws Exception 
	{
		//����TCPЭ�黷��
		Socket S = new Socket("192.168.1.108",25500);
		//��ȡͼƬ����
		BufferedInputStream BIS = new BufferedInputStream(new FileInputStream("F:\\Ferrari.jpg"));
		//��ȡ���������
		BufferedOutputStream Bout = new BufferedOutputStream(S.getOutputStream());
        
		int ch = 0;
		while((ch=BIS.read())!=-1)
		{
			Bout.write((char)ch);
		}
		//�ر�
		S.shutdownOutput();
        
		//��ȡ����������
        BufferedReader Bin = new BufferedReader(new InputStreamReader(S.getInputStream()));
        String str = Bin.readLine();
		System.out.println(str);
        
		//�ر�
		BIS.close();
		S.close();
	}
}