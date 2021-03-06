/****
  
正则表达式：符合一定规则的表达式
    作用：用于专门操作字符串。
	特点：用一些特地的符号来表示一些代码操作，这样就简化书写。因此学习正则表达式，就是在学习一些特殊符号的使用。
	好处：可以简化对字符串的复杂操作。

具体操作匹配：
    1、匹配：String matches()方法，用规则匹配字符串，只要有一处不符合规则，matches就返回false
	2、切割：String split()方法
	3、替换：String replace()、replaceAll()方法。
	4、获取：
	
	本例演示：正则表达式替换字符串的字符
   
****/

class ReplaceRegex
{
	public static void main(String[] args)
	{
		ReplaceDemo1();
		ReplaceDemo2();
	}
	public static void ReplaceDemo1()
	{
		String str = "KevonD13818183068uran13918771046t"; //屏蔽：将连续的数字换成一个#号
		String reg = "\\d{5,}";  //这里 //d表示任意数字，{5,}表示至少出现五次
		String newstr = str.replaceAll(reg,"#");
		System.out.println(newstr);
	}
	public static void ReplaceDemo2()
	{
		String str = "dsddadKKsdquiRRRRcdsasdmmmsadeqqqdseweWWWWWsdff";
		String regex = "(.)\\1+";
		String newstr = str.replaceAll(regex,"#"); //将重复的字符换成#号
		System.out.println(newstr);
        
		String str2 = "dsddadKKsdquiRRRRcdsasdmmmsadeqqqdseweWWWWWsdff";
		String newstr2 = str2.replaceAll(regex,"$1");  //将重复的字符换成单个字符，$1表示获取前一个规则表达式的第一个字符(.)
        System.out.println(newstr2);
	}
}