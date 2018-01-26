/****
  SequenceInputStream：该类可以合并流，按照顺序先读取第一个流，再读取第二个流
***/
import java.io.*;
import java.util.*;
class CombineStream
{
	public static void main(String[] args)throws IOException
	{
		Vector<FileInputStream> V = new Vector<FileInputStream>();
		V.add(new FileInputStream("F:\\秒五片尾曲.mp3"));
		V.add(new FileInputStream("F:\\樱花抄.mp3"));
		
		Enumeration<FileInputStream> EN = V.elements();

        //创建字节读取合并流
		SequenceInputStream SIS = new SequenceInputStream(EN);
        
		//创建字节输出流
		FileOutputStream FOS = new FileOutputStream("F:\\混合音乐.mp3");
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