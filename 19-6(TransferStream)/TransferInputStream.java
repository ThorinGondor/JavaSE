/****
   �ֽ�����InputStream  
   �ַ�����FileReader

   ͨ����һ����������̷������֣���ʵ���Ƕ�һ�����ݵ�ԭ��
   Ҳ��readLine();������
   ���ǣ���ȡ�������ݵķ�����InputStream,��readLine�����Ǹ�BufferedReader()ʹ�õģ�BufferedReader����FileReader��װ���ࡣ
   ��ˣ�readLine();��FileReader��һ��������InputStream����ʹ������
   
   ���ؼ���Ϊ��ʹ�ø÷��������뽫InputStream��ת��ΪFileReader��,����ʹ��readLine()������
   ����ǣ� InputStreamReader!

****/
import java.io.*;
class TransferInputStream
{
	public static void main(String[] args)throws IOException 
	{
		//��InputStream IS��ȡ��������
		InputStream IS = System.in; 
		//���ֽ�������ת���ַ�������
		InputStreamReader ISR = new InputStreamReader(IS);

		//���ӻ��漼��BufferedReader();
		BufferedReader BR = new BufferedReader(ISR);
		
		while(true)
		{
			String str = BR.readLine();  //��ȡһ������
			if("over".equals(str)){break;} 
			System.out.println(str);  //�����ȡ������
		}
		System.out.println("End");
		BR.close();
	}
}