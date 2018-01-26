/***
    字符流的缓冲区：
	    缓冲区提高了对数据的读写效率
		在创建缓冲区【new BufferedWriter(FW);】之前，必须先创建IO流对象【例如：new FileWriter("XXX.txt");】
	    对应类：
	    |---BufferedWriter： 将文本写入字符输入流。缓冲各个字符，从而提供单个字符、数组、字符串的高效写入。
		|---BufferedReader： 
	    在IO流的基础上对IO流的功能进行了增强。
		该缓冲区还提供了一个换行符功能：BW.newLine();
***/
import java.util.*;
import java.io.*;
class BuffWriteDemo
{
	public static void main(String[] args)throws IOException
	{
		//（1）先创建IO流对象FW,以及目标文件buff.txt
		FileWriter FW = new FileWriter("buff.txt",true);  
		
		//（2）为提高字符写入流的效率，加入缓冲区技术，因此创建一个缓冲区BufferedWriter的对象BW.
		//注意！！！创建时需要将IO流对象FW添加入该缓冲区的构造函数。
		BufferedWriter BW = new BufferedWriter(FW);
		BW.write("ABCDE;");
		BW.newLine();//换行功能
		BW.write("FGHJK;");
		BW.flush();
		
		//（3）关闭缓冲区即可，不需要再去关闭IO流对象
		BW.close();
	}
}