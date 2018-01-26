/*
  ������
  ͬ����Ƕ��ͬ��,����������
  
  public synchronized void()
  {
	  synchronized()
      {}
  }
*/
class Win implements Runnable
{
	private int num = 3000;
	Object obj = new Object();
	public synchronized void run()
	{
		while(true)
		{
				synchronized(obj)   //������������synchronized��������������Ч����ֻ���ɵ�ǰ�߳�ִ�����ڲ��Ĵ��룬���ұ���̲߳��ܽ���
			    {
					if(num>=0)
					{
						try{Thread.sleep(5);}catch(Exception e){}
						System.out.println(Thread.currentThread().getName()+"--Sale--"+num--);
					}
				}
		}
	}
}
class DeadLock
{
	public static void main(String[] args)
	{
		
		Win T = new Win();
		Thread T0 = new Thread(T);  //Thread([Runnable] target) �����µ�Thread����
		Thread T1 = new Thread(T);
		Thread T2 = new Thread(T);
		Thread T3 = new Thread(T);
		
		T0.start();
		T1.start();
		T2.start();
		T3.start();
	}
}