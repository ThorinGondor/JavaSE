/***
    高级For循环：
	格式：
	for(数据类型 变量名:被遍历的集合(Collections)或者数组)
	{
	}

	该方法对集合进行遍历时，只能获取集合的元素，但是不能对元素进行操作。
	而迭代器除了获取元素，还可以进行remove()动作，ListIterator还可以进行LL.add("XXX");
	建议还是使用传统的for循环写法和迭代器。
***/
import java.util.*;
class  ForEnhance
{
	public static void main(String[] args) 
	{
		List<String> AL = new ArrayList<String>();
		AL.add("A");
		AL.add("B");
		AL.add("C");
        
		/*JDK 1.2用迭代器，麻烦
		Iterator<String> it = AL.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		*/

		//JDK 1.用for增强，简单方便
		for(String str:AL)
		{
			System.out.println(str);
		}
	}
}
