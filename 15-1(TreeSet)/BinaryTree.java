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
		  |--TreeSet：它可以对Set集合中的元素进行排序：默认是先按照字母大小写排序，再按照字母表先后顺序排序。
		              底层数据结构是二叉树，若compareTo函数返回0，则保证数据唯一性。
		  因此!因此！TreeSet可用于排序！
		              
 **/
/**
     需求：往TreeSet集合中存储学生对象，按照学生的年龄进行排序。
	 这时，TreeSet必须重写Comparable接口，此接口强行对实现它的每个类的对象进行强行排序！
	 compareTo函数就是它的自然比较方法。
**/
/***
     TreeSet排序的第一种方式：强制让元素具有可比较性。但是需要令class对象实现Comparable接口，同时该对象内部应重写compareTo()函数。
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

	public int compareTo(Object obj)  //关键：该函数设计比较方法！
	{
		return 1; //函数内部不做比较，也即不做排序，还是原顺序，因此，主函数里的Iterator遍历输出将保持原顺序。
		//return -1; 即和上面的原序相反，为倒序
	}
}

class BinaryTree
{
	public static void main(String[] args)
	{
		TreeSet TS = new TreeSet();
		TS.add(new Student("Tifa72",17));
		TS.add(new Student("Tifa50",15));
		TS.add(new Student("Tifa20",17));
		TS.add(new Student("Tifa01",18));
		TS.add(new Student("Tifa96",20));
		
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