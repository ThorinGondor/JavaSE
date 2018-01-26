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
  
  往哈希表集合中存入自定义对象：人（姓名，年龄），不能重复。

  需要调用hasCode(); equals();两个函数！
  
  关键！HashSet是如何保证元素唯一性的呢：
      是通过元素的两个方法，hashcode喝equals完成。
      如果元素的hashCode值相同，才会判断equals是否为true。
      如果元素的hashCode值不同，不会调用equals。
   
   注意，对于判断元素是否存在、以及删除等操作，依赖的是元素的hashCode和equals方法。
 **/
import java.util.*;
 class Person
 {
	 String name=null;
	 int age=0;
	 Person(String name,int age)
	 {
		 this.name=name;
		 this.age=age;
	 }
	 public int hashCode()   //hasCode()用于判断哈希值是否相同
	 {
		 System.out.println(this.name+"...hasCode");
		 return 69;
	 }
	 public boolean equals(Object obj1)   //哈希值若相同，调用该equals()函数，判断元素内部的内容是否为true
	 {
		 if(!(obj1 instanceof Person))     //若元素内部的内容也相同，则返回true，则排除掉重复元素，若不相同，则返回false。
			 return false;
		 Person p = (Person)obj1;
		 System.out.println(this.name+this.age+"...ifequal..."+p.name+p.age);
		 return this.name.equals(p.name)&& this.age==p.age;
	 }

	 public String getName()
	 {
		 return name;
	 }
	 public int getAge()
	 {
		 return age;
	 }
 }
 /**********************************************/
 class UseHash
 {
	 public static void main(String[] args)
	 {
		 HashSet HS = new HashSet();
		 HS.add(new Person("ZhangSan",25));
		 HS.add(new Person("LiSi",35));
		 HS.add(new Person("ZhangSan",25));
         HS.add(new Person("WangWu",23));

		 Iterator it = HS.iterator();
		 while(it.hasNext())
		 {
			 Person P = (Person)it.next();
			 sop(P.getName()+"; "+P.getAge());   //由于内部存储是无序的，因此输出的也是散列无序的
		 }
	 }

	 public static void sop(Object obj)
	 {
		 System.out.println(obj);
	 }
 }
