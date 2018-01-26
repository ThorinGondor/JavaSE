/****
    题目：每一个学生都有对应的归属地。
	学生：Student，地址String
	学生属性：姓名，年龄
	注意：姓名和年龄相同视为同一个学生。
	保证学生的唯一性。
****/
import java.util.*;

class Student 
{
	private String name;
	private int age;
	Student(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
    /*
	public int compareTo(Student S)
	{
		int num = new Integer(this.age).compareTo(new Integer(S.age));

		if(num==0)
		{
			return this.name.compareTo(S.name);
		}
		return num;
	}
	*/
    
	/***重写hashCode方法和equals方法，用于去除重复元素***/
	public int hashCode()
	{
		return 60;
	}
	public boolean equals(Object obj)  //该equals函数时为了去除重复元素，如果没有该重写方法，元素将重复。
	{
		if(!(obj instanceof Student))
		{
			return false;
		}

		Student stu = (Student)obj;
		return this.name.equals(stu.name)&&this.age==stu.age;
	}
    /**********************************/

	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public String toString()  //toString()函数的作用：如果没有这个，主函数里的输出将为哈希值，有了toString的转换，输出变成了可读的return值
	{
		return name+":"+age;
	}
}
class MapTest
{
	public static void main(String[] args) 
	{
		//建立新的空Map集合
		Map<Student,String> map = new HashMap<Student,String>();
        
		//创建一系列新的Student对象
		Student s1 = new Student("张三",24);
		Student s2 = new Student("李四",23);
		Student s3 = new Student("王五",25);
		Student s4 = new Student("李四",23);
		Student s5 = new Student("赵六",22);
		Student s6 = new Student("周七",24);
        
		//将以上这些对象的元素作为key和value装入Map集合中
		map.put(s1,"广东");
		map.put(s2,"上海");
		map.put(s3,"北京");
        map.put(s4,"香港");
		map.put(s5,"深圳");
		map.put(s6,"台北");

		System.out.println(map);

		//keySet
		Set<Student> keyset = map.keySet();
		Iterator<Student> it = keyset.iterator();
		while(it.hasNext())
		{
			Object o = it.next();
			String add = map.get(o);
			System.out.println(o+"..."+add);
		}
	}
}
