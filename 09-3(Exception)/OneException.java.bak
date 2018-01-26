/*
该程序：运行一个APP，将两个数相加，另外两个数相减，两个加数如果都大于5则异常，被减数小于减数也异常，两个异常都需要进行异常信息的捕获和处理
*/
class PlusException extends Exception
{
}
class MinusException extends Exception
{
}
/***********************************************************/
class APP 
{
	int Run(int i, int j)throws PlusException  //throws声明该函数可能产生某种异常
	{
		if(i>5&&j>5)
		{
			throw new PlusException();   //扔出具体的加法异常到下面
		}
		return i+j;
	}

	int Work(int L, int M)throws MinusException //throws声明该函数可能产生某种异常
	{
		if(L<M)
		{
			throw new MinusException();   //扔出具体的减法异常到下面
		}
		return L-M;
	}
}
/************************************************************/
class OneException
{
	public static void main(String[] args)
	{
		APP ap = new APP();
		try
		{
			int x = ap.Run(4,3);
			int y = ap.Work(2,4);
			System.out.println("The plus result is "+x);
			System.out.println("The mius result is "+y);
		}
		catch (PlusException PE)               //捕获加法异常的信息
		{
			System.out.println("加法异常！");
			System.out.println(PE.getMessage());
			PE.printStackTrace();
		}
		catch(MinusException ME)               //捕获减法异常的信息
		{
			System.out.println("减法异常！");  
			ME.printStackTrace();
		}
		System.out.println("Over");
	}
}