import java.io.*;
import java.net.*;

/****
   前几例的TCP服务端设计都有局限性，只能与一个客户端相连，如果加入while循环，那么各个客户端只能一个个排队等待执行。
   这就需要多线程。
   为了可以让多个客户端同时与服务端连接，那么这个服务端最好就是将每个客户端封装到一个单独的线程中，这样就可以同时处理多个客户端请求。

   如何定义线程呢？
   只要明确了每个客户端都需要在服务端执行的代码即可，将该代码存入Runnable的run方法中。
****/

class Server
{
	public static void main(String[] args) throws Exception 
	{
		ServerSocket SS = new ServerSocket(25500);
		while(true)
		{
			/***启动一个线程使该客户端运行至结束，而主线程依旧运行，仍能继续接收客户端并使其也进入新线程运行***/
			Socket S = SS.accept();  //不断地接收各个客户端并创建各个客户端对应的对象
		    
			//创建线程并启动该线程
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
			throw new RuntimeException("上传失败");
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
        
		//获取网络输出流
		BufferedWriter Bout = new BufferedWriter(new OutputStreamWriter(S.getOutputStream()));
		Bout.write("上传成功！");
		Bout.newLine();
		Bout.flush();
        
		//关闭
		BOS.close();
	}
}

class Client0
{
	public static void main(String[] args) throws Exception 
	{
		//建立TCP协议环境
		Socket S = new Socket("192.168.1.108",25500);
		//读取图片数据
		BufferedInputStream BIS = new BufferedInputStream(new FileInputStream("F:\\Ferrari.jpg"));
		//获取网络输出流
		BufferedOutputStream Bout = new BufferedOutputStream(S.getOutputStream());
        
		int ch = 0;
		while((ch=BIS.read())!=-1)
		{
			Bout.write((char)ch);
		}
		//关闭
		S.shutdownOutput();
        
		//获取网络输入流
        BufferedReader Bin = new BufferedReader(new InputStreamReader(S.getInputStream()));
        String str = Bin.readLine();
		System.out.println(str);
        
		//关闭
		BIS.close();
		S.close();
	}
}

class Client1
{
	public static void main(String[] args) throws Exception 
	{
		//建立TCP协议环境
		Socket S = new Socket("192.168.1.108",25500);
		//读取图片数据
		BufferedInputStream BIS = new BufferedInputStream(new FileInputStream("F:\\Ferrari.jpg"));
		//获取网络输出流
		BufferedOutputStream Bout = new BufferedOutputStream(S.getOutputStream());
        
		int ch = 0;
		while((ch=BIS.read())!=-1)
		{
			Bout.write((char)ch);
		}
		//关闭
		S.shutdownOutput();
        
		//获取网络输入流
        BufferedReader Bin = new BufferedReader(new InputStreamReader(S.getInputStream()));
        String str = Bin.readLine();
		System.out.println(str);
        
		//关闭
		BIS.close();
		S.close();
	}
}

class Client3
{
	public static void main(String[] args)throws Exception 
	{
		//建立TCP协议环境
		Socket S = new Socket("192.168.1.108",25500);
		//读取图片数据
		BufferedInputStream BIS = new BufferedInputStream(new FileInputStream("F:\\Ferrari.jpg"));
		//获取网络输出流
		BufferedOutputStream Bout = new BufferedOutputStream(S.getOutputStream());
        
		int ch = 0;
		while((ch=BIS.read())!=-1)
		{
			Bout.write((char)ch);
		}
		//关闭
		S.shutdownOutput();
        
		//获取网络输入流
        BufferedReader Bin = new BufferedReader(new InputStreamReader(S.getInputStream()));
        String str = Bin.readLine();
		System.out.println(str);
        
		//关闭
		BIS.close();
		S.close();
	}
}