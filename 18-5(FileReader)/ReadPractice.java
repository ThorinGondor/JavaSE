/***
  �������󣺽�Note���ı�������destination�ı����С�
  Ӧ��ʹ��FileReader��������ch���ٽ�chǿת��char������FileWriterд��destination�ı�
***/
import java.util.*;
import java.io.*;

class ReadPractice
{
	public  static void main(String[] args)throws IOException
	{
		FileReader FR = new FileReader("F:\\Note.txt");
		FileWriter FW = new FileWriter("F:\\Destination.java",true);
		while(true)
		{
			int ch = FR.read();  //��ȡNote������
			if(ch==-1){break;}   //�����ȡ��ĩβ������ѭ��
			
			FW.write((char)ch);  //�������ݷŽ�IO������������
			FW.flush();          //��IO�����������������ݴ����ĵ�destination
		    
			System.out.print((char)ch);
		}	
		FR.close();
		FW.close();
	}
}