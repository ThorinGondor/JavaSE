import java.util.*;
/**
    <?>        ͨ�����û��ȷ�����������ʱ���������Ͷ����Է��á�
	<? extends XXX>  �������޷�����Ϊ���Խ���XXX���Լ��������ࡣ
	<? super XXX>   �������޷�����Ϊ���Խ���xxx���Լ����ĸ��ࡣ
**/
class GenericDemo7
{
	public static void main(String[] args)
	{
		ArrayList<Person> AL = new ArrayList<Person>(); //<Person>��Ϊ�ǽ���һ��ArrayListʱ����Ԫ��ֻ����Person����������ࡣ
		AL.add(new Person("Jason"));
		AL.add(new Person("Curry"));
		AL.add(new Student("Thompson"));
		AL.add(new Student("Durant"));

		Print(AL);
	}

	public static void Print(ArrayList<? extends Person> AL) //<?>��һһ�����󶼿ɣ�����<? extends Person>�޶���ֻ����Person��������Ӽ���
	{
		Iterator<? extends Person> it = AL.iterator();
		while(it.hasNext())
		{
			Person P = (Person)it.next();
			System.out.println(P.getName());
		}
	}
}

class Person
{
	private String name;
	Person(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
}

class Student extends Person
{
	Student(String name)
	{
		super(name);
	}
}