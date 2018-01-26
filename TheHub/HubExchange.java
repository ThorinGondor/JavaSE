class HubStation
{
	String type="00";
	String factory="00";
	boolean flag=false;
}

class Import implements Runnable
{
	public HubStation hub;
	Import(HubStation hub)
	{
		this.hub = hub;
	}
	int x = 0;
	public void run()
	{
		while(true)
		{
			synchronized(hub)
			{
				if(hub.flag==true)
				{
					try
				    {hub.wait();}
				    catch (Exception e)
				    {}
				}
				
				if(x==0)
				{
					hub.type="HD";
					hub.factory="ATI";
				}
				if(x==1)
				{
					hub.type="GTX";
					hub.factory="Nvidia";
				}
				x=(x+1)%2;
				hub.flag=true;
				hub.notify();
			}
		}
	}
}

class Export implements Runnable
{
	public HubStation hub;
	Export(HubStation hub)
	{
		this.hub=hub;
	}
	public void run()
	{
		while(true)
		{
			synchronized(hub)
			{
				if(hub.flag==false)
				{
					try
					{hub.wait();}
					catch (Exception e)
					{}
				}
				System.out.println("The Type is "+hub.type+";The Factory is "+hub.factory);
				hub.flag=false;
				hub.notify();
			}
		}
	}
}
class HubExchange
{
	public static void main(String[] args)
	{
		HubStation hub = new HubStation();
		Import I = new Import(hub);
		Export E = new Export(hub);
		Thread IT = new Thread(I);
		Thread ET = new Thread(E);

		IT.start();
		ET.start();
	}
}