/*
Exception中有一个特殊的子类异常，叫做RunTimeException（意思：运行时异常）
如果在函数内容里抛出该异常，函数可以不用声明异常，一样可以编译成功。
如果在函数上声明了该异常，调用者可以不用进行处理，一样编译成功。
*/
class APP
{
	int Work(int a, int b)
	{
		if(b==0)
		{
			throw new ArithmeticException();  //特殊情况：ArithmeticException不需要try和catch，直接扔出（throw）即可
		}
		return a/b;
	}
}
class runtime
{
	public static void main(String[] args)
	{
		APP ap = new APP();
		int x = ap.Work(9,0);
		System.out.println("除法结果是"+x);
		System.out.println("Over");	
	}
}