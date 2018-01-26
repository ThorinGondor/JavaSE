/*
    自定义异常：因为项目中会出现一些特有的问题，而这些问题并未被Java所描述并封装，
	所以对于这些特有的异常，可以按照java对问题封装的思想，将特有的异常进行自定义的异常的封装。  
*/
/*
     题目：在本项目中，除数是负数，也视为是异常，不能进行运算
	 那么就需要对这个问题进行自定义的描述

	 当在函数内部出现了throw抛出异常对象，那么就必须给出对应的处理动作。
	 要么在内部try catch处理，
	 要么在函数上声明让调用者处理。
	 一般情况下函数类出现异常，函数上需要声明
*/
/*
     如何自定义异常信息呢？
	 因为父类已经把异常信息的操作都完成了，所以子类只要在构造时，通过super语句将异常信息传递给父类
*/

class FuShuException extends Exception  //1.建立一个负数异常继承异常类，即可形成一个名为FuShuException的异常
{
	FuShuException(String messag)
	{
		super(messag);
	}
}

class APP
{
	int Run(int a,int b)throws FuShuException  //注；别忘了该函数本行代码还需要进一步添加throw关键字
	{
		if(b<0)
		{
			throw new FuShuException("出现了除数是负数的情况");  //2.手动通过throw关键字抛出一个异常对象，使得FuShuException异常成为b<0;
		}
		return a/b;  
	}
}

class CustomException   //自定义异常程序
{
	public static void main(String[] args)
	{
		APP ap = new APP();
		try
		{
			int i = ap.Run(40,-5);
		    System.out.println("The result is "+i);
		}
		catch (FuShuException FSE)
		{
			//异常的具体的一些处理方式。。。
			System.out.println("除数不能为负数！");
			System.out.println(FSE.toString());
            System.out.println(FSE.getMessage());
			FSE.printStackTrace();
		}
		
		System.out.println("Over");
	}
}

