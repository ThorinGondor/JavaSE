/****
�����:����--->���롣
       д��ʱ�����ַ���UTF-8�ķ�ʽ���б����д���ı���
       ��ȡʱ������UTF-8�ķ�ʽ��������ȡԭ�ַ���
	   �����������뷽ʽ��ͬ������������롣
****/
import java.util.*;
import java.io.*;

class EncodeStream 
{
	public static void main(String[] args) throws IOException
	{
		writeText();
		readText();
	}
	public static void writeText()throws IOException
	{
		FileOutputStream FOS = new FileOutputStream("UTF.txt");
		OutputStreamWriter OSW = new OutputStreamWriter(FOS,"UTF-8");//д��ʱ����UTF-8�ı��뷽ʽ
		BufferedWriter BW = new BufferedWriter(OSW);
		
		//д��
		BW.write("���");
		BW.newLine();
		BW.write("�ټ�");
		BW.close();
	}
	public static void readText()throws IOException
	{
		FileInputStream FIS = new FileInputStream("UTF.txt");
		InputStreamReader ISR = new InputStreamReader(FIS,"UTF-8");  //�����ȡʱû����UTF-8�ķ�ʽ���룬��ô���������
		BufferedReader BR = new BufferedReader(ISR);
		
		//��ȡ
		while(true)
		{
			String str = BR.readLine();
			if(str==null){break;}
			System.out.println("STR:"+str);
		}
		BR.close();
	}
}
