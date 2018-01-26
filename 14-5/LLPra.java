import java.util.*;
/**
使用LinkedList模拟一个堆栈或者队列数据结构

堆栈：先进后出 如同一个水井
队列：先进先出 如同一个水管

以下模拟队列的先进先出，输出为：出队列
**/
class Duilie
{
	LinkedList LL = new LinkedList();
	
	public void myAdd(Object obj)
	{
		LL.addFirst(obj);
	}
	public Object myGet()
	{
		return LL.removeLast();
	}
	public boolean isNull()
	{
		return LL.isEmpty();
	}
}
class LLPra
{
	public static void main(String[] args)
	{
		Duilie d = new Duilie();
		d.myAdd("Java0");
		d.myAdd("Java1");
		d.myAdd("Java2");
		d.myAdd("Java3");
		d.myAdd("Java4");
		System.out.println(d.myGet());
		System.out.println(d.myGet());
		System.out.println(d.myGet());
		System.out.println(d.myGet());
		System.out.println(d.myGet());
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
	
}