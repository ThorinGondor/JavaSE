/*
   ͬ�������õ�����һ�����أ�
   ������Ҫ��������ã���ô��������һ�������������ã�����this
   ����ͬ������ʹ�õ�����this

   �ó��������֤��������
 */
class Win implements Runnable
{
	private int num=4000;
	Object obj = new Object();
	public void run()
	{
		while(true)
		{
			this.Show();
		}
	}

	public synchronized void Show()
	{
		if(num>=0)
		{
			try{Thread.sleep(5);}catch(Exception e){}
			System.out.println(Thread.currentThread().getName()+"--Sale--"+num--);
		}
	}
}
class ThisLock
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