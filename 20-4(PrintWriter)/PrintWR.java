/***
������ʾPrintWriter();��PrintReader();

����֮ǰ��ѧ����ӡ��ȥ��System.out��������ֽ����ͣ�����Ҫ�����صش���һ���ֽ������FileOutputStream��Ŀ����"System.out"��
                                    ������ַ����ͣ�����Ҫ�����µ��ַ��������FileWriter--->BufferedWriter,BW.write(System.out);
			  ����鷳!!!

��ӡ����
����ר���ṩ�˴�ӡ���������Խ������������͵�����ԭ����ӡ��
  |---�ֽڴ�ӡ�� �ࣺ
      PrintStream�����Խ��յĲ������ͣ���1��file����2���ַ���·��String��3���ֽ������ OutputStream
  
  |---�ַ���ӡ�� �ࣺ�����ֽڴ�ӡ��������,����ͨ���Լ�ǿ��
      PrintWriter�����Խ��յĲ������ͣ���1��file����2���ַ���·��String��3���ֽ������OutputStream ��4���ַ������ FileWriter
	  �÷���newһ��PrintWriter�Ķ���out��Ȼ���ú������ܣ�out.write(str);out.flush(); ---> out.close();����
	                                                ���ߣ�out.println(); ---> out.close();����
***/
import java.io.*;
import java.util.*;

class PrintWR
{
	public static void main(String[] args) throws IOException
	{
		//�����ֽڶ�ȡ��Ϊ��������
		InputStream FIS = System.in;
		//�ֽڶ�ȡ�����ַ���ȡ��
		InputStreamReader ISR = new InputStreamReader(FIS);
		//�����ַ���ȡ���Ļ��漼��
		BufferedReader BR = new BufferedReader(ISR);
        //������ӡ���Ķ���out
		PrintWriter out = new PrintWriter(System.out);
		
		while(true)
		{
			String str = BR.readLine();
			if("over".equals(str)){break;}
			//out.write(str);  //һ������д��PrintWriter�Դ��Ļ�����
			//out.flush();
			out.println(str);  //��һ������д��PrintWriter�Դ��Ļ�����
		}
		out.close();  //�رպ���ӡ���������������
	}
}