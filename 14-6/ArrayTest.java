/**
    将自定义对象作为元素存到ArrayList集合当中，并去除重复元素
	例如：存 人 对象，同姓名同年龄，视为同一个人，即重复元素。

	思路：
	1.描述人，将数据封装进人对象。
	2.定义容器，将人存入。
	3.取出。
**/
import java.util.*;
class Person
{
	String name = null;
	int age = 0;
	Person(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public boolean Judge(Object obj)
	{
		if(!obj instanceof Person)
		{
			return false;Judge(p.name)&&this.gae==p.age;
		}

		Person p = (Person)obj;
		return this.name.
	}
}
/************************************************/
class ArrayTest
{
	public static void main(String[] args) 
	{
		/***********************************/
		Person P1 = new Person("LiSi",35);
		Person P2 = new Person("ZhangSan",17);
		Person P3 = new Person("LiSi",35);
		Person P4 = new Person("WangWu",17);
		Person P5 = new Person("ZhangSan",17);
        Person P6 = new Person("ZhaoLiu",23);
		/***********************************/
		ArrayList AL = new ArrayList();
		AL.add(P1);
		AL.add(P2);
		AL.add(P3);
		AL.add(P4);
		AL.add(P5);
		AL.add(P6);

		Iterator it1 = AL.iterator();
		while(it1.hasNext())
		{
			Person P = (Person)it1.next();
			System.out.print(P.getName()+"--"+P.getAge()+"; ");	
		}
		System.out.println();

        /***********************************/
		Iterator it2 = AL.iterator();
		ArrayList AL2 = new ArrayList();
		while(it2.hasNext())
		{
			Object obj = it2.next();
			if(!AL2.contains(obj))
			{
				AL2.add(obj);
			}
		}
		sop(AL2);

	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
