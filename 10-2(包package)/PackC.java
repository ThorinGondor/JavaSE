package packC;
public class PackC
{
	protected void Work()   //protected与public的区别：前者可以禁止主函数main直接对它调用或建立对象，不过它的子类还是可以调用该函数。后者则完全公开。
	{
		System.out.println("This is PackC!");
	}
}