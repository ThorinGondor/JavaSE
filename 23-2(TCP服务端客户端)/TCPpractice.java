/****
需求：建立一个文本转换的服务器，客户端上传一段字符，服务器读取到客户端的字符后，反馈大写字符给客户端，客户端可以不断上传字符。

分析如下：
      客户端：
      按照IO的操作规律思考，源：键盘录入，目的：网络输出流OutputStream
      而且操作的是文本数据，可以选择字符流。
	  因此客户端步骤：
	  （1）建立服务
	  （2）获取键盘录入
	  （3）将数据发给服务端
	  （4）获取服务端返回的字符
	  （5）关闭

	  服务端：
	  源：来自客户端的Socket输入流，目的：Socket网络输出流
****/
import java.io.*;
import java.net.*;

class Server3
{
	public static void main(String[] args) throws Exception
	{
		serverSystem();
	}
    public static void serverSystem() throws Exception
	{
		ServerSocket SS = new ServerSocket(54300);
		Socket S = SS.accept();
		String IP =S.getInetAddress().getHostName();
		System.out.println(IP+"is connected");
		//读取来自客户端的网络输入流的数据
		BufferedReader Bin = new BufferedReader(new InputStreamReader(S.getInputStream()));
		//将读到的数据写入到网络输出流S.getOutputStream();
		BufferedWriter Bout = new BufferedWriter(new OutputStreamWriter(S.getOutputStream()));
        String line=null;
		while((line=Bin.readLine())!=null)
		{
			System.out.println("有效");
			Bout.write(line.toUpperCase());
			Bout.newLine();
			Bout.flush();
		}
		S.close();
		SS.close();
	}
}

class Client3
{
	public static void main(String[] args) throws Exception
	{
		clientSystem();
	}
	public static void clientSystem() throws Exception
	{
		//建立TCP协议环境
		Socket S = new Socket("192.168.1.108",54300);

		//BR读取键盘字符
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		//Bout将键盘字符写入Socket网络输出流，该流将会发给服务端
		BufferedWriter Bout = new BufferedWriter(new OutputStreamWriter(S.getOutputStream()));
		//定义一个Socket网络输入流，读取服务端返回的字符
		BufferedReader Bin = new BufferedReader(new InputStreamReader(S.getInputStream()));
		String line=null;
		while((line=BR.readLine())!=null)
		{
			if(line.equals("over")){break;}
			Bout.write(line);
			Bout.newLine();
			Bout.flush();
			String str = Bin.readLine();
			System.out.println(str);
		}
		BR.close();
		S.close();
	}
}
