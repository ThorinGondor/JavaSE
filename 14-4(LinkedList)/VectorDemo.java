/**
    Vector和ArrayList区别在于：前者需要用Enumeration(枚举)来执行获取和添加删除等动作，而后者使用迭代器Iterator和ListIterator！
    枚举是vector特有的取出方式。
	枚举和迭代器很像！
	
	其实枚举和迭代是一样的，但是由于枚举的名称以及方法都过长，所以被迭代器取代了，枚举就郁郁而终了。
**/

import java.util.*;
class VectorDemo
{
	public static void main(String[] args)
	{
		Vector V = new Vector();
		V.add("Java0");
		V.add("Java1");
		V.add("Java2");
		V.add("Java3");
		V.add("Java4");
		V.add("Java5");
		sop(V);
		Enumeration Enu = V.elements();
		//看看区别：
		/*Iterator it = AL.iterator();*/
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}