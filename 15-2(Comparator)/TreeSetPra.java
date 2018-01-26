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
     TreeSet排序的第一种方式：强制让元素具有可比较性。但是需要令class对象实现Comparable接口，同时该对象内部应重写compareTo()函数。见15-1的MyStore

     TreeSet排序的第二种方式：当元素自身不具备比较性时，或者并不需要它具备的比较性，这时需要让集合自身具备比较性。
                              应在集合初始化时就有了比较方式。
							  定义一个比较器，将比较器对象作为参数传递给TreeSet集合的构造函数。
							  方法就是创建一个新的对象实现Comparator，并且该对象在主函数里新创建一个TreeSet的时候就得进行调用！见下列代码
***/

/***
练习：按照字符串长度排序。往TreeSet里存字符串，并按照字符串的长度排序。
***/
import java.util.*;

class TreeSetPra
{
	public static void main(String[] args)
    {
		TreeSet TS = new TreeSet(new CompareTool());  //创建TreeSet的时候就去调用代码底下的比较工具
		TS.add("abcde");
		TS.add("cdfg");
		TS.add("ouejwic");
		TS.add("opa");
		TS.add("jke");
		TS.add("dsqwefdrf");

		/***打印排序后的结果***/
		Iterator it = TS.iterator();
		while(it.hasNext())
		{
			sop(it.next());
		}
		/**********************/
	}

	public static void sop(Object o)
	{
		System.out.println(o);
	}
}

class CompareTool implements Comparator //比较工具，由主函数调用，将add进来的各个对象进行排序任务
{
	public int compare(Object obj1,Object obj2)
	{
		int result=0;
		String s1 = (String)obj1;//强制转换成String类型
		String s2 = (String)obj2;
 
        /***设计具体的比较方法***/
		if(s1.length()>s2.length())
		{
			result = 1;
		}
		if(s1.length()<s2.length())
		{
			result = -1;
		}
		if(s1.length()==s2.length())
		{
			result = s1.compareTo(s2);
		}

		return result;
	}
}