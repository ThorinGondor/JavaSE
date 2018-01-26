/*****
RandomAccessFile
   ���಻����IO��ϵ�е����࣬����ֱ�Ӽ̳���Object

   ������IO���еĳ�Ա����Ϊ���߱���д����
   �ڲ���װ��һ�����飬����ͨ��ָ��������е�Ԫ�ؽ��в�����
   ����ͨ��getFilePointer��ȡָ��λ��
   ͬʱ����ͨ��seek�ı�ָ��λ��

   ��ʵ��ɶ�д��ԭ�������ڲ���װ���ֽ�������������
   
   ͨ�����캯�����Կ���������ֻ�ܲ����ļ���
   ���Ҳ����ļ�����ģʽ:
   
   д���ַ���int�ࣺ
   (1)RAF.write("xxx".getBytes());
   (2)RAF.writeInt(int��);
   
   ��ȡ�ַ���int�ࣺ
   (1)RAF.read(buffer);
      String str = new String(buffer);
   (2)RAF.readInt();

   �ö���Ĺ��캯��Ҫ�������ļ�������ڣ�Ҳ������ļ����и���
*****/

import java.io.*;
import java.util.*;

class RAFDemo2
{
	public static void main(String[] args) throws IOException
	{
		writeFile();
		readFile();
	}

	public static void writeFile()throws IOException
	{
		RandomAccessFile RAF = new RandomAccessFile("random2.txt","rw");

        RAF.seek(8*0);
		RAF.write("����".getBytes());
		RAF.writeInt(433);
		RAF.close();
	}
	public static void readFile()throws IOException
	{
		RandomAccessFile RAF = new RandomAccessFile("random2.txt","r");

		byte[] buffer = new byte[7];
		RAF.read(buffer);
		String str = new String(buffer);
		int num=RAF.readInt();
		System.out.println("str:"+str);
		System.out.println("num"+num);

		RAF.close();
	}
}