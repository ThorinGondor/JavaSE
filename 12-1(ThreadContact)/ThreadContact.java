/*
线程间通讯：
其实就是多个线程在操作同一个资源，但是操作的动作不同！
本例：
线程一：Input输入名称和工厂
线程二：Output输出名称和工厂
*/
class Mode
{
	String name="空";
	String factory="空";
}

class Input implements Runnable
{
	private Mode M; //= new Mode();            //不能在Input（例如此处）和Output里分别创建新对象！必须回到主函数创建！这样才能保证只有唯一对象
    Input(Mode M)                             //此处为静态代码块，对M进行了初始化
	{
		this.M=M;
		System.out.println(M.name+"; "+M.factory); //被初始化后，这里输出name和factory都为“空”
	}
	public void run()
	{
		int x=0;
		while(true)
		{
			synchronized(M)
			{
			  if(x==0)
			  {
				 M.name="GTX780M";
			     M.factory="Nvidia";
			  }
			  else
			  {
			     M.name="HD8970M";
				 M.factory="AMD";
			  }
			}
			x=(x+1)%2;
			
			
		}
	}
}

class Output implements Runnable
{
	private Mode M; //= new Mode();
	Output(Mode M)
	{
		this.M=M;
	}
	public void run()
	{
		
		int i =1000;
		while(true)
		{
			synchronized(M)        //synchronized(M)意味着上下两个同步代码块都必须指向唯一的对象，这样保证上下两个同步代码块合为一体进行同步!
			{
			System.out.println(M.name+"; "+M.factory);
			}
		}
	}
}

class ThreadContact
{
	public static void main(String[] args)
	{
		Mode M = new Mode();   //必须在主代码创建Mode的某个对象！不妨称之为M对象，这也是整个代码中唯一的Mode对象！
		Input I = new Input(M);    //这样Input的新对象I指向Mode的M对象！
		Output O = new Output(M);  //这样Output的新对象O也指向了Mode的M对象！
		
		Thread T0 = new Thread(I);  //创建并启动线程一、线程二
		Thread T1 = new Thread(O);  
		T0.start();
		T1.start();
	}
}