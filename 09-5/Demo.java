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
			throw new FuShuException("��������Ϊ������");
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
			System.out.println("finally");  //finally�����Ĵ���һ���ᱻִ��
		}
		System.out.println("System Over");  //��������ȻҲ�ᱻִ�У����������catch��Ӹ�return����᲻ִ�У���ò�Ҫʹ�øô���
	}
}