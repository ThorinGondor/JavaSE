class Person
{
	int age = 100;
	String name = "BullShit";

/*****************************************************/
	Person(int age,String name)                  //此处是静态代码块，必须先执行并且对对象（age和name）进行了初始化，使得age=100；name="BullShit"；
	{this.age =age;
	 this.name =name;
	}
	{
		System.out.println("初始化:Name is "+name+",Age is "+age);
	}
/****************************************************/
	public void setage(int age)
	{
		this.age = age;
		System.out.println("Age is "+this.age);
	}
	public void speak(String name)
	{
		this.name = name;
		System.out.println("Name is "+this.name);
	}
}

class PersonDemo
{
	public static void main (String[] args)
	{
		Person p1 = new Person(15,"Lisi");
		p1.setage(15);
		p1.speak("Zhangsan");
	}
}