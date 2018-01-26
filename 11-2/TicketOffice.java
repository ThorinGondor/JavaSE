/*卖票程序
  多个窗口同时卖票
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
		Win W0 = new Win();  //建立窗口1、窗口2、窗口3. W0、W1、W2
		Win W1 = new Win();
		Win W2 = new Win();
		W0.start();   //启动线程0
		W1.start();   //启动线程1
		W2.start();

	}
}