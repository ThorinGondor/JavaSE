/***
  LineNumberReader相比BufferedReader，它还可以获取该行字符串的行号，从第一行开始数到最后一行
  获取行号的方法是LNR.getLineNumber();
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