/***
System:
描述系统一些信息。
获取系统属性信息：Properties类，getProperties();
Properties中文意思是属性
System类中的方法和属性都是静态的,因此不能直接建立一各新对象，只能通过System.getProperties();来建立一个对象。
out：标准输出，默认是控制台
in：标准输入，默认是键盘
    
	//自定义添加一对映射放进Properties的Map集合中:
		System.setProperty("J20","J31");   
***/
import java.util.*;
class setProperty 
{
	public static void main(String[] args) 
	{
		//只能利用getProperties();来建立一个Properties对象.
		Properties MapProp = System.getProperties(); //右式这边，系统获得属性。左式这边，创建属性Properties类的一个对象MapProp，该对象为Map的子类
		Set<Object> ks = MapProp.keySet();       //将该Map子类MapProp的所有key列成Set单例，这样可以用迭代器遍历输出
		//自定义一对映射放进Properties中。
		System.setProperty("J20","J31");
		System.setProperty("PC.VisionCard","Nvidia Geforce GTX780M");

        //打印输出：
		Iterator<Object> it = ks.iterator();
		while(it.hasNext())
		{
			Object key = it.next();
			Object value = MapProp.get(key);
			System.out.println(key+"---"+value);
		}
		//eg.获取key为“os.name”所对应的value值。
		Object value2 = MapProp.get("os.name");
		System.out.println(value2);
	}
}
