/*
   ���̣߳�join();
   join���ص㣺��T0�߳�ִ�е���T1�̵߳�join����ʱ����ôT0�߳̾ͻ�ȴ�����T1�߳�ִ����ż���ִ�С�
   join����������ʱ����ִ���߳�
*/
class CPU implements Runnable
{
	public void run()
	{
		for(int x=0;x<100;x++)
		{
			System.out.println(Thread.currentThread().getName()+"----"+x);
		}
	}
}
class JoinThread
{
	public static void main(String[] args)throws Exception
	{
		CPU cpu =new CPU();
		Thread T0 = new Thread(cpu);
		Thread T1 = new Thread(cpu);
		T0.start();

		/********/
        T0.join(); //join()�������ã�������仰����ζ�Ŵʻ�����������ֻ����T0����߳����������������е��̰߳���������Ҳ�����������ȵ�T0�߳̽����Ժ����̺߳������̲߳��ܼ��룡
        /********/

		T1.start();
		for(int x=0;x<120;x++)
		{
			System.out.println("Main����-----"+x);
		}
        System.out.println("Over!");             
	}
}