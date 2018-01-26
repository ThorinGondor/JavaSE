/**
   �����߳����ȼ���
   setPriority(int newPriority);
   �У�MAX_PRIORITY MIN_PRIORITY NORM_PRIORITY
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
		T0.setPriority(Thread.MAX_PRIORITY);   //���߳�T0����Ϊ������ȼ�
		T1.start();
		T1.setPriority(Thread.MIN_PRIORITY);   //���߳�T1����Ϊ������ȼ�
		for(int x=0;x<120;x++)
		{
			System.out.println("Main����-----"+x);
		}
        System.out.println("Over!");
	}
}