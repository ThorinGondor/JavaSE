/***
System:
描述系统一些信息。
获取系统属性信息：Properties类，getProperties();
Properties中文意思是属性
System类中的方法和属性都是静态的。
out：标准输出，默认是控制台
in：标准输入，默认是键盘
***/
import java.util.*;
import static java.lang.System.*;

class SystemDemo 
{
	public static void main(String[] args) 
	{
	    Properties prop = System.getProperties();
		//因为Properties是Hashtable的子类，也就是Map集合的一个子类对象，可以通过Map的方法取出该集合中的元素。
		//该Properties集合中存储的都是Object类型
        
		//将该Properties（属于Map）集合的key值通过keySet()变成一个Set的单例集合，通过迭代器输出。
        Set<Object> HS = prop.keySet();
		Iterator it = HS.iterator();
		while(it.hasNext())
		{
			Object key=it.next();
			Object Value = prop.get(key);  //通过prop.get(key)获得每一个key所对应的value
			System.out.println(key+"---"+Value);
		}
	}
}
