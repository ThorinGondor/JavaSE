/***
1.Դ���������롣
  Ŀ�ģ�����̨��
2.�Ѽ�����������ݴ浽�ļ����С�
  Դ�����̡�
  Ŀ�ģ��ļ�
3.��Ҫ��һ���ļ������ݴ�ӡ������̨�ϡ�
  Դ���ļ���
  Ŀ�ģ�����̨

 ����������࣬�����������´��������޸ĺ���б�ʾ��

 �������������ɣ�
 ����������ܶ࣬��֪�������ĸ�����ʹ�ࡣ
 �����Ҫͨ��������ȷ��ѡ�������ߡ�

 1.��ȷԴ��Ŀ��:
       |---Դ��Ҫ������������ȡ����InputStream(�ֽ���) �� FileReader���ַ�����
	   |---Ŀ����Ҫ���������д������ OutputStream���ֽ����� �� FileWriter���ַ�����
 2.�����������Ƿ��Ǵ��ı�
       |---�Ǵ��ı����Ǿ���Ҫ���ַ���
	   |---���Ǵ��ı�����ô����Ҫ���ֽ���
***/
import java.io.*;
class KeyboardRecord
{
	public static void main(String[] args)throws IOException
	{
		record();
	}

	public static void record()throws IOException
	{
		InputStream IS = System.in; //����һ���ֽڶ�ȡ������ȡ�������������
		InputStreamReader ISR = new InputStreamReader(IS); //���ֽڶ�ȡ��ת��Ϊ�ַ���ȡ��
        //��ӻ��弼��
		BufferedReader BR = new BufferedReader(ISR);

		FileWriter FW = new FileWriter("Record.txt",true);
		BufferedWriter BW = new BufferedWriter(FW);
		
		while(true)
		{
			String str = BR.readLine();
			if("over".equals(str)){break;}
			BW.write(str.toUpperCase());  //˳�㽲������xxx.toUpperCase();�÷���������Stringȫ��д
			BW.flush();
			System.out.println("���Ѽ�¼����������롿");
			BW.newLine();
		}
		BW.close();
		ISR.close();
	}
}