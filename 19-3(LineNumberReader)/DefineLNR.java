
/***
  LineNumberReader���BufferedReader���������Ի�ȡ�����ַ������кţ��ӵ�һ�п�ʼ�������һ��
  ��ȡ�кŵķ�����LNR.getLineNumber();
***/
import java.io.*;
import java.util.*;
class MyLineNumberReader
{
	private FileReader FR;
	public int LineNumber;
	MyLineNumberReader(FileReader FR)
	{
		this.FR=FR;
	}
	
	//�Զ����ȡһ�еķ���
	public String readLine()throws IOException
	{
		LineNumber++;
		StringBuilder SB = new StringBuilder();
		int ch=0;
		while(true)
		{
			ch=FR.read();
			if(ch==-1){break;}
			if(ch=='\r'){continue;}
			else if(ch=='\n'){return SB.toString();}
			SB.append((char)ch);
			
		}
		if(SB.length()!=0)
		{
			return SB.toString();
		}
		return null;
	}
	
	//�Զ����ȡ�кŵķ���
	public int getLineNumber()
	{
		return LineNumber; 
	}
}
class DefineLNR
{
	public static void main(String[] args)throws IOException 
	{
		FileReader FR = new FileReader("Note.txt");
		MyLineNumberReader MLNR = new MyLineNumberReader(FR);
		while(true)
		{
			String str = MLNR.readLine();
			if(str==null){break;}
			System.out.println(MLNR.getLineNumber()+": "+str);
		}
		
	}
}