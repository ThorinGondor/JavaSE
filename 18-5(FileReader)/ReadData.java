/***
   �������󣺶�ȡһ���ļ����е������ַ���
   ����һ��FileReader��������ȡ�����󣬺�ָ�����ļ������
   ʹ��FR.read()�������ݣ�ע�������ȡ�Ľ���int�࣬��Ҫ��ӡ�����charת����
   ������ĩβ��FR.read()������������-1;
***/
import java.io.*;
import java.util.*;

class ReadData
{
	public static void main(String[] args)throws IOException
	{
		FileReader FR = new FileReader("Note.txt"); //����һ���ļ�FR��ȡ�����󣬺�ָ�����Ƶ��ļ�(Note.txt)�������
        //��ȡ����һ��
		while(true)
		{
			int ch = FR.read(); //FR.read();��һ��int�������ݣ����Ҫ��ӡ�����Ҫǿת��char���͡�
		    if(ch==-1){break;}  //����ȡ��ĩβ�Ժ�FR.read()�᷵��-1;��ʱӦ����ѭ��
			sop((char)ch);
		}
		
        /*//��ȡ�������� 
		char[] buffer = new char[6];
        int num = 0;
		while((num=FR.read())!=-1)
		{
			System.out.println(new String(buffer,0,num));
		}
		*/
		

		FR.close();
	}
	public static void sop(Object o)
	{
		System.out.print(o);
	}
}