/****
客户端通过键盘录入用户名
服务器对用户进行校验

如果用户存在在服务端显示用户名、已登录
并在客户端显示欢迎光临

如果不存在，在服务端显示用户名，尝试登陆
并在客户端显示，该用户不存在

最多登录三次

****/
import java.io.*;
import java.net.*;

//服务端：
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
				    //该客户端的对象Socket S已经传递到run方法里，可以对它进行读写操作
			        //获取网络输入流
			        BufferedReader Bin = new BufferedReader(new InputStreamReader(S.getInputStream()));
				    String name = Bin.readLine();
					if(name==null){break;}
			        
			    	//读取user.txt
			    	BufferedReader BR = new BufferedReader(new FileReader("User.txt"));
                    
			    	String line = null;
			    	boolean flag =false;
					
			    	while((line=BR.readLine())!=null)  //遍历判断是否客户端输入的name是否和User.txt有相同名字
			    	{
			    		if(line.equals(name))
							{flag=true;break;}
						System.out.println(flag);
				    }
                    

					//获取网络输出流
			        BufferedWriter Bout = new BufferedWriter(new OutputStreamWriter(S.getOutputStream()));
				    if(flag==true)
			    	{
			    		Bout.write("欢迎");
						Bout.newLine();
						Bout.flush();
				    }
				    else
				    {
				    	Bout.write("用户名不存在");
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

//客户端：
class Client0
{
	public static void main(String[] args) throws Exception
	{
		UploadSystem();
	}

	public static void UploadSystem()throws Exception
	{
		Socket S = new Socket("192.168.1.108",17800);
		
		//读取键盘录入
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		
		//获取网络输出流，向服务器发送
        BufferedWriter Bout = new BufferedWriter(new OutputStreamWriter(S.getOutputStream()));
		
		//获取网络输入流，接收服务器反馈
		BufferedReader Bin = new BufferedReader(new InputStreamReader(S.getInputStream()));

		for(int i = 0;i<3;i++)
		{
			String line = BR.readLine();  
			if(line==null){break;}
			Bout.write(line);
			Bout.newLine();
			Bout.flush();
			String info = Bin.readLine();//阻塞式，该代码会使程序在此处等待服务端返回信息
			System.out.println("The info is : "+info);
			if(info.contains("欢迎")){break;}
		}
		//关闭
		BR.close();
		S.close();
	}
}

/****封存****/
class Client1
{
	public static void main(String[] args) throws Exception
	{
		UploadSystem();
	}

	public static void UploadSystem()throws Exception
	{
		Socket S = new Socket("192.168.1.108",17800);
		
		//读取键盘录入
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		
		//获取网络输出流，向服务器发送
        BufferedWriter Bout = new BufferedWriter(new OutputStreamWriter(S.getOutputStream()));
		
		//获取网络输入流，接收服务器反馈
		BufferedReader Bin = new BufferedReader(new InputStreamReader(S.getInputStream()));

		for(int i = 0;i<3;i++)
		{
			String line = BR.readLine();  
			if(line==null){break;}
			Bout.write(line);
			Bout.newLine();
			Bout.flush();
			String info = Bin.readLine();//阻塞式，该代码会使程序在此处等待服务端返回信息
			System.out.println("The info is : "+info);
			if(info.contains("欢迎")){break;}
		}
		//关闭
		BR.close();
		S.close();
	}
}