/*
内部类的访问规则：
1.内部类可以直接访问外部类的成员，包括私有private
  因为内部类持有了一个外部类的引用
  格式： 外部类名字.this.XXX
2.外部类要访问内部类必须创建内部类的对象new Inner（）；

访问格式：
1.当内部类定义在外部类成员的位置上，而且非私有，可以在外部其他类中，可以直接建立内部类对象
  格式： 外部类名.内部类名 变量名 = new 外部类对象.内部类对象；
 2.当内部类在成员位置上，就可以被成员修饰符所修饰
   例如：private：
         static：
3.在其他外部类成员访问该外部类的内部类非静态成员function：
   Outer().Inner() OI = new Outer().Inner();   //需要创建新的对象
   OI.function;
  在其他外部类成员访问该外部类的内部静态成员function：
   Outer.Inner.function();   //直接调用
*/

//内部类的好处：不用再创建新的对象

/*
何时应用：当描述事物时，事物的内部还有事物，该事物用内部类来描述。
因为内部事物在使用外部事物的内容
eg：
class Body
  {
	public void method()
	{}
	private class Heart
	{
		function(){}
	}
	public void FangWen()   //由于Heart已经被私有化，故而需要建立新的对象来访问它
	{
		Heart Ht = new Heart();
		Ht.function;
	}
  }
You screwed up.
*/
class Outer  //外部类
{
	private int x = 3;

	void method()
	{
		Inner I = new Inner();  //外部类要访问内部类必须创建内部类的对象new Inner（）；
		I.function();
	}

	class Inner  //内部类
	{
		//int x = 10;
		public void function()
		{
		//	int x =6;
			System.out.println("访问成功！Inner:"+Outer.this.x);  //内部类可以直接访问外部类的成员x，包括私有private x
		}
	}

}
/****************************************/
class InnerClass
{
	public static void main(String[] args)
	{
		Outer O = new Outer();
		O.method();

		//若要直接访问内部对象inner：、
		Outer.Inner OI = new Outer().new Inner();
		OI.function();
	}
}