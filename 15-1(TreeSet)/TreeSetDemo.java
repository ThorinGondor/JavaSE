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
		  |--TreeSet�������Զ�Set�����е�Ԫ�ؽ��������Ȱ�����ĸ��Сд�����ٰ�����ĸ���Ⱥ�˳������
		              
 **/
import java.util.*;

class TreeSetDemo 
{
	public static void main(String[] args) 
	{
		TreeSet TS = new TreeSet();
        TS.add("Thompson");
		TS.add("Curry");
		TS.add("Durant");
		TS.add("Iguodala");
		TS.add("Green");

		Iterator it = TS.iterator();
		while(it.hasNext())
		{
			sop(it.next());
		}
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}