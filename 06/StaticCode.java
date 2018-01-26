/*静态代码块
格式：
static
{
	静态代码块中执行语句
}
特点：随着类的加载而执行，只执行一次
*/
class StaticCode
{
	StaticCode(int x)
	{
		System.out.println("Run"+x);
	}
	public static void show()
	{
		System.out.println("show");
	}
	static
	{
		System.out.println("new static code");

	}
	
}

class StaticCodeDemo
{
	static
	{
		System.out.println("Start");  //静态代码Static优先输出
	}
	public static void main(String[] args)
	{
        /*new StaticCode();
		new StaticCode();
		new StaticCode();*/    //由上述所得，因此！尽管连续三次引用staticcode（），但是由于是static{}静态代码块！只能执行一次！
	  //StaticCode.show();      //这里虽然只调用了Static.show()函数，但是static函数还是必须先执行一次！
		new StaticCode(15);
        System.out.println("Over");
	}
	static
	{
		System.out.println("End");   //同理因为也是静态代码，优先于Over输出End
	}

}

