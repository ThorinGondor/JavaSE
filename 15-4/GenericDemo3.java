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

import java.util.*;

class Worker
{
}
class Student
{
}
class Tool<Customize>  //这里用Customize这个词代替了Object，父类使用Customize即可,Customize变成了一个父类
{
	private Customize Ctm;
	public void setObject(Customize Ctm)
	{
		this.Ctm=Ctm;
	}
	public Customize getObject()  //Customize当中了一个对象来使用
	{
		return Ctm;
	}
}
class GenericDemo3
{
	public static void main(String[] args)
	{
		Tool<Worker> T = new Tool<Worker>();  //有了上述泛型定义，这里Customize包括了Worker和Student等子类，可以写进这些子类从而限制类型，保证安全
		T.setObject(new Worker());
		Worker W = T.getObject();
	}
}