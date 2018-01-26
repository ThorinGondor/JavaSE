class DataFlow
{
	String type;
	int data;
	boolean flag = false;
}
class CPU1 implements Runnable
{
	String name=null;
	int time=0;
	private DataFlow DF;
	CPU1(String name,int time,DataFlow DF)
	{
		this.name=name;
		this.time=time;
		this.DF=DF;
	}
    Object obj=new Object();
    int x=0;
	public void run()
	{
		while(true)
		{
			synchronized(obj)
			{
			    try
			    {
				    Thread.sleep(1);
			    }
			    catch (Exception e)
			    {}
			    System.out.println("CPU1 is running!"+this.name+" "+Thread.currentThread().getName()+" "+this.time);
			    if(x==0)
				{
					DF.type="Boolean";DF.data=73;
				}
			    else
				{
					DF.type="Int";DF.data=81;
				}
			    x=(x+1)%2;
			    time++;
			}
		}
	}
}
class CPU2 implements Runnable
{
	String name=null;
	int time=0;
	private DataFlow DF;//=new DataFlow();

	CPU2(String name,int time,DataFlow DF)
	{
		this.name=name;
		this.time=time;
		this.DF=DF;
	}
	Object obj=new Object();

	public void run()
	{
		while(true)
		{
			synchronized(obj)
			{
			try
			{
				Thread.sleep(1);
			}
			catch (Exception e)
			{
			}
			System.out.println("CPU2 is running!"+this.name+" "+Thread.currentThread().getName()+" "+this.time);
			System.out.println("The DataFlow type is "+DF.type+"; The data is "+DF.data);
			time++;
			}
		}
	}
}
class i7
{
	public static void main(String[] args)
	{
		Object obj=new Object();
		DataFlow DF = new DataFlow();

		/*������һ�����ģ���������˫�߳�*/
		CPU1 C1 = new CPU1("��һ����",0,DF);
		Thread C1T1 = new Thread(C1);
		Thread C1T2 = new Thread(C1);

        /*�����ڶ������ģ���������˫�߳�*/
  		CPU2 C2 = new CPU2("�ڶ�����",0,DF);
		Thread C2T1 = new Thread(C2);
		Thread C2T2 = new Thread(C2);
        
		/*�����ĸ��߳�*/
		C1T1.start();  //�߳�0
		C1T2.start();  //�߳�1
		C2T1.start();  //�߳�2
		C2T2.start();  //�߳�3
	}
}