/****
编码表：编码--->解码
      |---编码：字符串变成字节数组
	             String--->byte[]函数方法: String.getBytes("编码方式");
	  |---解码：字节数组变成字符串
	             byte--->String函数方法: new String(byte[],"解码方式");

默认编码解码方式是GBK，除此之外还有UTF-8、ISO8859-1等编码解码形式

本例使用GBK编码--->ISO解码--->ISO编码--->GBK解码方式还原该字符
****/
import java.util.*;
import java.io.*;

class EncodeDecode2
{
	public static void main(String[] args) throws IOException
	{
		//GBK编码
		String str = "蒂法洛克哈特~";
		byte[] buffer = new byte[1024];
		buffer = str.getBytes("GBK");
        //ISO解码
		String str2 = new String(buffer,"ISO8859-1");//这里不能是UTF-8编码解码方式！
        System.out.println(str2);
		//ISO编码
		byte[] buffer2 = new byte[1024];
		buffer2 = str2.getBytes("ISO8859-1");
		//GBK解码
		String str3 = new String(buffer2,"GBK");
		System.out.println(str3);
	}
}