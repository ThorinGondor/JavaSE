/*
   多线程：join();
   join的特点：当T0线程执行到了T1线程的join方法时，那么T0线程就会等待，等T1线程执行完才继续执行。
   join可以用来临时加入执行线程
*/
class CPU implements Runnable
{
	public void run()
	{
		for(int x=0;x<100;x++)
		{
			System.out.println(Thread.currentThread().getName()+"----"+x);
		}
	}
}
class JoinThread
{
	public static void main(String[] args)throws Exception
	{
		CPU cpu =new CPU();
		Thread T0 = new Thread(cpu);
		Thread T1 = new Thread(cpu);
		T0.start();

		/********/
        T0.join(); //join()语句的作用！有了这句话，意味着词汇整个程序中只能有T0这个线程在运作，其他所有的线程包括主程序也不能运作！等到T0线程结束以后，主线程和其他线程才能加入！
        /********/

		T1.start();
		for(int x=0;x<120;x++)
		{
			System.out.println("Main函数-----"+x);
		}
        System.out.println("Over!");             
	}
}