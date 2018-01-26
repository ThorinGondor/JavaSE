
package packA;

public class PackA extends packC.PackC //packA继承了packC
{
	public void Run()
	{
		System.out.println("This is PackA!");
		Work();   //这样可以在函数中直接调用packC的函数！
	}
}