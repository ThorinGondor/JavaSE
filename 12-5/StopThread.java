/*
   stop�����Ѿ���ʱ�����ֹͣ�̣߳�
   ֻ��һ�֣�����run��������������
   ����run�����������������̲߳����У����д���ͨ��Ϊѭ���ṹ��ֻҪͨ������ѭ���Ϳ�����run�������������߳̽�����
*/
/*
   interrupt();��ǿ�ƽ����̵߳Ķ���״̬�������ָ�������״̬����
*/
class CPU implements Runnable
{
	private boolean flag=true;
	public synchronized void run()
	{
		while(flag==true)
		{
			try                                  //�������������̴߳��ڶ���״̬�����µ�wait();���������򲻻��ȡ��flag�ĸı䣬���߳̾��޷�����
			{
				wait();
			}
			catch (InterruptedException e)
			{
				System.out.println(Thread.currentThread().getName()+"......Exception");
			}
			System.out.println(Thread.currentThread().getName()+"......run");
		}
	}
	public void changeFlag()
	{
		flag = false;
	}
}
class StopThread
{
	public static void main(String[] args)
	{
		CPU cpu =new CPU();
		Thread T0 = new Thread(cpu);
		Thread T1 = new Thread(cpu);
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
	}
}