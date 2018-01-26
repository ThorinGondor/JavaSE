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
					System.out.println("请输入一个键位！");
			        G.key=new Scanner(System.in).nextLine();
                    System.out.println("请输入时间长度！");
			        G.time=new Scanner(System.in).nextInt();
					G.reflect="turn left.";
					System.out.println("键盘输入是 "+G.key+";输入时长是 "+G.time+";游戏反馈应是 "+G.reflect);
		        }
		        if(x==1)
		        {
			        System.out.println("请输入一个键位！");
					G.key=new Scanner(System.in).nextLine();
					System.out.println("请输入时间长度！");
			        G.time=new Scanner(System.in).nextInt();
					G.reflect="turn rght.";
					System.out.println("键盘输入是 "+G.key+";输入时长是 "+G.time+";游戏反馈应是 "+G.reflect);
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
		Game G = new Game();    //创建唯一一个Game对象！只能对该对象进行修改和输出！
		Input I = new Input(G);   //创建一个Input对象，且必须指向G对象！
		Output O = new Output(G);  //创建一个Output对象，且也必须指向G对象！

/*****************开启线程*********************/
		Thread IT = new Thread(I);
		Thread OT = new Thread(O);
		IT.start();
		OT.start();
	}
}