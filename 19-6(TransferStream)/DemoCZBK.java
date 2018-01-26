/***
1.源：键盘输入。
  目的：控制台。
2.把键盘输入的数据存到文件当中。
  源：键盘。
  目的：文件
3.想要将一个文件的数据打印到控制台上。
  源：文件。
  目的：控制台

 以上诸多种类，均可以用以下代码稍作修改后进行表示。

 流操作基本规律：
 由于流对象很多，不知道该用哪个，最痛苦。
 因此需要通过以下两个明确来选择流工具。

 1.先明确源和目的:
       |---源需要输入流，即读取流。InputStream(字节流) 和 FileReader（字符流）
	   |---目的需要输出流，即写入流。 OutputStream（字节流） 和 FileWriter（字符流）
 2.再操作的数据是否是纯文本
       |---是纯文本，那就需要用字符流
	   |---不是纯文本，那么就需要用字节流
  注：当涉及到字符流和字节流之间的转换时，需要用到转化流工具
       |---InputStreamReader();
	   |---OutputStreamWriter();
***/
import java.io.*;

class DemoCZBK
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));  //括号里是源：例如这时是System.in，源就是键盘输入，如果改成文件，那么就是读取该文件
		BufferedWriter BW = new BufferedWriter(new OutputStreamWriter(System.out)); //括号里是目的，例如目前是System.out，目的就是控制台输出，括号里改成文件那么就是写入到文件中

		while(true)  //读取并写入数据
		{
			String str = BR.readLine();
			if("over".equals(str)){break;}
			BW.write(str);
			BW.flush();
			BW.newLine();
			System.out.println("请继续输入：");
		}
		BR.close();
		BW.close();
	}
}
