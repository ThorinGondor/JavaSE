/*
异常：就是程序在运行时出现不正常情况
异常的由来：可以通过Java的类的形式进行描述一个问题，并封装成对象
            其实就是java对不正常情况进行描述后的对象体现。

对于问题的划分：分为两种，一种是严重的问题，一种是非严重的问题：
对于严重的，java通过error类进行描述
    对于error一般不编写针对性的代码进行处理
对于非严重的，java通过exception类进行描述
    对于exception可以使用针对性的处理方式进行处理

无论error或exception都具有一些共性内容
例如：不正常情况的信息、引发原因等

Throwable

异常的处理：java提供了特有的语句进行处理。
try
{需要被检测的代码；}
catch（异常类 变量）
{处理异常的代码；}
finally
{一定会执行的语句；}

*/
class Demo
{
	int Divide(int a,int b)
	{
		return a/b;
	}
}
class exception    //面向对象——异常
{
	public static void main(String[] args)
	{	
		Demo D = new Demo();
		
		try
		{
			int x = D.Divide(12,0);  //此处发生异常，跳出，执行catch函数，后面的语句不再执行
		    System.out.println(x);
		}

		catch(Exception e)  //Exception e = new ArithmeticException();
		{
			      System.out.println("除数不能为零！");
			/*1*/ System.out.println(e.getMessage());  // getMessage()功能：返回此异常的详细消息字符串：by zero
			/*2*/ System.out.println(e.toString());  //toString（）功能：返回异常信息的简短描述
			/*3*/ e.printStackTrace();  //返回异常名称，异常信息，异常出现的位置

		}
		
		System.out.println("Over");
		
	}
}