/**
    ���Զ��������ΪԪ�ش浽ArrayList���ϵ��У���ȥ���ظ�Ԫ��
	���磺�� �� ����ͬ����ͬ���䣬��Ϊͬһ���ˣ����ظ�Ԫ�ء�

	˼·��
	1.�����ˣ������ݷ�װ���˶���
	2.�������������˴��롣
	3.ȡ����
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
