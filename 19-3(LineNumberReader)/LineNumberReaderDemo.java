/***
  LineNumberReader���BufferedReader���������Ի�ȡ�����ַ������кţ��ӵ�һ�п�ʼ�������һ��
  ��ȡ�кŵķ�����LNR.getLineNumber();
***/
import java.io.*;
import java.util.*;

class LineNumberReaderDemo 
{
	public static void main(String[] args)throws IOException
	{
		FileReader FR = new FileReader("Note.txt");
		LineNumberReader LNR = new LineNumberReader(FR);
		
		while(true)
		{
			String str = LNR.readLine();
			if(str==null){break;}
			System.out.println(LNR.getLineNumber()+":"+str);
		}
		LNR.close();
	}
}