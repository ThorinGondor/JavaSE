/*模式：生产一个，消费一个*/
/*这里设计为：双核四线程，每个核有二个线程在运作*/
import java.util.concurrent.locks.*;
class Market
{
	String product=null;
	int count=0;
	boolean flag=false;

}
class Producer implements Runnable
{
	int x=0;
	private Market M;//=new Market();
	Producer(Market M)
	{
		this.M=M;
	}
	/*****************************************/
	private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
	/****************************************/
	public void run()
	{
		while(true)
		{
			lock.lock();
			try
			{
			    while(M.flag)  //当多各线程在运作时，应该使用while循环来代替if
				{
					condition.await();
				}
				
				if(x==0)
			    {
				    M.product="Intel";
					M.count++;
			    }
			    else
			    {
				    M.product="AMD";
					M.count++;
			    }
			    System.out.println(Thread.currentThread().getName()+"-----生产者："+"The Product is "+M.product+"---The number is "+M.count);
				M.flag=true;
			    x=(x+1)%2;
				condition.signal(); 	
			}
			catch (Exception e)
			{
			}
			finally
			{
				lock.unlock();
			}		
		}
		
	}
}

class Consumer implements Runnable
{
	private Market M;//=new Market();
	Consumer(Market M)
	{
		this.M=M;
	}
	/*****************************************/
	private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
	/****************************************/
	public void run()
	{
		while(true)
		{
			lock.lock();
			try
			{
				while(!M.flag)
			    {condition.await();}
				
				System.out.println(Thread.currentThread().getName()+"-----消费者："+M.product+" is consumed. "+"---The number is "+M.count);
				M.flag=false;
				condition.signal();
			}
			catch(Exception e)
			{}
			finally
			{
				lock.unlock();
			}	
		}
	}
}

class ProCon
{
	public static void main(String[] args)
	{
		Market M = new Market();
		Producer P = new Producer(M);
		Consumer C = new Consumer(M);

		/*******创建线程******/
		Thread ProT1 = new Thread(P);
		Thread ProT2 = new Thread(P);
		Thread ConT1 = new Thread(C);
		Thread ConT2 = new Thread(C);
		ProT1.start();
		ProT2.start();
		ConT1.start();
		ConT2.start();
	}
}