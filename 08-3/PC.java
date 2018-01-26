class MainBoard
{
	public void Run()
	{
		System.out.println("MainBoard Now Working");
	}
	public void BootPCI(PCI M)
	{
		if(M!=null)
		{
			M.Boot();
		    M.ShutDown();
		}
	}
}

interface PCI
{
	public abstract void Boot();
	public abstract void ShutDown();
}

class VisionCard implements PCI
{
	public void Boot()
	{
		System.out.println("The Vision Card Now Booted");
	}
	public void ShutDown()
	{
		System.out.println("The Vision Card Now Shut Down");
	}
}

class SoundCard implements PCI
{
	public void Boot()
	{
		System.out.println("The Sound Card Now Booted");
	}
	public void ShutDown()
	{
		System.out.println("The Sound Card Now ShutDown");
	}
}
/***************************************/
class PC
{
	public static void main(String[] args)
	{
		MainBoard MB = new MainBoard();
		MB.Run();
		MB.BootPCI(null);              //ͨ������MB�������PCI��ͬʱ����û�н����κ��豸����null��
		MB.BootPCI(new VisionCard());  //ͨ������MB�������PCI��ͬʱ���Ͻ������Կ�����PCI M = new VisionCard��
		MB.BootPCI(new SoundCard());   //ͨ������MB�������PCI��ͬʱ���Ͻ�������������PCI M = new SoundCard��
	}
}