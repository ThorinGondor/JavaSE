/*��Ŀ��
��������ʵ�����������л������塣
*/
class MainBoard
{
	public void Run()
	{
		System.out.println("PC now Working...");
	}
	public void BootATIcard(ATIcard ATI)
	{
		ATI.Boot();
		ATI.ShutDown();
	}
}

class ATIcard extends MainBoard
{
	public void Boot()
	{
		System.out.println("The ATI vision card now Booting...");
	}
	public void ShutDown()
	{
		System.out.println("The ATI vision card now Shut Down...");
	}
}

class SoundCard extends MainBoard
{
	public void Boot()
	{
		System.out.println("The Sound Card now Booting...");
	}
	public void ShutDown()
	{
		System.out.println("The Sound Card now Shut Down...");
	}
}
/**********************************************/
class TestDemo
{
	public static void main(String[] args)
	{
		MainBoard MB = new MainBoard();
		MB.Run();
		MB.BootATIcard(new ATIcard());  //�辭������MainBoard����һ��ATI�Կ�����֮ǰ���ǵ����Ӷ���ֱ�ӽ���ATI�Կ�����
	}
}