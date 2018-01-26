/****
  
正则表达式：符合一定规则的表达式
    作用：用于专门操作字符串。
	特点：用一些特地的符号来表示一些代码操作，这样就简化书写。因此学习正则表达式，就是在学习一些特殊符号的使用。
	好处：可以简化对字符串的复杂操作。

具体操作匹配：
    1、匹配：String matches()方法，用规则匹配字符串，只要有一处不符合规则，matches就返回false
	2、切割：String split()方法
	3、替换：String replace()、replaceAll()方法。
	4、获取：Pattern、Matcher
	
	本例演示第四个：正则表达式获取字符串的字符。
	获取概述：就是将字符串中符合规则的子串取出。
	操作步骤：
	（1）先将正则表达式封装成对象，需建立Pattern的对象
	（2）让正则表达式对象和要操作的字符串相关联，需建立匹配器Matcher的对象。
	（3）关联后，获取正则匹配引擎。
	（4）通过引擎对符合规则的子串进行操作，例如取出
   
****/
import java.util.regex.*;

class GetRegex 
{
	public static void main(String[] args) 
	{
		getDemo();
	}
	public static void getDemo()
	{
		String line = "Ma Shang jiu yao kai xue le";  //要被操作的字符串
		String regex = "\\b[a-zA-Z]{3}\\b"; //这里\\b意思为单词边界，是边界匹配器
		
		//(1)通过创建Pattern的对象pt，使用compile();方法将规则封装成对象
		Pattern pt = Pattern.compile(regex);
		
		//(2)创建Matcher的对象Mc，使用matcher();方法关联字符串
		Matcher Mc = pt.matcher(line);
		
		//(3)使用find();方法寻找符合规则的子串，再利用group();方法获取找到的子串
		while(Mc.find())
		{
			System.out.println(Mc.group());
			System.out.println(Mc.start()+"----"+Mc.end()); //获取到的子串的第一个字符和最后一个字符的位置
		}
	}
}
