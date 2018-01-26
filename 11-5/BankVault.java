/*
  需求：银行，一个金库，十个储户，每个储户各存300元，每次存100，各存三次
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
		    System.out.println("储户号码是"+Thread.currentThread().getName()+"; 现在存款是"+k);
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