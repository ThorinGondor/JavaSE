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
 �����Ҫͨ������������ȷ��ѡ�������ߡ�

 1.����ȷԴ��Ŀ��:
       |---Դ��Ҫ������������ȡ����InputStream(�ֽ���) �� FileReader���ַ�����
	   |---Ŀ����Ҫ���������д������ OutputStream���ֽ����� �� FileWriter���ַ�����
 2.�ٲ����������Ƿ��Ǵ��ı�
       |---�Ǵ��ı����Ǿ���Ҫ���ַ���
	   |---���Ǵ��ı�����ô����Ҫ���ֽ���
  ע�����漰���ַ������ֽ���֮���ת��ʱ����Ҫ�õ�ת��������
       |---InputStreamReader();
	   |---OutputStreamWriter();
***/
import java.io.*;

class DemoCZBK
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));  //��������Դ��������ʱ��System.in��Դ���Ǽ������룬����ĳ��ļ�����ô���Ƕ�ȡ���ļ�
		BufferedWriter BW = new BufferedWriter(new OutputStreamWriter(System.out)); //��������Ŀ�ģ�����Ŀǰ��System.out��Ŀ�ľ��ǿ���̨�����������ĳ��ļ���ô����д�뵽�ļ���

		while(true)  //��ȡ��д������
		{
			String str = BR.readLine();
			if("over".equals(str)){break;}
			BW.write(str);
			BW.flush();
			BW.newLine();
			System.out.println("��������룺");
		}
		BR.close();
		BW.close();
	}
}