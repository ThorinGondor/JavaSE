/**
   更改线程优先级：
   setPriority(int newPriority);
   有：MAX_PRIORITY MIN_PRIORITY NORM_PRIORITY
**/
class CPU implements Runnable
{
	public void run()
	{
		for(int x=0;x<100;x++)
		{
			System.out.println(Thread.currentThread().toString()+"----"+x);
		}
	}
}
class Priority
{
	public static void main(String[] args)
	{
		CPU cpu = new CPU();
		Thread T0 = new Thread(cpu);
		Thread T1 = new Thread(cpu);
		T0.start();
		T0.setPriority(Thread.MAX_PRIORITY);   //将线程T0设置为最高优先级
		T1.start();
		T1.setPriority(Thread.MIN_PRIORITY);   //将线程T1设置为最低优先级
		for(int x=0;x<120;x++)
		{
			System.out.println("Main函数-----"+x);
		}
        System.out.println("Over!");
	}
}