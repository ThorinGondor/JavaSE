 /**                     Collection;
	          List;                    Set;
 ArrayList  LinkedList  Vector;   HashSet TreeSet;
 
  Collection
      |--List:Ԫ��������ģ�Ԫ�ؿ����ظ�����Ϊ�ü�����ϵ���������ص㣺��ѯ�ٶȺܿ죬�޸ķ��㡣
	      |--ArrayList: �ײ�����ݽṹʹ�õ�������ṹ���ص㣺��ѯ�ܿ죬������ɾ������(ArrayList()Ĭ�ϳ�ʼ������10)
		  |--LinkedList: �ײ�ʹ�õ��������ݽṹ
		  |--Vector: �ײ����������ݣ��Ѿ���ArrayList���档
	  |--Set��Ԫ��������ģ�Ԫ�ز������ظ�������һ�ֲ������ظ���Collection��(��ˣ���ˣ�����������ɸ���������ظ���Ԫ�أ�)
	      |--HashSet���ײ����ݽṹ�ǹ�ϣ��
		  |--TreeSet��
  
  Set���ϵĹ��ܺ�Collection��һ�µ�
  
  ����ϣ�����д����Զ�������ˣ����������䣩�������ظ���

  ��Ҫ����hasCode(); equals();����������
  
  �ؼ���HashSet����α�֤Ԫ��Ψһ�Ե��أ�
      ��ͨ��Ԫ�ص�����������hashcode��equals��ɡ�
      ���Ԫ�ص�hashCodeֵ��ͬ���Ż��ж�equals�Ƿ�Ϊtrue��
      ���Ԫ�ص�hashCodeֵ��ͬ���������equals��
   
   ע�⣬�����ж�Ԫ���Ƿ���ڡ��Լ�ɾ���Ȳ�������������Ԫ�ص�hashCode��equals������
 **/
import java.util.*;
 class Person
 {
	 String name=null;
	 int age=0;
	 Person(String name,int age)
	 {
		 this.name=name;
		 this.age=age;
	 }
	 public int hashCode()   //hasCode()�����жϹ�ϣֵ�Ƿ���ͬ
	 {
		 System.out.println(this.name+"...hasCode");
		 return 69;
	 }
	 public boolean equals(Object obj1)   //��ϣֵ����ͬ�����ø�equals()�������ж�Ԫ���ڲ��������Ƿ�Ϊtrue
	 {
		 if(!(obj1 instanceof Person))     //��Ԫ���ڲ�������Ҳ��ͬ���򷵻�true�����ų����ظ�Ԫ�أ�������ͬ���򷵻�false��
			 return false;
		 Person p = (Person)obj1;
		 System.out.println(this.name+this.age+"...ifequal..."+p.name+p.age);
		 return this.name.equals(p.name)&& this.age==p.age;
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
 /**********************************************/
 class UseHash
 {
	 public static void main(String[] args)
	 {
		 HashSet HS = new HashSet();
		 HS.add(new Person("ZhangSan",25));
		 HS.add(new Person("LiSi",35));
		 HS.add(new Person("ZhangSan",25));
         HS.add(new Person("WangWu",23));

		 Iterator it = HS.iterator();
		 while(it.hasNext())
		 {
			 Person P = (Person)it.next();
			 sop(P.getName()+"; "+P.getAge());   //�����ڲ��洢������ģ���������Ҳ��ɢ�������
		 }
	 }

	 public static void sop(Object obj)
	 {
		 System.out.println(obj);
	 }
 }
