import java.io.*;
import java.net.*;

class Client
{
	public static void main(String[] args) throws Exception
	{
		Socket S = new Socket("192.168.1.108",31000);
		//��ȡͼƬ���ֽ�����ת��Ϊ�ַ���
		BufferedInputStream BIS = new BufferedInputStream(new FileInputStream("F:\\Ferrari.jpg"));
		//��ȡ���������
		BufferedOutputStream Bout = new BufferedOutputStream(S.getOutputStream());
        
		//�ϴ�����
		int ch = 0;
		while((ch = BIS.read())!=-1)
		{
			Bout.write((char)ch);
		}

        //�ϴ�����
		S.shutdownOutput(); 
        
		//���շ���˷���
		BufferedReader Bin = new BufferedReader(new InputStreamReader(S.getInputStream()));
		String str = Bin.readLine();
		System.out.println(str);
        
		//�ر���
		BIS.close();
		S.close();
	}
}

class Server
{
	public static void main(String[] args) throws Exception
	{
		ServerSocket SS = new ServerSocket(31000);
		Socket S = SS.accept();

		//��ȡ���Կͻ��˵�����������
        BufferedInputStream Bin = new BufferedInputStream(S.getInputStream());
		//��������д�뱾�ص�Ŀ���ļ�
		BufferedOutputStream BW = new BufferedOutputStream(new FileOutputStream("COPY.jpg"));
		
		//д��
		int ch = 0;
		while((ch = Bin.read())!=-1)
		{
			BW.write((char)ch);
		}
		//д�������������������ͷ����ַ�
		BufferedWriter Bout = new BufferedWriter(new OutputStreamWriter(S.getOutputStream()));
		Bout.write("�ϴ��ɹ���");
		Bout.newLine();
		Bout.flush();

		//�ر�
		BW.close();
		SS.close();
	}
}
