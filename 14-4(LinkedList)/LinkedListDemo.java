import java.util.*;
class  LinkedListDemo
{
	public static void main(String[] args) 
	{
		LinkedList LL = new LinkedList();
		LL.add("Java0");
		LL.add("Java1");
		LL.add("Java2");
		LL.add("Java3");
		LL.add("Java4");
		LL.add("Java5");
		LL.add("Java6");
		Iterator it = LL.iterator();
		while(it.hasNext())
		{
			sop("Next: "+it.next());
		}
		sop(LL);
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
