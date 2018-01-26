//throws：抛
class App
{
	int Run(int a,int b)throws Exception  //throws Exception表明该程序/功能运行可能出现问题
	{
		return a/b;
	}
}
class Strange
{
	
	public static void main(String[] args)
	{
        App A = new App();
	    try
	    {
		    int i = A.Run(15,0);  //此处发生异常，跳出，执行catch函数，后面的语句System...不再执行
	        System.out.println("The Result is "+i);
	    }
	    catch (Exception E)  //Exception E = ArithmeticException();
	    {
		    System.out.println("除数不能为零！");
		    System.out.println(E.getMessage());
		    E.printStackTrace();  //返回异常名称，异常信息，异常出现的位置
	    }
	    System.out.println("Over");
	}
}