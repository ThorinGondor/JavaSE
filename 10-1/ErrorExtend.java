/*
    �쳣�ڸ����า���е����֣�
	1.�����ڸ��Ǹ���ʱ���������׳��쳣ʱ������ֻ���׳�������쳣���߸��쳣�������쳣��
	2.��������׳�����쳣��������ֻ���׳������쳣���Ӽ���
	�������չʾ��һ��
*/
/*****************************/
/* ���Զ��������쳣���쳣2���쳣1������*/
class Fault1 extends Exception
{
	Fault1(String msg)
	{super(msg);}
}
class Fault2 extends Fault1
{
	Fault2(String msg)
	{super(msg);}
}
/*****************************/
/*���������*/
class Nokia
{
	int state = 1;
	public void Run()throws Fault1
	{
		if(state==0)
			throw new Fault1("�����쳣��");
	}
}
class Iphone extends Nokia
{
	public void Run()throws Fault2
	{
		if(state==1)
			throw new Fault2("�����쳣��");
	}
}
/******************************/
/*������*/
class Function
{
	public void Function(Nokia N)
	{
		try
		{
			N.Run();
		}
		catch (Fault1 F1)
		{
			F1.printStackTrace();
		}
		
	}
}
class ErrorExtend
{
	public static void main(String[] args)
	{
		Function F = new Function();
		F.Function(new Iphone());
	}
}