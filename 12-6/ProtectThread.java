/*
   �ػ��̣߳�
   T0.setDaemon(true);
   Daemon����˼���ػ������������ζ�ػ����̣�ʹ�ø��߳�ʼ�տ����ڽ����г������У�����߳��޷����������
*/
class CPU implements Runnable
{
	private boolean flag=true;
	public synchronized void run()
	{
		while(flag==true)
		{
			System.out.println(Thread.currentThread().getName()+"......run");
		}
	}
	public void changeFlag()
	{
		flag = false;
	}
}
class ProtectThread
{
	public static void main(String[] args)
	{
		CPU cpu =new CPU();
		Thread T0 = new Thread(cpu);
		Thread T1 = new Thread(cpu);
		T0.setDaemon(true);   //�ػ���һ���߳�T0�������������߳�����T1���޷������CPU�ֻ࣬���ɵ�һ���߳�T0�������и�CPU��
		T1.setDaemon(true);
		T0.start();
		T1.start();

		int num = 0;
		while(true)
		{
			if(num++==60)
			{
				cpu.changeFlag();
				break;
			}
			System.out.println(Thread.currentThread().getName()+"......"+num);
		}
		System.out.println("Over");
	}
}