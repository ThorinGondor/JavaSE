/*
   ���̵߳İ�ȫ���⣺
   ���������ԭ��
       ����������ڲ���ͬһ���̹߳�������ʱ��һ���̶߳Զ������ִֻ����һ���֣���û��ִ���꣬
	   ��һ�����������ִ�У����¹������ݵĴ���
	���������
	   �Զ��������������ݵ���䣬ֻ����һ���̶߳�ִ���꣬��ִ�й����������̲߳����Բ������С�
	Java�԰�ȫ���������רҵ�Ľ����ʽ��
       ��ͬ������飺
	   synchronized(����)
	   {
		   ��Ҫ��ͬ���Ĵ���
	   }
    
	�ú�����ͬ�������������߳̿������ڲ���ͬ��������ִ�У�û�������̼߳�ʱ��ȡ��CPUִ��ȨҲ����ȥ��
    ������ϵ������䣬�߳����ڲ��������ˣ���һ���߳��ǽ���ȥ�ģ����߳�ִ�н����󣬱������ʱ���ܽ�ȥ��

	ʹ��ͬ��synChronized��ǰ�᣺
	1.����Ҫ�ж���߳�
	2.�����Ƕ���߳�ʹ��ͬһ����/ͬһ����������
    
	�ô�������˶��̵߳İ�ȫ����
	����������̶߳���Ҫ�ж��������Ľ϶���Դ��
 */
class Win implements Runnable
{
	private int num = 3000;
	Object obj = new Object();
	public void run()
	{
		while(true)
		{
				synchronized(obj)   //�ú��������Ǳ�֤������������������ֻ����һ���߳���ִ�У���һ���߳�������߳�ִ����֮ǰ������
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
class ThreadSafe
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