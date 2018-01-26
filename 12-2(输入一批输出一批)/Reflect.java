import java.util.Scanner;
class Game
{
	String key = null;
	String reflect = null;
	int time = 0;

	boolean flag=false;
}

class Input implements Runnable
{
	private Game G; //=new Game();
	Input(Game G)
	{
		this.G=G;
	}
	int x = 0;
	public void run()
	{
		while(true)
		{
		    synchronized(G)
			{
				if(G.flag==true)
			    {
				    try{G.wait();}catch (Exception e){}
			    }
			    if(x==0)
		        {
					System.out.println("������һ����λ��");
			        G.key=new Scanner(System.in).nextLine();
                    System.out.println("������ʱ�䳤�ȣ�");
			        G.time=new Scanner(System.in).nextInt();
					G.reflect="turn left.";
					System.out.println("���������� "+G.key+";����ʱ���� "+G.time+";��Ϸ����Ӧ�� "+G.reflect);
		        }
		        if(x==1)
		        {
			        System.out.println("������һ����λ��");
					G.key=new Scanner(System.in).nextLine();
					System.out.println("������ʱ�䳤�ȣ�");
			        G.time=new Scanner(System.in).nextInt();
					G.reflect="turn rght.";
					System.out.println("���������� "+G.key+";����ʱ���� "+G.time+";��Ϸ����Ӧ�� "+G.reflect);
		        }
			    G.flag=true;
		        x=(x+1)%2;
			    G.notify();
			}
		}
	}
}

class Output implements Runnable
{
	private Game G;//=new Game();
	Output(Game G)
	{
		this.G=G;
	}
	public void run()
	{
		while(true)
		{
			synchronized(G)
			{
				if(G.flag==false)
				{
					try{G.wait();}catch (Exception e){}
				}
				System.out.println("The Key is "+G.key+";The Time is "+G.time+";The Reflect is "+G.reflect);
				G.flag=false;
				G.notify();
			}
		}
	}
}
class Reflect
{
	public static void main(String[] args)
	{
		Game G = new Game();    //����Ψһһ��Game����ֻ�ܶԸö�������޸ĺ������
		Input I = new Input(G);   //����һ��Input�����ұ���ָ��G����
		Output O = new Output(G);  //����һ��Output������Ҳ����ָ��G����

/*****************�����߳�*********************/
		Thread IT = new Thread(I);
		Thread OT = new Thread(O);
		IT.start();
		OT.start();
	}
}