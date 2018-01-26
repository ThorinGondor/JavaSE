/*****
RandomAccessFile
   ���಻����IO��ϵ�е����࣬����ֱ�Ӽ̳���Object

   ������IO���еĳ�Ա����Ϊ���߱���д����
   �ڲ���װ��һ�����飬����ͨ��ָ��������е�Ԫ�ؽ��в�����
   ����ͨ��getFilePointer��ȡָ��λ��
   ͬʱ����ͨ��seek�ı�ָ��λ��

   ��ʵ��ɶ�д��ԭ������ڲ���װ���ֽ�������������
   
   ͨ�����캯�����Կ���������ֻ�ܲ����ļ���
   ���Ҳ����ļ�����ģʽ��
   
   д���ַ���int�ࣺ
   (1)RAF.write("xxx".getBytes());
   (2)RAF.writeInt(int��);
   
   ��ȡ�ַ���int�ࣺ
   (1)RAF.read(buffer);
      String str = new String(buffer);
   (2)RAF.readInt();
*****/

import java.io.*;
import java.util.*;
class RAFDemo //RandomAccessFile
{
	public static void main(String[] args)throws IOException
	{
		writeFile();  //RAFд��
		readFile();   //RAF��ȡ
	}

	public static void writeFile()throws IOException
	{
		RandomAccessFile RAF = new RandomAccessFile("random.txt","rw"); //rw��ʾ�ļ��ɶ�д\
		
		RAF.write("Curry".getBytes());   //getBytes() ��һ���ַ���ת��Ϊһ���ֽ�����byte[]
		RAF.writeInt(452);               //��ֹ���ݶ�ʧ�����������Ӧʹ��writeInt()����
		RAF.write("Green".getBytes()); 
		RAF.writeInt(658);
		//���˳��Curry452Green658
		RAF.close();
	}

	public static void readFile()throws IOException
	{
		RandomAccessFile RAF = new RandomAccessFile("random.txt","r");  //"r"��ʾ���ļ�ֻ��
		
		RAF.seek(9);
		byte[] buffer = new byte[5];//����������String��
		RAF.read(buffer); //���ȶ�ȡString�ൽbuffer
		String str = new String(buffer); //�ٽ�buffer����תΪString��
        int num = RAF.readInt();  //��int�������ݿ�ֱ�Ӷ�ȡ

		System.out.println("str:"+str);
		System.out.println("num:"+num);
		RAF.close();
	}
}