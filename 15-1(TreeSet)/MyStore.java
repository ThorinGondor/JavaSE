 /**                     Collection;
	          List;                    Set;
 ArrayList  LinkedList  Vector;   HashSet TreeSet;
 
  Collection
      |--List:Ԫ��������ģ�Ԫ�ؿ����ظ�����Ϊ�ü�����ϵ���������ص㣺��ѯ�ٶȺܿ죬�޸ķ��㡣
	      |--ArrayList: �ײ�����ݽṹʹ�õ�������ṹ���ص㣺��ѯ�ܿ죬������ɾ������(ArrayList()Ĭ�ϳ�ʼ������10)
		  |--LinkedList: �ײ�ʹ�õ��������ݽṹ
		  |--Vector: �ײ����������ݣ��Ѿ���ArrayList���档
	  |--Set��Ԫ��������ģ�Ԫ�ز������ظ�������һ�ֲ������ظ���Collection��(��ˣ���ˣ�����������ɸ���������ظ���Ԫ�أ�)
	      |--HashSet���ײ����ݽṹ�ǹ�ϣ���߳��ǲ�ͬ���ġ���֤Ԫ��Ψһ�Ե�ԭ�����ж�Ԫ�ص�hashCode()��Ԫ�ص�equals()�����Ƿ�Ϊtrue��
		  |--TreeSet�������Զ�Set�����е�Ԫ�ؽ��������Ȱ�����ĸ��Сд�����ٰ�����ĸ���Ⱥ�˳������
		  ���!��ˣ�TreeSet����������
		              
 **/
/**
     ������TreeSet�����д洢ѧ�����󣬰���ѧ���������������
	 ��ʱ��TreeSet������дComparable�ӿڣ��˽ӿ�ǿ�ж�ʵ������ÿ����Ķ������ǿ������
	 compareTo��������������Ȼ�ȽϷ�����
**/
import java.util.*;

class Student implements Comparable  //�ýӿ�ǿ�������ѧ������߱��Ƚ��ԣ�
{
	private String name;
	private int age;
	Student(String name,int age)
	{
		this.name=name;
		this.age=age;
	}

	public String getName()
	{
		return name;
	}

	public int getAge()
	{
		return age;
	}

	public int compareTo(Object obj)  //ʵ��comparable�ӿ�ʱ��������дcompareTo()������
	{
		/***ֻ���ж�һ���ǲ���ѧ�����󣬲��Ǳ��벽��***/
		if(!(obj instanceof Student))
		{throw new RuntimeException("����ѧ������");}
		
		/***�˴���ʽΪ����������µ�ѧ������cp����������һ��ѧ������(this)���бȽ�***/
		Student cp = (Student)obj;

		/*******�������*******/
		if(this.age>cp.age)
		{
			return 1; //���ظ�����ʾ��������������ʾ��������
		}
		if(this.age==cp.age)//����������ͬʱ��Ҫ�ж�����
		{
			this.name.compareTo(cp.name);//�����ǱȽ������ַ����ķ�����ͨ����ĸ��˳����
		}
        return -1;
	}
}

class MyStore
{
	public static void main(String[] args)
	{
		TreeSet TS = new TreeSet();
		TS.add(new Student("Tifa",17));
		TS.add(new Student("Jason",15));
		TS.add(new Student("Tom",17));
		TS.add(new Student("Bob",18));
		TS.add(new Student("Jake",20));
		
		Iterator it = TS.iterator();

		while(it.hasNext())
		{
			Student S = (Student)it.next();
			System.out.println(S.getName()+"..."+S.getAge());
		}
	}

	public static void sop(Object o)
	{
		System.out.println(o);
	}
}