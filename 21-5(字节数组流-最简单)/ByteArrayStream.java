/****
ByteArrayStream 操作字节数组：它的形式是最简单的,除非使用writeTo();否则其字节数据的传输仅存在于代码当中.

   |---ByteArrayInputStream:包含了一个内部缓冲区需要接收数据源，且该接收数据源是一个字节数组
   |---ByteArrayOutputStream:它输出的数据写入一个byte数组，且该缓冲区会随着数据不断写入而自动增长，可以使用 toByteArray()和toString()获取数据。
                             因此创建该类对象不需要定义数据目的！
并且这两个流对象都操作数组缓冲区，并未调用系统资源，故而不需要close();

与上述对应的类还有CharArrayWriter和 CharArrayReader，形式是最简单的，其字符数据的传输仅存在于代码当中。
    。。。。。。下面内容与上同

要用流的思想来操作数据
****/

import java.io.*;
import java.util.*;
class ByteArrayStream
{
	public static void main(String[] args)throws IOException
	{
		//数据读取源
		ByteArrayInputStream BAIS = new ByteArrayInputStream("ABCDE".getBytes());
		//数据写入目的
		ByteArrayOutputStream BAOS = new ByteArrayOutputStream();
        
		//读写操作
		while(true)
		{
			int ch =BAIS.read();
			if(ch==-1){break;}
			BAOS.write(ch);
		}
		System.out.println(BAOS.toString());
		System.out.println(BAOS.size());
	}
}