interface ThePort
{
	public abstract void Function();
}
class Test 
{
	  //²¹×ã´úÂë
	  /*
	static class Inner implements ThePort
	{
		public void function()
		{
			System.out.println("HaHa");
		}
	}
	*/
	static ThePort method()
	{
		return new ThePort()
		{
			public void Function()
		    {
			System.out.println("HaHa");
		    }
		};
	}
}
/*****************************************/
class InnerTest
{
	public static void main(String[] args)
	{
		Test.method().Function();
	}
}