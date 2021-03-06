/****
  SequenceInputStream：该类可以合并流，按照顺序先读取第一个流，再读取第二个流。
***/
import java.io.*;
import java.util.*;

class SequenceDemo
{
	public static void main(String[] args) throws IOException
	{
		Vector<FileInputStream> V = new Vector<FileInputStream>();
		V.add(new FileInputStream("1.txt"));
		V.add(new FileInputStream("2.txt"));
		V.add(new FileInputStream("3.txt"));      //先创建一个向量组，可以存储各个字节读取流的对象

		Enumeration<FileInputStream> En = V.elements();  //创建一个Enumeration列举类，该类可以获取各个字节对象

		SequenceInputStream SIS = new SequenceInputStream(En);  //创建合并流

		FileOutputStream FOS = new FileOutputStream("4.txt");   //创建输出流，将合并流的数据写入目标文本文档
		BufferedOutputStream BOS = new BufferedOutputStream(FOS);
		while(true)
		{
			int ch = SIS.read();  //读取合并流的数据
			if(ch==-1){break;}
			BOS.write((char)ch);  //将读取到的数据通过输出流写入
			BOS.flush();
		}
		SIS.close();
		BOS.close();
	}
}