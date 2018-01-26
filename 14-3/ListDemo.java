/**
	                     Collection;
	          List;                    Set;
 ArrayList  LinkedList  Vector;   HashSet TreeSet;

 本例子演示列表迭代器
 Iterator只能修改和删除元素，不能添加元素。
 it.remove();

 因此，推出List集合特有的迭代器ListIterator，它是Iterator的子接口。
 在迭代时，只是在迭代时！不可通过集合对象的方法操作集合中的元素。

 因此在使用迭代器时，只能通过迭代器来添加删除和修改，但是迭代器Iterator不能添加元素，只能用ListIterator迭代器！
**/

import java.util.*;
class ListDemo
{
	public static void main(String[] args)
	{
		ArrayList AL = new ArrayList(); 
		AL.add("Java1");
		AL.add("Java2");
		AL.add("Java3");
		AL.add("Java4");
		AL.add("Java5");
		AL.add("Java6");
        sop(AL);
	/****在Iterator迭代过程中，准备添加或删除元素****/
		Iterator it = AL.iterator();
		while(it.hasNext())
		{
			Object obj = it.next();  //obj对象指向迭代器对应的元素
			if(obj.equals("Java4"))   //obj对象和Java4相同
			{
				it.remove();   //用迭代器it来删除obj所指的元素
			}
			sop("obj="+obj);
		}
		sop(AL);
	/****在ListIterator迭代过程中，准备添加或删除元素****/
	     ListIterator LI = AL.listIterator();
         while(LI.hasNext())
		 {
			 Object obj = LI.next();
			 if(obj.equals("Java3"))
			 {
				 LI.add("ADD1");  //通过ListIterator可以做到添加元素
			 }
			 sop("Obj="+obj);
		 }
		 sop(AL);

	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}