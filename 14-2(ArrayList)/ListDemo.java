/**
	                     Collection;
	          List;                    Set;
 ArrayList  LinkedList  Vector;   HashSet TreeSet;

   Collection
      |--List:元素是有序的，元素可以重复。因为该集合体系有索引。
	  |--Set：元素是无序的，元素不可以重复。
	List：特有方法是，凡是可以操作脚标的方法都是该体系特有的方法。

	增加：
	   add(index element);
	   addAll(index,Collection);
	 删：
	   remove(index);
	 改：
	   set(index,element);
	 查：
	   get(index);
	   sublist(from,to);
	   listIterator();
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

		/*****在指定位置添加元素**********/
		AL.add(3,"ADD1");
		sop(AL);
        /*****在指定位置删除元素**********/
		AL.remove(2);
		sop(AL);
        /*****在指定位置修改元素**********/
		AL.set(3,"SET1");
		sop(AL);
		/*****在指定位置查元素**********/
		sop("get(4)---"+AL.get(4));
	
		/****通过迭代器遍历获取每个元素****/
		Iterator it = AL.iterator();
		while(it.hasNext())
		{
			sop("next: "+it.next());
		}

		/*********************/
		List sub = AL.subList(1,4);
		sop("from 1 to 3: "+sub);
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}