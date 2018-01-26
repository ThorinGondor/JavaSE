/*ģʽ������һ��������һ��*/
/*�������Ϊ��˫�����̣߳�ÿ�����ж����߳�������*/
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
	public void run()
	{
		while(true)
		{
			synchronized(M)
		    {
			    while(M.flag)  //������߳�������ʱ��Ӧ��ʹ��whileѭ��������if
				{
					try{M.wait();}catch(Exception e){}
				}
				try{Thread.sleep(1);}catch(Exception e){}
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
			   System.out.println(Thread.currentThread().getName()+"-----�����ߣ�"+"The Product is "+M.product+"---The number is "+M.count);
				M.flag=true;
			    x=(x+1)%2;
				M.notifyAll();  //����ĳ�notifyAll()������notify(),������ֻ�ܻ��ѱ����̣߳������������е��̶߳��ȴ���ǰ�߲��ܻ��������߳�����������̡߳�
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
	public void run()
	{
		while(true)
		{
			synchronized(M)
			{
				while(!M.flag)
				{
					try{M.wait();}catch(Exception e){}
				}
				try{Thread.sleep(1);}catch(Exception e){}
				System.out.println(Thread.currentThread().getName()+"-----�����ߣ�"+M.product+" is consumed. "+"---The number is "+M.count);
				M.flag=false;
				M.notify();
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

		/*******�����߳�******/
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