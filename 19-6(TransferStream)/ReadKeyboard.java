/****
��ȡ����¼�룺
System.out.println();�Ǳ�׼������豸������̨��
System.in ���Ӧ���Ǳ�׼�������豸�����̡�

����ͨ�������������ݡ���¼��һ������ʱ���ͽ������ݽ��д�ӡ
���¼���������over����ֹͣ¼��
****/
import java.io.*;

class ReadKeyboard
{
	public static void main(String[] args)throws IOException
	{
		InputStream IS = System.in;  //��������������ݽ��ж�ȡ
		StringBuilder SB = new StringBuilder(); //����һ������װ�����������
		while(true)
		{
			int ch = IS.read();
			if((char)ch=='*'){break;} //������Ϊ*;������ѭ��
			SB.append((char)ch);
			System.out.print((char)ch);	
		}
		System.out.println("SB:"+SB);
		
		IS.close();
	}
}