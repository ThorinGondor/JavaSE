/*
   多线程的安全问题：
   问题产生的原因：
       当多条语句在操作同一个线程共享数据时，一个线程对多条语句只执行了一部分，还没有执行完，
	   另一个语句参与进来执行，导致共享数据的错误。
	解决方法：
	   对多条操作共享数据的语句，只能让一个线程都执行完，再执行过程中其他线程不可以参与运行。
	Java对安全问题提出了专业的解决方式：
       即同步代码块：
	   synchronized(对象)
	   {
		   需要被同步的代码
	   }
    
	该函数如同锁，持有锁的线程可以在内部的同步代码中执行，没有锁的线程即时获取了CPU执行权也进不去。
    就如火车上的卫生间，线程在内部，是有人，下一个线程是进不去的，该线程执行结束后，变成无人时才能进去。

	使用同步synChronized的前提：
	1.必须要有多个线程
	2.必须是多个线程使用同一个锁/同一个函数方法
    
	好处：解决了多线程的安全问题
	坏处：多个线程都需要判断锁，消耗较多资源。
 */
class Win implements Runnable
{
	private int num = 3000;
	Object obj = new Object();
	public void run()
	{
		while(true)
		{
				synchronized(obj)   //该函数作用是保证它所包含的下述代码只能由一个线程来执行，下一个线程在这个线程执行完之前进不来
			    {
					if(num>=0)
					{
						try{Thread.sleep(5);}catch(Exception e){}
						System.out.println(Thread.currentThread().getName()+"--Sale--"+num--);
					}
				}
		}
	}
}
class ThreadSafe
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