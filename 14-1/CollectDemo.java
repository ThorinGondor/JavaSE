/**
    集合类：
	和数组有所不同，数组长度固定，可以存储基本数据类型。
	而集合的长度是可变的，集合里只能存储对象。
	集合像个水杯，是个容器。
	例如有五个集合容器，它们之间有共性也有特性，前三个容器上层都有一个圆形，后两个容器上层都有一个正方形，同时顶上还有圆角方形，这是五个容器的所有特性！
	这样就形成了集合框架，顶层的就是Collection（例圆角方形）

	                     Collection;
	          List;                    Set;
 ArrayList  LinkedList  Vector;   HashSet TreeSet;
    
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

	/**2.获取个数，即集合长度**/
	    sop(AL.size());
	/**3.打印该集合**/
	    sop("原集合:"+AL);
	/**4.删除元素**/
	    AL.remove("Java3");
		sop("删除后:"+AL);
	/**5.判断是否为空和是否包括某些元素**/
	    sop(AL.isEmpty());
		sop(AL.contains("Java4"));
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
/**
      
**/