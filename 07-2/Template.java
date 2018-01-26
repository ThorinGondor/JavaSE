/*获取一段程序的运行时间*/
/*原理：获取开始时间和结束时间相减即可*/
/*获取时间：System.currentTimeMillis(); */
abstract class GetTime
{
	public abstract void APP();
	public final void gettime()  //final禁止覆盖，可作为优化的一种方式
	{
		long start = System.currentTimeMillis();
		APP();
		long end = System.currentTimeMillis();
		
		System.out.println();
		System.out.println("毫秒"+" 开始时间:"+start+" 结束时间:"+end+" 持续时间:"+(end-start));
	}
}
/******************************/
class SubTime extends GetTime  //覆盖前面的代码
{
	public void APP()
	{
		for(int i=0;i<100;i++)
		{System.out.print(i+",");}
	}
}
/******************************/
class Template
{
	public static void main(String[] args)
	{
		//GetTime GT1 = new GetTime();
		//GT1.gettime();
		SubTime S1 = new SubTime();
		S1.gettime();
	}
}