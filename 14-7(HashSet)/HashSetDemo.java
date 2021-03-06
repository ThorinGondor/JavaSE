 /**                     Collection;
	          List;                    Set;
 ArrayList  LinkedList  Vector;   HashSet TreeSet;
 
  Collection
      |--List:元素是有序的，元素可以重复。因为该集合体系有索引。特点：查询速度很快，修改方便。
	      |--ArrayList: 底层的数据结构使用的是数组结构。特点：查询很快，但是增删稍慢。(ArrayList()默认初始长度是10)
		  |--LinkedList: 底层使用的链表数据结构
		  |--Vector: 底层是数组数据，已经被ArrayList代替。
	  |--Set：元素是无序的，元素不可以重复。它是一种不包含重复的Collection。(因此！因此！它可以用于筛除集合中重复的元素！)
	      |--HashSet：底层数据结构是哈希表。
		  |--TreeSet：
  
  Set集合的功能和Collection是一致的
  哈希表介绍：
 **/
import java.util.*;
 class HashSetDemo
 {
	 public static void main(String[] args)
	 {
		 HashSet HS = new HashSet();
		 HS.add("Java1");
		 HS.add("Java2");
		 HS.add("Java3");
		 HS.add("Java4");
		 HS.add("Java5");
		 HS.add("Java6");
		 HS.add("Java4");
		 HS.add("Java4");
		 HS.add("Java2");  //这里重复的元素会添加失败！

		 Iterator it = HS.iterator();
		 while(it.hasNext())
		 {
			 sop(it.next());   //由于内部存储是无序的，因此输出的也是散列无序的
		 }
	 }

	 public static void sop(Object obj)
	 {
		 System.out.println(obj);
	 }
 }