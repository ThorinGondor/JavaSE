/****
网络编程：
（1）找到对方IP
（2）数字标识各个应用程序，叫做端口，是逻辑端口
（3）通信规则：TCP/IP
****/
import java.net.*;
class HelloInternet
{
	public static void main(String[] args)throws UnknownHostException
	{
		/***法一***/
		InetAddress IP =InetAddress.getLocalHost(); //同时获取主机名和IP地址
		String HN = IP.getHostName();     //左式获取主机名
		String HA = IP.getHostAddress();  //左式获取主机的IP地址
		sop(IP.toString());
		sop(HN);
		sop(HA);
		
		/***法二***/
		InetAddress IA = InetAddress.getByName("www.baidu.com");  //获取使用该IP地址的主机名和IP地址
		String HN2 = IA.getHostName();
		String HA2 = IA.getHostAddress();
		sop(IA.toString());
		sop(HN2);
		sop(HA2);
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}