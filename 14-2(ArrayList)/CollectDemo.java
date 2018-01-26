/**
	                     Collection;
	          List;                    Set;
 ArrayList  LinkedList  Vector;   HashSet TreeSet;
    
	Iterator：迭代器
	用法： Iterator it = 某集合对象.iterator();
	什么是迭代器？
	其实它就是取出（获取）集合中的元素的方式，方法如下： it.next();
**/
import java.util.*;

class CollectDemo 
{
	public static void main(String[] args) 
	{
	/**创建一个集合容器，使用Collection的接口子类,例如ArrayList**/
		ArrayList AL = new ArrayList();

	/**1.添加元素：**/
		AL.add("Java1");
		AL.add("Java2");
		AL.add("Java3");
		AL.add("Java4");
		AL.add("Java5");

        Iterator it = AL.iterator();   //对象集合AL获取迭代器，用于取出集合中的元素
		sop(it.next());   //xxx.next();获取第一个元素：“Java1”
		sop(it.next());   //xxx.hasNext();获取第二个元素：“Java2”
		sop(it.hasNext()); //如果仍有下一个元素可以迭代，则返回true

		while(it.hasNext())   //只要集合中还有下个元素，那就继续迭代获取下一个元素
		{
			sop(it.next());
		}
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}

/**
     add(str);  确保此collection包含指定的元素
	 clear();   清空容器
	 remove(str);  从Collection中移除指定元素的单个实例
	 AL1.retainALL(AL2); AL1中只会保留和AL2中相同的元素，即取交集。
**/