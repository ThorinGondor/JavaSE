/*��Ʊ����
  �������ͬʱ��Ʊ
  ʹ��Runnable

  Java���췽����
  Thread(Runnable Target)
  �����µ�Thread����


  ����Ǵ����̵߳ĵڶ��ַ�ʽ��ʵ��Runnable�ӿڣ�
  �ؼ����裺
  1.��implementsʵ��Runnable�ӿ�
  2.����run()��������
  3.ͨ��Thread�����̶߳���  
  4.��Runnable�Ľӿ�������󴫵ݸ�Thread��Ĺ��캯��:Thread T1 = new Thread(new XXX());
  5.��start()������������Thread�࣬�����̲߳�����run()����
*/
class Win implements Runnable //extends Thread
{
	private int ticket=100;
	public void run()
	{
		while(ticket>=0)
		{
			System.out.println(Thread.currentThread().getName()+"--sale--"+ticket);
			ticket--;
		}
	}
}

class TicketOffice
{
	public static void main(String[] args)
	{
		Win W = new Win();
		Thread T1 = new Thread(W);          //������һ���̡߳�����Thread(W)���W��ָ���˶���Ӧ����Win()��run��������
		Thread T2 = new Thread(new Win());  //�����ڶ����߳� �ұ�Ҳ����д��Thread T1 = new Thread(new Win());
		Thread T3 = new Thread(W);          //�����������߳�
		Thread T4 = new Thread(W);          //�������ĸ��߳�
		T1.start();
		T2.start();
		T3.start();
		T4.start();
	}
}

/*
 �ܽ᣺
 ʵ��implements�ͼ̳�extends���ַ�����Ȼ�����ԣ�����ǰ��implements�ô����ڱ����˵��̳еľ����ԣ��ڶ����߳�ʱ��ý���ʹ��ʵ�ַ�ʽ�� 
 
 ���ַ�ʽ������
 �̳�Thread���̴߳�������Thread�������run()�����У�
 ʵ��Runnable���̴߳�����ڽӿڵ������run()�����У�
*/