 /**                     Collection;
	          List;                    Set;
 ArrayList  LinkedList  Vector;   HashSet TreeSet;
 
  Collection
      |--List:Ԫ��������ģ�Ԫ�ؿ����ظ�����Ϊ�ü�����ϵ���������ص㣺��ѯ�ٶȺܿ죬�޸ķ��㡣
	      |--ArrayList: �ײ�����ݽṹʹ�õ�������ṹ���ص㣺��ѯ�ܿ죬������ɾ������(ArrayList()Ĭ�ϳ�ʼ������10)
		  |--LinkedList: �ײ�ʹ�õ��������ݽṹ
		  |--Vector: �ײ����������ݣ��Ѿ���ArrayList���档
	  |--Set��Ԫ��������ģ�Ԫ�ز������ظ�������һ�ֲ������ظ���Collection��(��ˣ���ˣ�����������ɸ���������ظ���Ԫ�أ�)
	      |--HashSet���ײ����ݽṹ�ǹ�ϣ����
		  |--TreeSet��
  
  Set���ϵĹ��ܺ�Collection��һ�µ�
  ��ϣ�����ܣ�
 **/
import java.util.*;
 class HashSetDemo
 {
	 public static void main(String[] args)
	 {
		 HashSet HS = new HashSet();
		 HS.add("Java1");
		 HS.add("Java2");
		 HS.add("Java3");
		 HS.add("Java4");
		 HS.add("Java5");
		 HS.add("Java6");
		 HS.add("Java4");
		 HS.add("Java4");
		 HS.add("Java2");  //�����ظ���Ԫ�ػ�����ʧ�ܣ�

		 Iterator it = HS.iterator();
		 while(it.hasNext())
		 {
			 sop(it.next());   //�����ڲ��洢������ģ���������Ҳ��ɢ�������
		 }
	 }

	 public static void sop(Object obj)
	 {
		 System.out.println(obj);
	 }
 }