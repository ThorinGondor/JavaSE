/***
Arrays工具类:用于操作数组的工具类。
里面都是静态方法。
     1. Arrays.asList(arr); 将数组变成list集合。
	  
	   注：将数组转化成集合的好处在于可以用集合的思想和方法来操作数组中的元素。
	   所以以后如果出现要操作数组的情况时，应转换成集合来操作比较好。
	   因为数组本身操作方法比较少，操作起来很麻烦，而集合方法很多。
	     
		 注意：将数组用Arrays.asList();转换成集合list以后，可以用的方法为：
		   list.contains("XXX");
		   list.isEmpty();
		   list.get(3);
		   list.indexOf("XXX");
           list.subList();
		 但就是不能用增删！例如add("XXX"),remove(4);会跳出异常
		
***/
import java.util.*;
class  ArraysDemo
{
	 public static void sop(Object o)
	{
		System.out.println(o);
	}
	public static void main(String[] args) 
	{
		String[] arr = {"A","B","C","D","E"};  //新建一个String类型的数组
		List<String> list = Arrays.asList(arr);//Arrays.asList(); 将数组转化成List集合
        
		/**将数组转化成集合的好处在于可以用集合的思想和方法来操作数组中的元素。
		   所以以后如果出现要操作数组的情况时，应转换成集合来操作比较好
		   因为数组本身操作方法比较少，操作起来很麻烦，而集合方法很多。**/
		sop(list);
		sop(list.contains("C"));
		sop(list.isEmpty());
		sop(list.get(3));
		sop(list.indexOf("B"));
        /**
		注意：将数组用Arrays.asList();转换成集合list以后，可以用的方法为：
		  list.contains("XXX");
		  list.isEmpty();
		  list.get(3);
		  list.indexOf("XXX");
          list.subList();
		但就是不能用增删！例如add("XXX"),remove(4);会跳出异常
		**/

	}
   
}
