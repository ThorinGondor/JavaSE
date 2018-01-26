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
 因此需要通过两个明确来选择流工具。

 1.明确源和目的:
       |---源需要输入流，即读取流。InputStream(字节流) 和 FileReader（字符流）
	   |---目的需要输出流，即写入流。 OutputStream（字节流） 和 FileWriter（字符流）
 2.操作的数据是否是纯文本
       |---是纯文本，那就需要用字符流
	   |---不是纯文本，那么就需要用字节流
***/
import java.io.*;
class KeyboardRecord
{
	public static void main(String[] args)throws IOException
	{
		record();
	}

	public static void record()throws IOException
	{
		InputStream IS = System.in; //创建一个字节读取流，读取键盘输入的数据
		InputStreamReader ISR = new InputStreamReader(IS); //将字节读取流转化为字符读取流
        //添加缓冲技术
		BufferedReader BR = new BufferedReader(ISR);

		FileWriter FW = new FileWriter("Record.txt",true);
		BufferedWriter BW = new BufferedWriter(FW);
		
		while(true)
		{
			String str = BR.readLine();
			if("over".equals(str)){break;}
			BW.write(str.toUpperCase());  //顺便讲个内容xxx.toUpperCase();该方法可以让String全大写
			BW.flush();
			System.out.println("【已记录，请继续输入】");
			BW.newLine();
		}
		BW.close();
		ISR.close();
	}
}