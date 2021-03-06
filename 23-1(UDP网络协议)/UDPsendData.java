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
本题需求：以UDP协议，将一段字符数据发送出去。
    思路和步骤：
	（1）建立udpsocket服务。
	（2）提供数据并封装到数据包。
	（3）通过Socket服务的发送功能，发送数据包。
	（4）关闭资源。
****/
import java.net.*;

class UDPsendData  //以UDP协议发送数据
{
	public static void main(String[] args)throws Exception
	{
		//（1）利用DatagramSocket创建UDP服务DS
		DatagramSocket DS = new DatagramSocket();

		//（2）先创建数据（例如：数组缓冲区buffers），并将它封装成数据包DP
		byte[] buffers = "我是UDP协议下发送的字符".getBytes();
		DatagramPacket DP = new DatagramPacket(buffers,buffers.length,InetAddress.getByName("192.168.204.1"),10000);

		//（3）利用Socket发送功能，发送数据包
		DS.send(DP);

		//（4）关闭资源
		DS.close();
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}