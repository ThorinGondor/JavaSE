import java.util.*;
import java.io.*;

class PicCopy2
{
	public static void main(String[] args)throws IOException
	{
		copy();
	}
	public static void copy()throws IOException
	{
		//�����ֽڶ�ȡ�����ֽ�д����
		FileInputStream FIS = new FileInputStream("F:\\Porsche.jpg");
		FileOutputStream FOS = new FileOutputStream("F:\\Copy2.jpg");
		//�����ֽڻ�����
		byte[] buffer = new byte[FIS.available()];

		while(true)
		{
			int ch = FIS.read(buffer); //��1����ʽ����ȡ�����͵�������
			if(ch==-1){break;} //��2�������ȡ���������ѭ��
			FOS.write(buffer);//��3��������д��Ŀ��ͼ
		}
		FIS.close();
		FOS.close();
	}
}