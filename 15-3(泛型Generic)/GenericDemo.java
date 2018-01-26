/**
     泛型：用于解决安全问题，假设我们输入了不同类型的内容，(比如String类和int类等)。
	       
		   好处：1.将运行时期出现的问题转移到了编译过程中，让运行时问题减少。
		         2.避免了强制转换的麻烦。
		   
		   泛型的格式：通过<XXX>来定义、限制要操作的引用数据类型。

		   通常在集合框架Collection中很常见，只要见到尖括号，就要定义泛型。
		   当使用集合时，就是要将集合中要存储的数据类型作为参数传递到<>即可。
**/
import java.util.*;

class GenericDemo
{
	public static void main(String[] args) 
	{
		ArrayList<String> AL = new ArrayList<String>(); //<String>限定了ArrayList表里的元素都只能为String类型的字符串
		AL.add("Kimi");
		AL.add("Schumacher");
		AL.add("Alonso");
		AL.add("Hamilton");
		AL.add("Vettel");


		Iterator<String> it = AL.iterator();  //Iterator后面添加<String>注释以后，警告也随之消失，Iterator迭代器的类型安全了
		while(it.hasNext())
		{
			String s0 = /*(String)*/it.next();  //有了上述注释，这里不再需要强制转换
			System.out.println(s0+"---"+s0.length());
		}
	}
}

