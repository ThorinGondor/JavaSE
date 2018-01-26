/***
   �������󣺽�Source.txt���ڸ���ճ�����µ��ĵ�����
***/
import java.util.*;
import java.io.*;

class CopyFile 
{
	public static void main(String[] args)throws IOException 
	{
		//��1���ȴ���һ��IO��ȡ����һ��IO����������
		FileReader FR = new FileReader("Source.txt");
		FileWriter FW = new FileWriter("destination.txt",true);

		//��2�����뻺�弼�����ٴ���һ��BufferedReader��BufferedWriter����������,�����˰�֮ǰ��IO��������ӽ����캯��
		BufferedReader BR = new BufferedReader(FR);
		BufferedWriter BW = new BufferedWriter(FW);

		//��3����ȡ��д��
		while(true)
		{
			String str = BR.readLine(); //��ȡһ������
			if(str==null){break;}
			BW.write(str);               //д���������
			BW.flush();                  //������ˢ��
			BW.newLine();                //����
		}
		BR.close();
		BW.close();
	}
}
