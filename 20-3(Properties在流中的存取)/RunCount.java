/***
Properties�����и�����ĺ�������:
   load(FIS);   ��Txt to Properties��
�ù����ܹ������ֽڶ�ȡ���������Զ�����ȡ�����ַ��еġ�=�������и���߷ֱ�Ž�Properties��key��value
   store(FOS,"xxx");   ��Properties To Txt��
�ù����ܹ������ֽ�д���������Խ����ú��Property��һ��ӳ�����Ŀ��txt�ĵ�

***/
import java.io.*;
import java.util.*;

class RunCount
{
	public static void main(String[] args) throws IOException
	{
		Properties prop = new Properties();
		
		/***��1��Txt�����ݽ���Properties**/
		FileInputStream FIS = new FileInputStream("count.ini");
		prop.load(FIS); //��FIS���е����ݼ��ص���prop������
        
		/***��2���޸�Properties�ڲ��ĸ�����***/
		int count = 0;
		String value=prop.getProperty("time");
		count = Integer.parseInt(value);  //����String���valueǿת��int��
		count++;
		prop.setProperty("time",count+"");
        
		/***��3�������޸ĺ�����ݷ���txt�ļ�***/
		FileOutputStream FOS = new FileOutputStream("count.ini");
		prop.store(FOS,"Accumlate");
	}
}
