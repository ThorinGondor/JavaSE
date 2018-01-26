class Both
{
	String name;
	int age;
}

class Student extends Both
{
	public void Study()
	{
		System.out.println("Student "+name+" "+age);
	}
}

class Worker extends Both
{
	public void Work()
	{
		System.out.println("Worker "+name+" "+age);
	}
}
/****************************************/
class Extend
{
	public static void main(String[] args)
	{
		Student S1 = new Student();
		S1.name="Zhangsan";
		S1.age=15;
		S1.Study();
		Worker W1 = new Worker();
		W1.name="Lisi";
		W1.age=37;
		W1.Work();
	}
}