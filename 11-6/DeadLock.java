/*
  死锁：
  同步中嵌套同步,型如下例：
  
  public synchronized void()
  {
	  synchronized()
      {}
  }
*/
class Win implements Runnable
{
	private int num = 3000;
	Object obj = new Object();
	public synchronized void run()
	{
		while(true)
		{
				synchronized(obj)   //上下连续两个synchronized函数，起到死锁的效果，只能由当前线程执行锁内部的代码，而且别的线程不能进入
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
class DeadLock
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