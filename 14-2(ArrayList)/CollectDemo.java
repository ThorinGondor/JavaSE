/**
	                     Collection;
	          List;                    Set;
 ArrayList  LinkedList  Vector;   HashSet TreeSet;
    
	Iterator��������
	�÷��� Iterator it = ĳ���϶���.iterator();
	ʲô�ǵ�������
	��ʵ������ȡ������ȡ�������е�Ԫ�صķ�ʽ���������£� it.next();
**/
import java.util.*;

class CollectDemo 
{
	public static void main(String[] args) 
	{
	/**����һ������������ʹ��Collection�Ľӿ�����,����ArrayList**/
		ArrayList AL = new ArrayList();

	/**1.���Ԫ�أ�**/
		AL.add("Java1");
		AL.add("Java2");
		AL.add("Java3");
		AL.add("Java4");
		AL.add("Java5");

        Iterator it = AL.iterator();   //���󼯺�AL��ȡ������������ȡ�������е�Ԫ��
		sop(it.next());   //xxx.next();��ȡ��һ��Ԫ�أ���Java1��
		sop(it.next());   //xxx.hasNext();��ȡ�ڶ���Ԫ�أ���Java2��
		sop(it.hasNext()); //���������һ��Ԫ�ؿ��Ե������򷵻�true

		while(it.hasNext())   //ֻҪ�����л����¸�Ԫ�أ��Ǿͼ���������ȡ��һ��Ԫ��
		{
			sop(it.next());
		}
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}

/**
     add(str);  ȷ����collection����ָ����Ԫ��
	 clear();   �������
	 remove(str);  ��Collection���Ƴ�ָ��Ԫ�صĵ���ʵ��
	 AL1.retainALL(AL2); AL1��ֻ�ᱣ����AL2����ͬ��Ԫ�أ���ȡ������
**/