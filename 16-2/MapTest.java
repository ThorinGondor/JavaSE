/****
    ��Ŀ��ÿһ��ѧ�����ж�Ӧ�Ĺ����ء�
	ѧ����Student����ַString
	ѧ�����ԣ�����������
	ע�⣺������������ͬ��Ϊͬһ��ѧ����
	��֤ѧ����Ψһ�ԡ�
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
    
	/***��дhashCode������equals����������ȥ���ظ�Ԫ��***/
	public int hashCode()
	{
		return 60;
	}
	public boolean equals(Object obj)  //��equals����ʱΪ��ȥ���ظ�Ԫ�أ����û�и���д������Ԫ�ؽ��ظ���
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
	public String toString()  //toString()���������ã����û���������������������Ϊ��ϣֵ������toString��ת�����������˿ɶ���returnֵ
	{
		return name+":"+age;
	}
}
class MapTest
{
	public static void main(String[] args) 
	{
		//�����µĿ�Map����
		Map<Student,String> map = new HashMap<Student,String>();
        
		//����һϵ���µ�Student����
		Student s1 = new Student("����",24);
		Student s2 = new Student("����",23);
		Student s3 = new Student("����",25);
		Student s4 = new Student("����",23);
		Student s5 = new Student("����",22);
		Student s6 = new Student("����",24);
        
		//��������Щ�����Ԫ����Ϊkey��valueװ��Map������
		map.put(s1,"�㶫");
		map.put(s2,"�Ϻ�");
		map.put(s3,"����");
        map.put(s4,"���");
		map.put(s5,"����");
		map.put(s6,"̨��");

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