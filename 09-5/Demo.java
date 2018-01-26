class FuShuException extends Exception
{
	FuShuException(String msg)
	{super(msg);}
}

class APP 
{
	public int Run(int a,int b)throws FuShuException
	{
		if(b<0)
		{
			throw new FuShuException("除数不能为负数！");
		}
		return a/b;
	}
}
class Demo
{
	public static void main(String[] args)
	{
		APP ap = new APP();
		try
		{
			int i = ap.Run(9,-3);
			System.out.println(i);
		}
		catch (FuShuException FSE)
		{
			FSE.printStackTrace();
			return;
		}
		finally
		{
			System.out.println("finally");  //finally函数的代码一定会被执行
		}
		System.out.println("System Over");  //本代码虽然也会被执行，但是如果在catch里加个return，则会不执行，最好不要使用该代码
	}
}