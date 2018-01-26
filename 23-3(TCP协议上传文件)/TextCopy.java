import java.io.*;
import java.net.*;

class ClientText
{
	public static void main(String[] args) throws Exception
	{
		//创建TCP协议环境
		Socket S = new Socket("192.168.1.108",23400);
		//读取文本
		BufferedReader BR = new BufferedReader(new FileReader("1.txt"));
		//获取网络输出流
		BufferedWriter Bout = new BufferedWriter(new OutputStreamWriter(S.getOutputStream()));
		
		String line = null;
		while((line = BR.readLine())!=null)
		{
			Bout.write(line);
			Bout.newLine();
			Bout.flush();
		}
		
		S.shutdownOutput(); //关闭客户端的网络输出流，相当于是个结束标记

		//获取网络输入流
        BufferedReader Bin = new BufferedReader(new InputStreamReader(S.getInputStream()));
		String str = Bin.readLine();
		System.out.println(str);

		BR.close();
		S.close();
	}
}

class ServerText
{
	public static void main(String[] args) throws Exception
	{
		ServerSocket SS = new ServerSocket(23400);
		Socket S = SS.accept();
		BufferedReader Bin = new BufferedReader(new InputStreamReader(S.getInputStream()));
		BufferedWriter BW = new BufferedWriter(new FileWriter("2.txt",true));

		String line = null;
		while((line = Bin.readLine())!=null)
		{
			BW.write(line);
			BW.newLine();
            BW.flush();
		}
		
		BufferedWriter Bout = new BufferedWriter(new OutputStreamWriter(S.getOutputStream()));
		Bout.write("接收完毕");
		Bout.newLine();
		Bout.flush();

		BW.close();
		SS.close();
	}
}