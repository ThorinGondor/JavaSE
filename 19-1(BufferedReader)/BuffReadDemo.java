/***
    �ַ����Ļ�������
	    ����������˶����ݵĶ�дЧ��
		�ڴ�����������new BufferedWriter(FW);��֮ǰ�������ȴ���IO���������磺new FileWriter("XXX.txt");��
	    ��Ӧ�ࣺ
	    
		|---BufferedWriter�� ���ı�д���ַ�����������������ַ����Ӷ��ṩ�����ַ������顢�ַ����ĸ�Чд�롣
		                     �û�������д�뻹�ṩ��һ�����з����ܣ�BW.newLine();
		
		|---BufferedReader�� ���ַ��������ж�ȡ�ı�����������ַ����Ӷ�ʵ���ı��ĸ�Ч��ȡ
		                     �������Ķ�ȡ���ṩ��һ�����ܣ�BR.readline();
	    
		���ϣ����弼����IO���Ļ����϶�IO���Ĺ��ܽ�������ǿ��
		
***/
import java.io.*;
import java.util.*;
class BuffReadDemo 
{
	public static void main(String[] args)throws IOException 
	{
		//����Ҫ��ȥ����һ��IO���Ķ���FileReader FR = new FileReader("xxx.txt");�����txt�����
		FileReader FR = new FileReader("Demo.txt");
		//Ϊ���Ч�ʣ��ټ��뻺�弼����
		//��ʱ�ٽ���һ���������BufferedReader���øû����������ȡ���ݣ�ע����Ҫ����Ӧ��IO��������ӽ��������
		BufferedReader BR = new BufferedReader(FR);
		
		/*//ԭ��IO���Ķ�ȡ��ʽΪFR.read();һ��һ�����ݵض�ȡ
		while(true)
		{
			int ch = BR.read();
			if(ch==-1){break;}
			System.out.print((char)ch);
		}
		*/
		//���˻�������ȡ�����ṩ��BR.readLine()��ʵ����һ��һ�еض�ȡ���ݹ��ܣ�Ч�����
		while(true)
		{
			String str = BR.readLine();
			if(str==null)
			{break;}
			System.out.println(str);
		}
		BR.close();
	}
}
