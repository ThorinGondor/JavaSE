/****
编码表：编码--->解码
      |---编码：字符串变成字节数组
	             String--->byte[]函数方法: String.getBytes("编码方式");
	  |---解码：字节数组变成字符串
	             byte--->String函数方法: new String(byte[],"解码方式");

默认编码解码方式是GBK，除此之外还有UTF-8、ISO8859-1等编码解码形式
****/
import java.util.*;
import java.io.*;

class EncodeDecode
{
	public static void main(String[] args) throws IOException
	{
		//编码：
		String s = "你好";
		byte[] buffer = new byte[1024];
		buffer = s.getBytes("UTF-8");  //将字符根据GBK编码方式写入缓冲区
		
		System.out.println(buffer);  
		System.out.println(Arrays.toString(buffer));  //字符在数组中以int类型存在的形式,根据编码方式的不同，数据也不相同
		//解码：
		System.out.println(new String(buffer,"GBK"));  //这里由于没有用UTF方式解码，输出将是乱码：浣犲ソ
	}
}