/***
    �ַ����Ļ�������
	    ����������˶����ݵĶ�дЧ��
		�ڴ�����������new BufferedWriter(FW);��֮ǰ�������ȴ���IO���������磺new FileWriter("XXX.txt");��
	    ��Ӧ�ࣺ
	    |---BufferedWriter�� ���ı�д���ַ�����������������ַ����Ӷ��ṩ�����ַ������顢�ַ����ĸ�Чд�롣
		|---BufferedReader�� 
	    ��IO���Ļ����϶�IO���Ĺ��ܽ�������ǿ��
		�û��������ṩ��һ�����з����ܣ�BW.newLine();
***/
import java.util.*;
import java.io.*;
class BuffWriteDemo
{
	public static void main(String[] args)throws IOException
	{
		//��1���ȴ���IO������FW,�Լ�Ŀ���ļ�buff.txt
		FileWriter FW = new FileWriter("buff.txt",true);  
		
		//��2��Ϊ����ַ�д������Ч�ʣ����뻺������������˴���һ��������BufferedWriter�Ķ���BW.
		//ע�⣡��������ʱ��Ҫ��IO������FW�����û������Ĺ��캯����
		BufferedWriter BW = new BufferedWriter(FW);
		BW.write("ABCDE;");
		BW.newLine();//���й���
		BW.write("FGHJK;");
		BW.flush();
		
		//��3���رջ��������ɣ�����Ҫ��ȥ�ر�IO������
		BW.close();
	}
}