/****
  SequenceInputStream��������Ժϲ���������˳���ȶ�ȡ��һ�������ٶ�ȡ�ڶ�����
***/
import java.io.*;
import java.util.*;
class CombineStream
{
	public static void main(String[] args)throws IOException
	{
		Vector<FileInputStream> V = new Vector<FileInputStream>();
		V.add(new FileInputStream("F:\\����Ƭβ��.mp3"));
		V.add(new FileInputStream("F:\\ӣ����.mp3"));
		
		Enumeration<FileInputStream> EN = V.elements();

        //�����ֽڶ�ȡ�ϲ���
		SequenceInputStream SIS = new SequenceInputStream(EN);
        
		//�����ֽ������
		FileOutputStream FOS = new FileOutputStream("F:\\�������.mp3");
		BufferedOutputStream BOS = new BufferedOutputStream(FOS);
	    
		while(true)
		{
			int ch = SIS.read();
			if(ch==-1){break;}
			BOS.write((char)ch);
			BOS.flush();
		}
		BOS.close();
		SIS.close();
	}
}