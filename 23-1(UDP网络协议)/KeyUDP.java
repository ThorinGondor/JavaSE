/****
    【重点】TCP和UDP：
	UDP:（寄包裹、步话机）
	（1）将数据及源和目的封装成数据包内，不需要建立和对方的连接。
	（2）大小不超过64K
	（3）因为无连接，因此是不可靠协议
	（4）但是因为无需建立连接，速度快！
	
	TCP：（打电话）
	（1）必须建立连接，形成数据传输的通道
	（2）在连接中才能进行大量数据传输，一旦对方连接中断，数据无法传输
	（3）通过三次握手完成连接，是可靠协议!
	（4）必须建立连接，效率会稍低。

	Socket：（应用程序的码头，数据是往来的货船）
	（1）Socket中文意思为插座，Socket此处就是为了网络服务提供的一种机制
	（2）通信的两端都有Socket
	（3）网络通信其实就是Socket之间的通信！！！
	（4）数据在两个Socket之间通过IO流传输！！！
****/

/****
本题需求：
一、首先以UDP协议，将一段字符数据发送出去。
    思路和步骤：
	（1）建立udpsocket服务DS。
	（2）提供数据并封装到数据包DP。
	（3）通过Socket服务的发送功能DS.send(DP);，发送数据包DP。
	（4）关闭资源。
	
二、然后仍以UDP为协议，接收数据包并处理
	思路和步骤：
	（1）建立UDPsocket的DatagramSocket服务DS，同时还需监听一个端口，其实就是给这个网络应用程序接受程序定义一个数字标识。
	（2）建立一个空数据包对象DatagramPacket DP，用于存储接收到的数据包的字节数据
	（3）通过Socket服务的接收功能DS.receive(DP);，接收数据包
	（4）读取数据包数据（并打印在控制台）
	（5）关闭资源
****/
import java.net.*;
import java.util.*;
import java.io.*;

                     /***注意本代码由两个main代码组成，其实应该写在两个代码里***/
//设置发送端主机：
class KeyUDPsend
{
	public static void main(String[] args)throws Exception
	{
		sendServer();
	}

	public static void sendServer()throws Exception
	{
		//（1）利用DatagramSocket创建UDP服务DS
		DatagramSocket DS = new DatagramSocket(10000);
		
		//while(true)
		//{
			//（2）先创建数据（例如：数组缓冲区buffers），并将它封装成数据包DP
			InputStream IS = System.in;
		    InputStreamReader ISR = new InputStreamReader(IS);
		    BufferedReader BR = new BufferedReader(ISR);
		    byte[] buffers = new byte[1024];
			while(true)
			{
				String str = BR.readLine();
				if(str==null){break;}
			    buffers = str.getBytes();
				DatagramPacket DP = new DatagramPacket(buffers,buffers.length,InetAddress.getByName("192.168.204.1"),12345);
		    //（3）利用Socket发送功能，发送数据包
		        DS.send(DP);
			}
			
		   
		//}
		
	}
}

//设置接收端主机：
class KeyUDPreceive
{
	public static void main(String[] args)throws Exception
	{
		receiveServer();
		
	}
	public static void receiveServer()throws Exception
	{
		//(1)创建UDP的Socket服务，建立端点
		DatagramSocket DS = new DatagramSocket(12345);
        while(true)
		{
			//(2)创建空数据包，用于存储接收到的数据
		    byte[] buffers = new byte[1024];
		    DatagramPacket DP = new DatagramPacket(buffers,buffers.length);

		    //(3)利用DS的接收功能，接收数据包
		    DS.receive(DP);

		    //(4)读取数据包的数据内容
            String IP = DP.getAddress().getHostAddress();//获取对方主机的IP地址
	        String data = new String(DP.getData(),0,DP.getLength());  //获取接收到的数据，顺便用到一个功能只需要读取一部分new String(DP.getData,0,int x);
		    int port = DP.getPort();                     //获取对方主机程序运行的端口8888,并非数据包发出的端口10000
		    System.out.println(IP+"---"+data+"---"+port);
		}
		
	}
}