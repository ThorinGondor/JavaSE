 /**                     Collection;
	          List;                    Set;
 ArrayList  LinkedList  Vector;   HashSet TreeSet;
 
  Collection
      |--List:元素是有序的，元素可以重复。因为该集合体系有索引。特点：查询速度很快，修改方便。
	      |--ArrayList: 底层的数据结构使用的是数组结构。特点：查询很快，但是增删稍慢。(ArrayList()默认初始长度是10)
		  |--LinkedList: 底层使用的链表数据结构
		  |--Vector: 底层是数组数据，已经被ArrayList代替。
	  |--Set：元素是无序的，元素不可以重复。它是一种不包含重复的Collection。(因此！因此！它可以用于筛除集合中重复的元素！)
	      |--HashSet：底层数据结构是哈希表。线程是不同步的。保证元素唯一性的原理是判断元素的hashCode()和元素的equals()方法是否为true。
		  |--TreeSet：它可以对Set集合中的元素进行排序：先按照字母大小写排序，再按照字母表先后顺序排序。
		  因此!因此！TreeSet可用于排序！
		              
 **/
/**
     需求：往TreeSet集合中存储学生对象，按照学生的年龄进行排序。
	 这时，TreeSet必须重写Comparable接口，此接口强行对实现它的每个类的对象进行强行排序！
	 compareTo函数就是它的自然比较方法。
**/
import java.util.*;

class Student implements Comparable  //该接口强制这里的学生对象具备比较性！
{
	private String name;
	private int age;
	Student(String name,int age)
	{
		this.name=name;
		this.age=age;
	}

	public String getName()
	{
		return name;
	}

	public int getAge()
	{
		return age;
	}

	public int compareTo(Object obj)  //实现comparable接口时，必须重写compareTo()函数！
	{
		/***只是判断一下是不是学生对象，不是必须步骤***/
		if(!(obj instanceof Student))
		{throw new RuntimeException("不是学生对象！");}
		
		/***此处左式为输入进来的新的学生对象cp，它将和上一个学生对象(this)进行比较***/
		Student cp = (Student)obj;

		/*******排序规则*******/
		if(this.age>cp.age)
		{
			return 1; //返回负数表示逆向排序，整数表示正向排序
		}
		if(this.age==cp.age)//这里年龄相同时，要判断姓名
		{
			this.name.compareTo(cp.name);//这里是比较两个字符串的方法，通过字母表顺序排
		}
        return -1;
	}
}

class MyStore
{
	public static void main(String[] args)
	{
		TreeSet TS = new TreeSet();
		TS.add(new Student("Tifa",17));
		TS.add(new Student("Jason",15));
		TS.add(new Student("Tom",17));
		TS.add(new Student("Bob",18));
		TS.add(new Student("Jake",20));
		
		Iterator it = TS.iterator();

		while(it.hasNext())
		{
			Student S = (Student)it.next();
			System.out.println(S.getName()+"..."+S.getAge());
		}
	}

	public static void sop(Object o)
	{
		System.out.println(o);
	}
}