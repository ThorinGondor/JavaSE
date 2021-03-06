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
            服务端接收数据并立刻反馈信息给客户端。

  因此客户端步骤如下：
  （1）创建客户端的Socket服务，并在括号里指定要连接的主机（Server）和端口。
  （2）客户端为了发送数据，客户端需获取Socket的输出流。
  （3）客户端获取Socket输入流，将服务端反馈的数据获取并打印。
  （4）关闭客户端

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

class Server2
{
	public static void main(String[] args)throws Exception
	{
		//建立ServerSocket服务
		ServerSocket SS =new ServerSocket(64400);
		//建立连接来的客户的对象
		Socket S = SS.accept();
		String IP = S.getInetAddress().getHostName();
		System.out.println("IP是："+IP);
		//获取读取流，读取客户端发来的数据
		InputStream IS = S.getInputStream();
		byte[] buff = new byte[1024];
		int len = IS.read(buff);
		System.out.println(new String(buff,0,len));
	
		OutputStream OS = S.getOutputStream();
		OS.write("数据反馈：from Server to Client".getBytes());
	}
}
class Client2
{
	public static void main(String[] args)throws Exception
	{
		//客户端建立Socket环境
		Socket S = new Socket("192.168.1.108",64400);
		//为了发送数据，客户端必须获取输出流
		OutputStream OS = S.getOutputStream();
		OS.write("数据消息：from Client to Server".getBytes());
		
		//客户端获取Socket输入流，将服务端反馈的数据获取并打印。
		InputStream IS = S.getInputStream();
		byte[] buff = new byte[1024];
		int ch = IS.read(buff);
		System.out.println(new String(buff,0,ch));
	}
}