/*
  �������У�һ����⣬ʮ��������ÿ����������300Ԫ��ÿ�δ�100����������
*/
class Depositor
{
	private int k=0;
	Object obj = new Object();
	public void Deposit(int j)
	{
		synchronized(obj)
	    {
			try{Thread.sleep(100);}catch(Exception e){}
			k=k+j;
		    System.out.println("����������"+Thread.currentThread().getName()+"; ���ڴ����"+k);
		}
		
	}
}
class Vault implements Runnable
{
	Depositor D = new Depositor();
	public void run()
	{
		for(int i=0;i<3;i++)
		{
			D.Deposit(100);
		}
	}
}
class BankVault
{
	public static void main(String[] args)
	{
		Vault V = new Vault();
		Thread T0 = new Thread(V);
		Thread T1 = new Thread(V);
		Thread T2 = new Thread(V);
		Thread T3 = new Thread(V);
		Thread T4 = new Thread(V);
		Thread T5 = new Thread(V);
		Thread T6 = new Thread(V);
		Thread T7 = new Thread(V);
		Thread T8 = new Thread(V);
		Thread T9 = new Thread(V);

		T0.start();
		T1.start();
		T2.start();
		T3.start();
		T4.start();
		T5.start();
		T6.start();
		T7.start();
		T8.start();
		T9.start();
	}
}