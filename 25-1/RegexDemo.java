/****
正则表达式：符合一定规则的表达式
    作用：用于专门操作字符串。
	特点：用一些特地的符号来表示一些代码操作，这样就简化书写。因此学习正则表达式，就是在学习一些特殊符号的使用。
	好处：可以简化对字符串的复杂操作。

具体操作匹配：
    1、匹配：String matches()方法，用规则匹配字符串，只要有一处不符合规则，matches就返回false
	2、切割：String split()方法
	3、替换：String replace()、replaceAll()方法
****/

/****
本例需求：
    对qq号码进行校验
	要求：5~15,0不能开头，只能是数字
****/
class RegexDemo
{
	public static void main(String[] args) 
	{
		QQcheck();
		Demo();
	}
	public static void QQcheck() 
	{
		String qq = "1360002051";
		String regex = "[1-9]\\d{9}";  
		boolean flag = qq.matches(regex);    //进行匹配，返回boolean值

		if(flag==true)
		{
			System.out.println("OK");
		}
		else
		{
			System.out.println("Invalid");
		}
	}

	public static void Demo()
	{
		String str = "cy";
		String regex = "[abc][x-z]";  //第一位必须是abc中的一个，第二位必须是x到z;而且！该规则只能校验长度为2的字符串！
		boolean flag = str.matches(regex);
		System.out.println(flag);
	}
}
