import java.util.*;
/**
    LinkedList���з�����
	1.
	addFirst();
	addLast();

    2.
	getFirst();
	getLast();
	/**��ȡԪ�أ����ǲ�ɾԪ��

	3.
	removeFirst();
    removeLast();
	/**��ȡԪ�أ����ǻ�ɾ��Ԫ��
	/**���������û��Ԫ�أ�������쳣��NoSuchElementException
	��˳������������
	1.
	offerFirst();
	offerLast();
    /**����Ԫ��
    2.
	peekFirst();
	peekLast();
    /**��ȡԪ�أ�Ԫ�ز��ᱻɾ������������û��Ԫ�أ��᷵��null
	3.
	pollFirst();
	pollLast();
    /**��ȡԪ�أ�����Ԫ�ػᱻɾ������������û��Ԫ�أ��᷵��null
**/
class LLPra
{
	public static void main(String[] args)
	{
		LinkedList LL = new LinkedList();
		LL.offerFirst("Java0");
		LL.addFirst("Java1");
		LL.addFirst("Java2");
		LL.addLast("Java3");
		LL.addLast("Java4");
		LL.addLast("Java5");
		sop(LL);
		ListIterator LI = LL.listIterator();
		Object obj = new Object();
		/***���������е�ÿһ��Ԫ�ز���ȡ��Ԫ��***/
		while(LI.hasNext())
		{
			obj=LI.next();
			sop("Next: "+obj);
		}
		/***���ӻ�ɾ��һ��Ԫ��***/
		while(LI.hasPrevious())
		{
			obj=LI.previous();
			if(obj.equals("Java3"))
			{
				LI.add("ADD1");
			}
			sop("Previous: "+obj);
		}
		sop(LL);

		sop(LL.peekFirst());  //��ͬ��getFirst()��������û��Ԫ��ʱ�����Է���null
		sop(LL.getLast());
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
	
}