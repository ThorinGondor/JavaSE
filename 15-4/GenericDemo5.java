/**
     泛型：用于解决安全问题，假设我们输入了不同类型的内容，(比如String类和int类等)。
	       
		   好处：1.将运行时期出现的问题转移到了编译过程中，让运行时问题减少。
		         2.避免了强制转换的麻烦。
		   
		   泛型的格式：通过<XXX>来定义、限制要操作的引用数据类型。

		   通常在集合框架Collection中很常见，只要见到尖括号，就要定义泛型。
		   当使用集合时，就是要将集合中要存储的数据类型作为参数传递到<>即可。
**/
/***
     什么时候用泛型类？当类中要操作的引用数据类型不确定的时候，早期定义Object来完成扩展，现在定义泛型类来扩展<XXX>
	 
	 这种方案是在用泛型定义 类。
***/
/***
      泛型类所定义的泛型，在整个类有效，如果被方法使用，那么泛型类建立的对象明确要操作的类型后，那么对于此对象便不能操作别的数据类型。

	  为了让不同方法可以操作不同类型，且类型还不确定。
	  那么可将泛型定义在方法上。
	  还可以将泛型定义在接口上。
***/
import java.util.*;
interface ThePort<E>
{
	public abstract void Show(E e);
}

class Card<E> implements ThePort<E>
{
	public void Show(E e)
	{
		System.out.println(e);
	}
}

class GenericDemo5
{
	public static void main(String[] args)
	{
		Card<String> Cd = new Card<String>();
		Cd.Show("DF");
	}
}