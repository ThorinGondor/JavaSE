/*n�ӿ���Ҫ���ܣ�������ϵ�������չ����
������������classѧ����ϵ�������Ƿ���̣�����Ҫ��interface��������չ*/

abstract class Student //����ѧ����ϵ
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

interface Smoke  //ѧ����ϵ��չ����Interface���ж�ѧ���Ƿ����
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

class Zhangsan extends Student implements Smoke  //������ѧ����ϵ��һ�������̳У���ͬʱ��ʵ���˳��̣�Smoke��
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

class Lisi extends Student implements Fight  //����Ҳ��ѧ����ϵ�е�һ��������ʵ�ֳ��̣�Smoke��,������ܣ�Fight��
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