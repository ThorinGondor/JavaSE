/***

��ʾ����ν����е����ݴ洢��������
��ν�Info.txt�еļ�ֵ���ݴ浽�����н��в���

��һ��
   1.��һ������info.txt�ļ�����
   2.��ȡһ�����ݣ�������������"="�����и�: split("=");
   3.��ʽ��ߴ���key���ұߴ���value

������
���������Ƚ��鷳��Properties�����и�����ĺ�������:
   load(FIS);   ��Txt to Properties��
�ù����ܹ������ֽڶ�ȡ���������Զ�����ȡ�����ַ��еġ�=�������и���߷ֱ�Ž�Properties��key��value
   store(FOS,"xxx");   ��Properties To Txt��
�ù����ܹ������ֽ�д���������Խ����ú��Property��һ��ӳ�����Ŀ��txt�ĵ�

***/
import java.io.*;
import java.util.*;
class TxtToProperties
{
	public static void main(String[] args) throws IOException
	{
		ReadAndWrite1();
		ReadAndWrite2();
	}

	/***��һ�����Ƚ��鷳��***/
	public static void ReadAndWrite1()throws IOException
	{
		FileReader FR = new FileReader("Info.txt");
		BufferedReader BR = new BufferedReader(FR);
        Properties prop = new Properties();
		
		while(true) //��ȡ�ı��ĵ��е���������
		{
			String str = BR.readLine();
			if(str==null)
			{break;}
			String[] arr = str.split("=");  //split();���ܿ��Ը���ĳһ�ַ����������и�и������������,�и��Ž�arr[0]��arr[1]
			prop.setProperty(arr[0],arr[1]); //
		}
		System.out.println(prop);
		BR.close();
	}

	/***������prop.load(FIS);***/
	public static void ReadAndWrite2()throws IOException
	{
		FileInputStream FIS = new FileInputStream("Info.txt");
		Properties prop = new Properties();
		prop.load(FIS);//load�����ܹ������ֽڶ�ȡ����ͨ����ȡ��ֱ�ӽ�ӳ�����Properties������
		System.out.println(prop);

		prop.setProperty("NickYoung","6");  //��Properties����ӡ��޸�һ��ӳ��
		
		FileOutputStream FOS = new FileOutputStream("Info.txt");
		prop.store(FOS,"Shit");//store�����ܹ������ֽ��������ͨ�����������ӳ������ı��ĵ�
		System.out.println(prop);
	}
}
