/*卖票程序
  多个窗口同时卖票
  使用Runnable

  Java构造方法：
  Thread(Runnable Target)
  分配新的Thread对象。


  这就是创建线程的第二种方式：实现Runnable接口！
  关键步骤：
  1.用implements实现Runnable接口
  2.覆盖run()函数方法
  3.通过Thread建立线程对象  
  4.将Runnable的接口子类对象传递给Thread类的构造函数:Thread T1 = new Thread(new XXX());
  5.用start()函数方法调用Thread类，开启线程并调用run()方法
*/
class Win implements Runnable //extends Thread
{
	private int ticket=100;
	public void run()
	{
		while(ticket>=0)
		{
			System.out.println(Thread.currentThread().getName()+"--sale--"+ticket);
			ticket--;
		}
	}
}

class TicketOffice
{
	public static void main(String[] args)
	{
		Win W = new Win();
		Thread T1 = new Thread(W);          //创建第一个线程。其中Thread(W)里的W·指定了对象应该是Win()的run函数方法
		Thread T2 = new Thread(new Win());  //创建第二个线程 右边也可以写成Thread T1 = new Thread(new Win());
		Thread T3 = new Thread(W);          //创建第三个线程
		Thread T4 = new Thread(W);          //创建第四个线程
		T1.start();
		T2.start();
		T3.start();
		T4.start();
	}
}

/*
 总结：
 实现implements和继承extends两种方法虽然都可以，但是前者implements好处在于避免了单继承的局限性，在定义线程时最好建立使用实现方式。 
 
 两种方式的区别：
 继承Thread：线程代码存放在Thread的子类的run()方法中；
 实现Runnable：线程代码存在接口的子类的run()方法中；
*/