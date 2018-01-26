/*n接口重要功能：建立体系以外的扩展功能
下例：建立了class学生体系，但是是否抽烟？这需要用interface来进行拓展*/

abstract class Student //建立学生体系
{
	public abstract void Study();
	public void Sport()
	{
		System.out.println("He will Sport");
	}
}

abstract class Worker
{ 
	public void Work()
	{
		System.out.println("Marks:");
		System.out.println("He will work");
	}
	public abstract void Earn();
}

interface Smoke  //学生体系扩展：用Interface来判断学生是否抽烟
{
	public abstract void Smoke();
}

interface Fight
{
	public abstract void Fight();
}

interface Drunk
{
	public String note = "Drunk Student";
	public abstract void Drunk();
}

/***********************************************/

class Zhangsan extends Student implements Smoke  //张三是学生体系的一个（即继承），同时他实现了抽烟（Smoke）
{
	
	public void Study()
	{
		System.out.println("Zhangsan:");
		System.out.println("He will Study");
	}
	public void Smoke()
	{
		System.out.println("He will Smoke");
	}
}

class Lisi extends Student implements Fight  //李四也是学生体系中的一个，他不实现抽烟（Smoke）,但他打架（Fight）
{
	
	public void Study()
	{
		System.out.println("Lisi:");
		System.out.println("He will Study");
	}
	public void Fight()
	{
		System.out.println("He will Fight");
	}
}

class Kimi extends Student implements Fight,Drunk
{
	
	public void Study()
	{
		System.out.println("Kimi:");
		System.out.println("He won`t Study");
	}
	public void Fight()
	{
		System.out.println("He will Fight");
	}
	public void Drunk()
	{
		System.out.println("He will Drink and his note is "+note);
	}
}
class Marks extends Worker implements Fight
{
	public void Fight()
	{
		System.out.println("He will Fight");
	}
	public void Earn()
	{
		System.out.println("He will Earn");
	}
}
/**********************************************/

class Interface
{
	public static void main(String[] args)
	{
		Zhangsan z=new Zhangsan();
		Lisi l=new Lisi();
		Kimi k=new Kimi();
		Marks m=new Marks();
		z.Study();
		z.Smoke();
		l.Study();
		l.Sport();
		k.Study();
		k.Fight();
		k.Drunk();
		m.Work();
		m.Earn();
		m.Fight();
	}
}