/*
   同步函数用的是哪一个锁呢？
   函数需要被对象调用，那么函数都有一个所属对象引用，就是this
   所以同步函数使用的锁是this

   该程序可以验证上述内容
 */
class Win implements Runnable
{
	private int num=4000;
	Object obj = new Object();
	public void run()
	{
		while(true)
		{
			this.Show();
		}
	}

	public synchronized void Show()
	{
		if(num>=0)
		{
			try{Thread.sleep(5);}catch(Exception e){}
			System.out.println(Thread.currentThread().getName()+"--Sale--"+num--);
		}
	}
}
class ThisLock
{
	public static void main(String[] args)
	{
		
		Win T = new Win();
		Thread T0 = new Thread(T);  //Thread([Runnable] target) 分配新的Thread对象
		Thread T1 = new Thread(T);
		Thread T2 = new Thread(T);
		Thread T3 = new Thread(T);
		
		T0.start();
		T1.start();
		T2.start();
		T3.start();
	}
}