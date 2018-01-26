/**                     Collection;
	          List;                    Set;
 ArrayList  LinkedList  Vector;   HashSet TreeSet;
 
  Collection
      |--List:Ԫ��������ģ�Ԫ�ؿ����ظ�����Ϊ�ü�����ϵ���������ص㣺��ѯ�ٶȺܿ죬�޸ķ��㡣
	      |--ArrayList: �ײ�����ݽṹʹ�õ�������ṹ���ص㣺��ѯ�ܿ죬������ɾ������(ArrayList()Ĭ�ϳ�ʼ������10)
		  |--LinkedList: �ײ�ʹ�õ��������ݽṹ
		  |--Vector: �ײ����������ݣ��Ѿ���ArrayList���档
	  |--Set��Ԫ��������ģ�Ԫ�ز������ظ�������һ�ֲ������ظ���Collection��(��ˣ���ˣ�����������ɸ���������ظ���Ԫ�أ�)
	      |--HashSet���ײ����ݽṹ�ǹ�ϣ�����߳��ǲ�ͬ���ġ���֤Ԫ��Ψһ�Ե�ԭ�����ж�Ԫ�ص�hashCode()��Ԫ�ص�equals()�����Ƿ�Ϊtrue��
		  |--TreeSet�������Զ�Set�����е�Ԫ�ؽ�������Ĭ�����Ȱ�����ĸ��Сд�����ٰ�����ĸ���Ⱥ�˳������
		              �ײ����ݽṹ�Ƕ���������compareTo��������0����֤����Ψһ�ԡ�
		  ���!��ˣ�TreeSet����������
		              
 **/
/**
     ������TreeSet�����д洢ѧ�����󣬰���ѧ���������������
	 ��ʱ��TreeSet������дComparable�ӿڣ��˽ӿ�ǿ�ж�ʵ������ÿ����Ķ������ǿ������
	 compareTo��������������Ȼ�ȽϷ�����
**/
/***
     TreeSet����ĵ�һ�ַ�ʽ��ǿ����Ԫ�ؾ��пɱȽ��ԡ�������Ҫ��class����ʵ��Comparable�ӿڣ�ͬʱ�ö����ڲ�Ӧ��дcompareTo()��������15-1��MyStore

     TreeSet����ĵڶ��ַ�ʽ����Ԫ���������߱��Ƚ���ʱ�����߲�����Ҫ���߱��ıȽ��ԣ���ʱ��Ҫ�ü��������߱��Ƚ��ԡ�
                              Ӧ�ڼ��ϳ�ʼ��ʱ�����˱ȽϷ�ʽ��
							  ����һ���Ƚ��������Ƚ���������Ϊ�������ݸ�TreeSet���ϵĹ��캯����
							  �������Ǵ���һ���µĶ���ʵ��Comparator�����Ҹö��������������´���һ��TreeSet��ʱ��͵ý��е��ã������д���
***/
import java.util.*;

class Student   //�ýӿ�ǿ�������ѧ������߱��Ƚ��ԣ�
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
}

class CompareTool implements Comparator  //�����ȽϹ��ߣ��������ڴ����µ�TreeSetʱ�ͻ���ô˴�������
{
	public int compare(Object obj1,Object obj2)  
	{
		Student s1 = (Student)obj1;
		Student s2 = (Student)obj2;
		int result = s1.getName().compareTo(s2.getName());
		if(result==0)
		{
			if(s1.getAge()>s2.getAge())
			{
				result = 1;
			}
			if(s1.getAge()<s2.getAge())
			{
				result = -1;
			}
		}
		return result;
	}
}

class ComparatorDemo
{
	public static void main(String[] args)
	{
		TreeSet TS = new TreeSet(new CompareTool()); //�ڴ���TreeSetʱ��ȥ�������򹤾ߣ�ֻ����TreeSet�������ļ���������ArrayListֻ���ں�������дһ��Collections.sort(AL,new CompareTool());
		TS.add(new Student("Tifa72",17));
		TS.add(new Student("Tifa50",15));
		TS.add(new Student("Tifa20",17));
		TS.add(new Student("Tifa01",18));
		TS.add(new Student("Tifa96",20));
		TS.add(new Student("Tifa16",15));
		TS.add(new Student("Tifa01",35));
		TS.add(new Student("Tifa72",44));
		TS.add(new Student("Tifa16",59));
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