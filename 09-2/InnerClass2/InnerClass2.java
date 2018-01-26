/*
匿名内部类：
1.它其实就是内部类的简写格式。
2.定义匿名内部类的前提：
  内部类必须是继承一个类或者实现接口
 3.匿名内部类的格式：new 父类 或者 接口（）{定义子类的内容}
 4.其实匿名内部类就是一个匿名子类对象
 5.匿名内部类中定义的方法最好不要超过三个
*/
abstract class ABS
{
	public abstract void Show();
}
class Outer
{
	int i = 3;
	/*
	class Inner extends ABS
	{
		public void Show()
		{
			System.out.println("Show "+i);
		}

	}*/
	public void method()
	{
		//new Inner().Show();   如何简化绿色部分的代码呢？将它们简化成一步来完成,优化后的代码如下：
		new ABS()
		{
		   public void Show()
		   {
			   System.out.println("Show i="+i);
		   }
		}.Show(); //new ABS().Show() 这当中加了个{}，其中的函数实现了Show抽象函数 因为这里ABS的Show是一个抽象函数，因此必须添加一个{}来特意实体化Show函数，才能进行调用
	}
}
class InnerClass2
{
	public static void main(String[] args)
	{
		new Outer().method();
	}
}