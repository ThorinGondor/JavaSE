import java.io.*;
import java.net.*;

class ClientText
{
	public static void main(String[] args) throws Exception
	{
		//����TCPЭ�黷��
		Socket S = new Socket("192.168.1.108",23400);
		//��ȡ�ı�
		BufferedReader BR = new BufferedReader(new FileReader("1.txt"));
		//��ȡ���������
		BufferedWriter Bout = new BufferedWriter(new OutputStreamWriter(S.getOutputStream()));
		
		String line = null;
		while((line = BR.readLine())!=null)
		{
			Bout.write(line);
			Bout.newLine();
			Bout.flush();
		}
		
		S.shutdownOutput(); //�رտͻ��˵�������������൱���Ǹ��������

		//��ȡ����������
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
		Bout.write("�������");
		Bout.newLine();
		Bout.flush();

		BW.close();
		SS.close();
	}
}