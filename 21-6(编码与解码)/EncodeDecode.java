/****
���������--->����
      |---���룺�ַ�������ֽ�����
	             String--->byte[]��������: String.getBytes("���뷽ʽ");
	  |---���룺�ֽ��������ַ���
	             byte--->String��������: new String(byte[],"���뷽ʽ");

Ĭ�ϱ�����뷽ʽ��GBK������֮�⻹��UTF-8��ISO8859-1�ȱ��������ʽ
****/
import java.util.*;
import java.io.*;

class EncodeDecode
{
	public static void main(String[] args) throws IOException
	{
		//���룺
		String s = "���";
		byte[] buffer = new byte[1024];
		buffer = s.getBytes("UTF-8");  //���ַ�����GBK���뷽ʽд�뻺����
		
		System.out.println(buffer);  
		System.out.println(Arrays.toString(buffer));  //�ַ�����������int���ʹ��ڵ���ʽ,���ݱ��뷽ʽ�Ĳ�ͬ������Ҳ����ͬ
		//���룺
		System.out.println(new String(buffer,"GBK"));  //��������û����UTF��ʽ���룬����������룺你好
	}
}