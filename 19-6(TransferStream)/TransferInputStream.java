/****
   字节流：InputStream  
   字符流：FileReader

   通过上一例的输入键盘方法发现，其实就是读一行数据的原理
   也即readLine();方法。
   但是，读取键盘数据的方法是InputStream,而readLine方法是给BufferedReader()使用的，BufferedReader又是FileReader的装饰类。
   因此，readLine();是FileReader的一个下属，InputStream不能使用它。
   
   【关键】为了使用该方法，必须将InputStream流转换为FileReader流,才能使用readLine()方法。
   这就是： InputStreamReader!

****/
import java.io.*;
class TransferInputStream
{
	public static void main(String[] args)throws IOException 
	{
		//用InputStream IS读取键盘输入
		InputStream IS = System.in; 
		//将字节流对象转成字符流对象
		InputStreamReader ISR = new InputStreamReader(IS);

		//添加缓存技术BufferedReader();
		BufferedReader BR = new BufferedReader(ISR);
		
		while(true)
		{
			String str = BR.readLine();  //获取一行数据
			if("over".equals(str)){break;} 
			System.out.println(str);  //输出获取的数据
		}
		System.out.println("End");
		BR.close();
	}
}
