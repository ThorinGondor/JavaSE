/**任务：去除ArrayList中重复的元素**/
import java.util.*;
class List1
{
	ArrayList AL1 = new ArrayList();
	
	public void Add(Object obj)   //public void xxx(这个位置可以放对象!) {}
	{
		AL1.add(obj);
	}
	
	
	
}

class List2 extends List1
{
	ArrayList AL2 = new ArrayList();

	public void Eliminate(ArrayList Origin)  //public void xxx(这个位置可以放对象!) {}
	{
		Object obj2 = new Object();
		Iterator it = Origin.iterator();
		
		while(it.hasNext())
		{
			obj2=it.next();
			
			if(!AL2.contains(obj2))
			{
				AL2.add(obj2);
			} 
		}
	}
}

class ALDemo
{
	public static void main(String[] args)
    {
		List1 L1 = new List1();
		List2 L2 = new List2();
		L1.Add("Java1");
		L1.Add("Java2");
		L1.Add("Java1");
		L1.Add("Java2");
		L1.Add("Java2");
		L1.Add("Java3");
		L1.Add("Java3");
		L1.Add("Java4");
		System.out.println(L1.AL1);
		L2.Eliminate(L1.AL1);
		System.out.println(L2.AL2);
	}
}