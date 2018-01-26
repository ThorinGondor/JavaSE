/*任务：创建两个线程，并与主线程交替运行*/
/*
  线程都有自己默认的名称：Thread-编号，从0开始
  currentThread()  获取当前线程的对象  eg：Thread.currentThread()
  getName() 获取线程的名称   eg:this.getName()  这个也可以写成： Thread.currentThread.getName()
  
*/
class Thread0 extends Thread
{
	public void run()
	{
		for(int i=0;i<50;i++)
		{
			System.out.println(this.getName()+"--Run--"+i);  //this.getName()可以输出该线程的名称：Thread-0
		}
	}
}

class Thread1 extends Thread
{
	public void run()
	{
		for(int j=0;j<50;j++)
		{
			System.out.println(this.getName()+"--Run--"+j); //this.getName()可以输出该线程的名称：Thread-1
		}
	}
}

class ThreadTest
{
	public static void main(String[] args)
	{
		Thread0 T0 = new Thread0();
		Thread1 T1 = new Thread1();
		T0.start();
		T1.start();
		for(int k=0;k<50;k++)
		{
			System.out.println("ThreadMain--"+k);
		}
	}
}