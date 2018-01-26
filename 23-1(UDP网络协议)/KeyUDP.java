/****
    ���ص㡿TCP��UDP��
	UDP:���İ�������������
	��1�������ݼ�Դ��Ŀ�ķ�װ�����ݰ��ڣ�����Ҫ�����ͶԷ������ӡ�
	��2����С������64K
	��3����Ϊ�����ӣ�����ǲ��ɿ�Э��
	��4��������Ϊ���轨�����ӣ��ٶȿ죡
	
	TCP������绰��
	��1�����뽨�����ӣ��γ����ݴ����ͨ��
	��2���������в��ܽ��д������ݴ��䣬һ���Է������жϣ������޷�����
	��3��ͨ����������������ӣ��ǿɿ�Э��!
	��4�����뽨�����ӣ�Ч�ʻ��Ե͡�

	Socket����Ӧ�ó������ͷ�������������Ļ�����
	��1��Socket������˼Ϊ������Socket�˴�����Ϊ����������ṩ��һ�ֻ���
	��2��ͨ�ŵ����˶���Socket
	��3������ͨ����ʵ����Socket֮���ͨ�ţ�����
	��4������������Socket֮��ͨ��IO�����䣡����
****/

/****
��������
һ��������UDPЭ�飬��һ���ַ����ݷ��ͳ�ȥ��
    ˼·�Ͳ��裺
	��1������udpsocket����DS��
	��2���ṩ���ݲ���װ�����ݰ�DP��
	��3��ͨ��Socket����ķ��͹���DS.send(DP);���������ݰ�DP��
	��4���ر���Դ��
	
����Ȼ������UDPΪЭ�飬�������ݰ�������
	˼·�Ͳ��裺
	��1������UDPsocket��DatagramSocket����DS��ͬʱ�������һ���˿ڣ���ʵ���Ǹ��������Ӧ�ó�����ܳ�����һ�����ֱ�ʶ��
	��2������һ�������ݰ�����DatagramPacket DP�����ڴ洢���յ������ݰ����ֽ�����
	��3��ͨ��Socket����Ľ��չ���DS.receive(DP);���������ݰ�
	��4����ȡ���ݰ����ݣ�����ӡ�ڿ���̨��
	��5���ر���Դ
****/
import java.net.*;
import java.util.*;
import java.io.*;

                     /***ע�Ȿ����������main������ɣ���ʵӦ��д������������***/
//���÷��Ͷ�������
class KeyUDPsend
{
	public static void main(String[] args)throws Exception
	{
		sendServer();
	}

	public static void sendServer()throws Exception
	{
		//��1������DatagramSocket����UDP����DS
		DatagramSocket DS = new DatagramSocket(10000);
		
		//while(true)
		//{
			//��2���ȴ������ݣ����磺���黺����buffers������������װ�����ݰ�DP
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
		    //��3������Socket���͹��ܣ��������ݰ�
		        DS.send(DP);
			}
			
		   
		//}
		
	}
}

//���ý��ն�������
class KeyUDPreceive
{
	public static void main(String[] args)throws Exception
	{
		receiveServer();
		
	}
	public static void receiveServer()throws Exception
	{
		//(1)����UDP��Socket���񣬽����˵�
		DatagramSocket DS = new DatagramSocket(12345);
        while(true)
		{
			//(2)���������ݰ������ڴ洢���յ�������
		    byte[] buffers = new byte[1024];
		    DatagramPacket DP = new DatagramPacket(buffers,buffers.length);

		    //(3)����DS�Ľ��չ��ܣ��������ݰ�
		    DS.receive(DP);

		    //(4)��ȡ���ݰ�����������
            String IP = DP.getAddress().getHostAddress();//��ȡ�Է�������IP��ַ
	        String data = new String(DP.getData(),0,DP.getLength());  //��ȡ���յ������ݣ�˳���õ�һ������ֻ��Ҫ��ȡһ����new String(DP.getData,0,int x);
		    int port = DP.getPort();                     //��ȡ�Է������������еĶ˿�8888,�������ݰ������Ķ˿�10000
		    System.out.println(IP+"---"+data+"---"+port);
		}
		
	}
}