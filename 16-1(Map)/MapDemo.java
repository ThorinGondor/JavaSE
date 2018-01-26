/****
    Map集合概述：该集合存储键值对，一对一对往里存，而且要保证键的唯一性。
	打个比方：Collection里面装的都是一票单身男人，而Map里装的是一对对夫妻。
	因此前者是单例的集合，后者是双例的集合。

	这是一个Map接口。
	Map<K,V>
	K代表Key，即键位; 
	V代表Value，即值;
	两者有映射关系，将K映射到V对象，每个K只能映射到唯一一个V。

	功能：
	1.添加元素: put(K key,V value)

	2.删除元素: clear()
	            remove(Object key)

	3.判断元素: containsValue(Object Key)
	            containsKey(Object Value)
				isEmpty()

	4.获取元素: get(Object Key)
	            size()
				values()
			
				entrySet()
				keySet()
	Map集合：
	   |--Hashtable:此类实现哈希表，该哈希表将键映射到相应的值，任何非null对象都可以用作键和值。用作键的对象必须实现hashCode方法和equals方法。
	   |--HashMap：也是哈希表数据结构，与Hashtable大致相同，不过它允许使用null键和值。它效率较高。
	   |--TreeMap：底层是二叉树结构，可以用于给Map集合中的键进行排序！
	 
	   以上，和Set很像。
	   其实Set的底层就是使用了Map集合。
****/
import java.util.*;

class MapDemo
{
	public static void main(String[] args)
	{
		Map<String,String> map = new HashMap<String,String>();
		map.put("01","张三");
		map.put("02","李四");
		map.put("03","王五");
		map.put("04","赵六");
		map.put("05","周七");
		map.put(null,"朱八");

		System.out.println(map.containsKey("02"));     //containsKey() 和 containsValue() 的用法示例
		System.out.println(map.containsValue("赵六"));
		System.out.println(map.remove("04"));     //清除key的04，同返回给key对应的值
        System.out.println(map.isEmpty());        //判断是否为空
		System.out.println(map.get("01"));        //获取对应的key为"01"的value值
		System.out.println(map.get(null));        //获取对应的key为null(空)的value值
		System.out.println(map);                  //输出全部映射，形式为key=value
		System.out.println("Value(1):"+map.values());         //获取Map集合中所有的值 
        
		//获取Map集合中所有的值:
		Collection<String> coll = map.values();
		System.out.println("Value(2):"+coll);
	}
}