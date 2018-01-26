/****
�ͻ���ͨ������¼���û���
���������û�����У��

����û������ڷ������ʾ�û������ѵ�¼
���ڿͻ�����ʾ��ӭ����

��������ڣ��ڷ������ʾ�û��������Ե�½
���ڿͻ�����ʾ�����û�������

����¼����

****/
import java.io.*;
import java.net.*;

//����ˣ�
class Server
{
	public static void main(String[] args) throws Exception
	{
		ServeSystem(); 
	}

	public static void ServeSystem()throws Exception
	{
		ServerSocket SS = new ServerSocket(17800);
		while(true)
		{
			Socket S = SS.accept();
            ServeWork SW = new ServeWork(S);
			new Thread(SW).start();
		}
	}

	
}
class ServeWork implements Runnable 
	{
		private Socket S;
		ServeWork(Socket S)
		{
			this.S = S;
		}

		public void run() 
		{
			try
			{
				for(int x = 0;x<3;x++)
			    {
					String IP = S.getInetAddress().getHostAddress();
					System.out.println("IP is "+IP+" connected!");
				    //�ÿͻ��˵Ķ���Socket S�Ѿ����ݵ�run��������Զ������ж�д����
			        //��ȡ����������
			        BufferedReader Bin = new BufferedReader(new InputStreamReader(S.getInputStream()));
				    String name = Bin.readLine();
					if(name==null){break;}
			        
			    	//��ȡuser.txt
			    	BufferedReader BR = new BufferedReader(new FileReader("User.txt"));
                    
			    	String line = null;
			    	boolean flag =false;
					
			    	while((line=BR.readLine())!=null)  //�����ж��Ƿ�ͻ��������name�Ƿ��User.txt����ͬ����
			    	{
			    		if(line.equals(name))
							{flag=true;break;}
						System.out.println(flag);
				    }
                    

					//��ȡ���������
			        BufferedWriter Bout = new BufferedWriter(new OutputStreamWriter(S.getOutputStream()));
				    if(flag==true)
			    	{
			    		Bout.write("��ӭ");
						Bout.newLine();
						Bout.flush();
				    }
				    else
				    {
				    	Bout.write("�û���������");
						Bout.newLine();
						Bout.flush();
				    }
			    }
				
			    S.close();
			}
			catch (Exception e)
			{
				throw new RuntimeException("Failed!");
			}
			
			
		}
	}
/************************************************************/

//�ͻ��ˣ�
class Client0
{
	public static void main(String[] args) throws Exception
	{
		UploadSystem();
	}

	public static void UploadSystem()throws Exception
	{
		Socket S = new Socket("192.168.1.108",17800);
		
		//��ȡ����¼��
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		
		//��ȡ����������������������
        BufferedWriter Bout = new BufferedWriter(new OutputStreamWriter(S.getOutputStream()));
		
		//��ȡ���������������շ���������
		BufferedReader Bin = new BufferedReader(new InputStreamReader(S.getInputStream()));

		for(int i = 0;i<3;i++)
		{
			String line = BR.readLine();  
			if(line==null){break;}
			Bout.write(line);
			Bout.newLine();
			Bout.flush();
			String info = Bin.readLine();//����ʽ���ô����ʹ�����ڴ˴��ȴ�����˷�����Ϣ
			System.out.println("The info is : "+info);
			if(info.contains("��ӭ")){break;}
		}
		//�ر�
		BR.close();
		S.close();
	}
}

/****���****/
class Client1
{
	public static void main(String[] args) throws Exception
	{
		UploadSystem();
	}

	public static void UploadSystem()throws Exception
	{
		Socket S = new Socket("192.168.1.108",17800);
		
		//��ȡ����¼��
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		
		//��ȡ����������������������
        BufferedWriter Bout = new BufferedWriter(new OutputStreamWriter(S.getOutputStream()));
		
		//��ȡ���������������շ���������
		BufferedReader Bin = new BufferedReader(new InputStreamReader(S.getInputStream()));

		for(int i = 0;i<3;i++)
		{
			String line = BR.readLine();  
			if(line==null){break;}
			Bout.write(line);
			Bout.newLine();
			Bout.flush();
			String info = Bin.readLine();//����ʽ���ô����ʹ�����ڴ˴��ȴ�����˷�����Ϣ
			System.out.println("The info is : "+info);
			if(info.contains("��ӭ")){break;}
		}
		//�ر�
		BR.close();
		S.close();
	}
}