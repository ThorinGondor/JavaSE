/*
   守护线程：
   T0.setDaemon(true);
   Daemon的意思是守护神，因此这里意味守护进程，使得该线程始终可以在进程中持续运行，别的线程无法进入和抢夺
*/
class CPU implements Runnable
{
	private boolean flag=true;
	public synchronized void run()
	{
		while(flag==true)
		{
			System.out.println(Thread.currentThread().getName()+"......run");
		}
	}
	public void changeFlag()
	{
		flag = false;
	}
}
class ProtectThread
{
	public static void main(String[] args)
	{
		CPU cpu =new CPU();
		Thread T0 = new Thread(cpu);
		Thread T1 = new Thread(cpu);
		T0.setDaemon(true);   //守护第一个线程T0，这样其他的线程例如T1则无法抢夺该CPU类，只能由第一个线程T0持续运行该CPU类
		T1.setDaemon(true);
		T0.start();
		T1.start();

		int num = 0;
		while(true)
		{
			if(num++==60)
			{
				cpu.changeFlag();
				break;
			}
			System.out.println(Thread.currentThread().getName()+"......"+num);
		}
		System.out.println("Over");
	}
}