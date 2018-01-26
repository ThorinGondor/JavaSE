
/***
  LineNumberReader相比BufferedReader，它还可以获取该行字符串的行号，从第一行开始数到最后一行
  获取行号的方法是LNR.getLineNumber();
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
	
	//自定义读取一行的方法
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
	
	//自定义读取行号的方法
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
