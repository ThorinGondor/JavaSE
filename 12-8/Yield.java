/**
  yield(); ��ͣ��ǰ����ִ�е��̶߳��󣬲�ִ�������߳�
  �𵽵�������ʵ����΢����һ�¸��̵߳�ִ��Ƶ�ʣ����Ƕ�����̵߳ȴ������߳�
**/
class CPU implements Runnable
{
	public void run()
	{
		for(int x=0;x<100;x++)
		{
			System.out.println(Thread.currentThread().toString()+"----"+x);
		}
	}
}
class Yield
{
	public static void main(String[] args)
	{
		CPU cpu = new CPU();
		Thread T0 = new Thread(cpu);
		Thread T1 = new Thread(cpu);
		T0.start();
		T0.yield();
		T1.start();
		for(int x=0;x<120;x++)
		{
			System.out.println("Main����-----"+x);
		}
        System.out.println("Over!");
	}
}