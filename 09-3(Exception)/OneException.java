/*
�ó�������һ��APP������������ӣ���������������������������������5���쳣��������С�ڼ���Ҳ�쳣�������쳣����Ҫ�����쳣��Ϣ�Ĳ���ʹ���
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
	int Run(int i, int j)throws PlusException  //throws�����ú������ܲ���ĳ���쳣
	{
		if(i>5&&j>5)
		{
			throw new PlusException();   //�ӳ�����ļӷ��쳣������
		}
		return i+j;
	}

	int Work(int L, int M)throws MinusException //throws�����ú������ܲ���ĳ���쳣
	{
		if(L<M)
		{
			throw new MinusException();   //�ӳ�����ļ����쳣������
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
		catch (PlusException PE)               //����ӷ��쳣����Ϣ
		{
			System.out.println("�ӷ��쳣��");
			System.out.println(PE.getMessage());
			PE.printStackTrace();
		}
		catch(MinusException ME)               //��������쳣����Ϣ
		{
			System.out.println("�����쳣��");  
			ME.printStackTrace();
		}
		System.out.println("Over");
	}
}