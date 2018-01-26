/****
�����̣�
��1���ҵ��Է�IP
��2�����ֱ�ʶ����Ӧ�ó��򣬽����˿ڣ����߼��˿�
��3��ͨ�Ź���TCP/IP
****/
import java.net.*;
class HelloInternet
{
	public static void main(String[] args)throws UnknownHostException
	{
		/***��һ***/
		InetAddress IP =InetAddress.getLocalHost(); //ͬʱ��ȡ��������IP��ַ
		String HN = IP.getHostName();     //��ʽ��ȡ������
		String HA = IP.getHostAddress();  //��ʽ��ȡ������IP��ַ
		sop(IP.toString());
		sop(HN);
		sop(HA);
		
		/***����***/
		InetAddress IA = InetAddress.getByName("www.baidu.com");  //��ȡʹ�ø�IP��ַ����������IP��ַ
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