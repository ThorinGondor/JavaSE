import java.util.*;
/**
    <?>        通配符，没法确定具体的类型时，各种类型都可以泛用。
	<? extends XXX>  这是上限符，意为可以接收XXX类以及它的子类。
	<? super XXX>   这是下限符，意为可以接收xxx类以及它的父类。
**/
class GenericDemo7
{
	public static void main(String[] args)
	{
		ArrayList<Person> AL = new ArrayList<Person>(); //<Person>作为是建立一个ArrayList时它的元素只能是Person类和它的子类。
		AL.add(new Person("Jason"));
		AL.add(new Person("Curry"));
		AL.add(new Student("Thompson"));
		AL.add(new Student("Durant"));

		Print(AL);
	}

	public static void Print(ArrayList<? extends Person> AL) //<?>任一一个对象都可，但是<? extends Person>限定了只能是Person类和它的子集。
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