/****
TCP协议传输：
   （1）服务端的Socket一初始化就先去找对应的客户端，需建立Socket和ServerSocket
   （2）建立客户端（Client）和服务端（Server）：
        |---客户端对应的对象是Socket;
		|---服务端对应的对象是SocketServer;
   （3）建立连接后，利用Socket的IO流进行传输
   （4）关闭Socket
  
  客户端---概念：
  通过查阅Socket对象，该对象建立时就必须去连接指定主机。
  因为TCP协议是面向连接的，所以建立Socket服务时，就必须服务端也存在并连接成功。

  

  本例需求：客户端给服务端Server发送文本数据;
            服务端定义端点接收数据并打印在控制台上。

  因此客户端步骤如下：
  （1）创建客户端的Socket服务，并在括号里指定要连接的主机（Server）和端口。
  （2）客户端为了发送数据，客户端需获取Socket的输出流。

  服务端步骤如下：
  （1）建立服务端的Socket服务：
       ServerSocket();  并监听一个端口
  （2）获取连接过来的客户端对象Client：
       使用ServerSocket的accept(); 无连接就会一直等待，该函数方法是阻塞式的。
  （3）客户端如果发送来数据，那么服务端要使用对应的客户端对象，并获取该客户端对象的读取流来读取发过来的数据。
  （4）关闭
****/
import java.net.*;
import java.io.*;

class Server //TCP协议下的服务端
{
	public static void main(String[] args)throws Exception
	{
		//（1）建立服务端的Socket服务：ServerSocket();并监听对应的端口
		ServerSocket SS = new ServerSocket(63300);
		
		//（2）通过accept方法获取连接过来的客户端对象s
		Socket S = SS.accept();  //阻塞式，等待客户端对象连接
		String IP = S.getInetAddress().getHostName();
		System.out.println(IP+" connected");
		
		//（3）获取客户端发送来的数据，那么要使用客户端对象的读取流来读取数据
		InputStream IS = S.getInputStream();
		
		InputStreamReader ISR = new InputStreamReader(IS);
		BufferedReader BR = new BufferedReader(ISR);
		while(true)
		{
			String str = BR.readLine();
			if(str==null){break;}
			System.out.print(str);
		}

		//（4）关闭
		S.close();
		SS.close();
	}
}

class Client //TCP协议下的一个客户端
{
	public static void main(String[] args)throws Exception 
	{
		//（1）创建客户端的Socket服务，并在括号里指定目的主机和端口
		Socket S = new Socket("192.168.1.108",63300);

		//（2）为了向服务端发送数据，客户端获取Socket的输出流
		OutputStream OS = S.getOutputStream();
		OS.write("数据传输:From Client to Server！".getBytes());
		S.close();
	}
}
