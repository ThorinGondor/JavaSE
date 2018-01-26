
class Staff 
{
	String name;
	int ID;
	int salary;
	Staff(String name,int ID,int salary)
	{
		this.name=name;
		this.ID=ID;
		this.salary=salary;
	}
}

class Manager extends Staff
{
	int bonus;
	Manager(String name,int ID,int salary,int bonus)
	{
		super(name,ID,salary);
		this.bonus=bonus;
	}
	public void Work()
	{
		System.out.println("Staff Work");
	}
}
/*
class Pro extends Staff
{
	Pro(String name,int ID,int salary)
	{
		super(name,ID,salary);
		public void Work()
		{
			System.out.println("Pro Work");
		}
	}
}
/*****************************************/
class Company
{
	public static void main(String[] args)
	{
		/*Pro P1 = new Pro();
		P1.name="Zhangsan";
		P1.ID=1120131707;
		P1.salary=4500;*/
        Manager M1 = new Manager();
		M1.name="Lisi";
		M1.ID=06721301;
		M1.salary=9000;
		M1.bonus=3000;
		M1.Work();
	}
}