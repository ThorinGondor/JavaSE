/*
   多线程概述：
（注：这里cpu为单核cpu）
      *进程：(类似于任务管理器的各个进程，即应用程序)
	     进程是一个正在执行中的程序，cpu其实每次只能执行一个程序，并快速切换执行不同的程序，所以看上去cpu就像在同时执行很多程序。
		 每一个进程执行都有一个执行顺序，该顺序是一个执行路径或者叫控制单元。

	  *线程：
	     线程是进程中的内容，每一个应用程序（即进程）至少都有一个线程。
		 线程就是进程中的一个独立的单元，线程控制着进程的执行。
		 java虚拟机启动的时候会有一个进程java.exe出现。该进程中至少有一个线程负责java程序的执行，而且这个线程运行的代码存在于main函数中。该线程称之为主线程。

	  *多线程存在的意义：
	     它可以让程序中的部分产生同时运行的效果、可以提高运行效率。

	  *线程的创建方式：（自定义创建一些线程，让某些代码可以同时运行）
	      一、如何在代码中，自定义创建并运行一个线程？
		    java已经提供了描述，即Thread类。
		    创建线程的第一种方式：继承Thread类。如下：
		      class MainThread extends Thread
		    步骤：
		    1.创建一个类继承Thread.class
		    2.复写Thread类中的run()函数方法
		    3.创建一个线程（即new），并用start()函数启动此线程！

			（注：运行结果每一次都不同。多个线程都在获取cpu使用权，因此多线程在互相抢夺cpu的使用权，是随机的）
*/
class MainThread extends Thread
{
	public void run()    //这里应覆盖Thread的run函数方法，因为Thread的子类应重写该函数方法
	{
		for(int i=0;i<100;i++)
		{
			System.out.println("MainThread Run!--"+i);
		}
		
	}
}

class MultiThread
{
	public static void main(String[] args)
	{
		MainThread MT = new MainThread();   //这里即创建一个新线程！
		MT.start();            //这里是启动该线程！是start()! 不是run()!
		/*start函数方法：使该线程开始执行，调用该线程的run函数方法！*/

		for(int j=0;j<100;j++)       //这样该for函数会和上述for函数同时运行
		{
			System.out.println("MainAPP--"+j);
		}
	}
}