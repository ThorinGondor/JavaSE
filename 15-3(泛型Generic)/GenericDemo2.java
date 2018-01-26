/**
     泛型：用于解决安全问题，假设我们输入了不同类型的内容，(比如String类和int类等)。
	       
		   好处：1.将运行时期出现的问题转移到了编译过程中，让运行时问题减少。
		         2.避免了强制转换的麻烦。
		   
		   泛型的格式：通过<XXX>来定义、限制要操作的引用数据类型。

		   通常在集合框架Collection中很常见，只要见到尖括号，就要定义泛型。
		   当使用集合时，就是要将集合中要存储的数据类型作为参数传递到<>即可。
**/
import java.util.*;

class GenericDemo2
{
	public static void main(String[] args) 
	{
		TreeSet<String> TS = new TreeSet<String>(new CompareTool());
		TS.add("China");
		TS.add("America");
		TS.add("France");
		TS.add("Russia");
		TS.add("England");

		Iterator<String> it = TS.iterator();
		while(it.hasNext())
		{
			String str = it.next();
			System.out.println(str);
		}
	}
}

class CompareTool implements Comparator<String>  //定义操作数据只能为String类型
{
	public int compare(String o1,String o2)
	{
		int result=0;
		String s1=o1;    //因为上述已经限制String类，这里也就不再需要强制转换
		String s2=o2;   
		
		/****具体的比较方法****/
		if(o1.length()<o2.length())
		{
			result=-1;
		}
		if(o1.length()>o2.length())
		{
			result=1;
		}
		if(o1.length()==o2.length())
	    {
			result=o1.compareTo(o2);
		}
		return result;
	}
}
