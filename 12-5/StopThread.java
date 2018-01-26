/*
   stop方法已经过时，如何停止线程？
   只有一种，就是run函数方法结束。
   结束run函数方法：开启多线程并运行，运行代码通常为循环结构，只要通过控制循环就可以让run方法结束，即线程结束。
*/
/*
   interrupt();是强制结束线程的冻结状态，让他恢复到运行状态中来
*/
class CPU implements Runnable
{
	private boolean flag=true;
	public synchronized void run()
	{
		while(flag==true)
		{
			try                                  //特殊情况：如果线程处于冻结状态（如下的wait();函数），则不会读取到flag的改变，则线程就无法结束
			{
				wait();
			}
			catch (InterruptedException e)
			{
				System.out.println(Thread.currentThread().getName()+"......Exception");
			}
			System.out.println(Thread.currentThread().getName()+"......run");
		}
	}
	public void changeFlag()
	{
		flag = false;
	}
}
class StopThread
{
	public static void main(String[] args)
	{
		CPU cpu =new CPU();
		Thread T0 = new Thread(cpu);
		Thread T1 = new Thread(cpu);
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
	}
}