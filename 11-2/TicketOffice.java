/*��Ʊ����
  �������ͬʱ��Ʊ
*/
class Win extends Thread
{
	private int ticket=100;
	public void run()
	{
		while(ticket>=0)
		{
			System.out.println(this.getName()+"--sale--"+ticket);
			ticket--;
		}
	}
}

class TicketOffice
{
	public static void main(String[] args)
	{
		Win W0 = new Win();  //��������1������2������3. W0��W1��W2
		Win W1 = new Win();
		Win W2 = new Win();
		W0.start();   //�����߳�0
		W1.start();   //�����߳�1
		W2.start();

	}
}