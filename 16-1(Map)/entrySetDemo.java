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
	 
    Map集合的两种取出方式：
	1.keySet：将Map集合中所有的键key存入到Set集合。因为Set具备迭代器，所有可以迭代方式取出所有的键，再根据get方法，获取每一个键对应的值。
              （原理：就是将Map集合里的key元素提取出来列成Set集合，再用Iterator取出）

	2.entrySet：它返回的是映射关系的数据类型，将Map集合中的映射关系存入到了Set集合当中。
	             这个关系很特殊，叫做 Map.Entry<String,String>
****/
import java.util.*;
class Player
{
	private String name;
	private String team;

	Player(String name,String team)
	{
		this.name=name;
		this.team=team;
	}

	public String getName()
	{
		return name;
	}
	public String getTeam()
	{
		return team;
	}
}
class entrySetDemo 
{
	public static void main(String[] args) 
	{
		//创建一个Map集合框架
		Map<String,String> map = new HashMap<String,String>();
		
		//创建一系列新的球员对象
		Player P1 = new Player("Curry","Warriors");
		Player P2 = new Player("James","Cavaliers");
		Player P3 = new Player("Leonard","Spurs");
		Player P4 = new Player("Westbrook","Thunder");
		Player P5 = new Player("Durant","Warriors");
        
		//将球员对象的名字作为key、球队作为value放进Map集合中，
		map.put(P1.getName(),P1.getTeam());
		map.put(P2.getName(),P2.getTeam());
		map.put(P3.getName(),P3.getTeam());
		map.put(P4.getName(),P4.getTeam());
		map.put(P5.getName(),P5.getTeam());
        System.out.println(map);

		//用entrySet函数将Map集合的映射关系列成了Set集合
		Set<Map.Entry<String,String>> es = map.entrySet();
		//然后可以用迭代器
		Iterator<Map.Entry<String,String>> it = es.iterator();
		while(it.hasNext())
	    {
			Map.Entry<String,String> me =it.next();
			String key = me.getKey();
			String value = me.getValue();
			System.out.println(key+" "+value);
		}
	}
}
