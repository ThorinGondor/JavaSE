//面向对象（匿名内部类）
class Outer
{
	int i = 10;
	public void method(int k)
	{
	    int j = 15;	
		class Inner
		{
			public void function()
			{
				System.out.println(Outer.this.i+" "+j+" "+k);
			}
		}
		new Inner().function();
	}

}
class InnerClass
{
	public static void main(String[] args)
	{
		new Outer().method(9);
	}
}