/**
	                     Collection;
	          List;                    Set;
 ArrayList  LinkedList  Vector;   HashSet TreeSet;

 ��������ʾ�б������
 Iteratorֻ���޸ĺ�ɾ��Ԫ�أ��������Ԫ�ء�
 it.remove();

 ��ˣ��Ƴ�List�������еĵ�����ListIterator������Iterator���ӽӿڡ�
 �ڵ���ʱ��ֻ���ڵ���ʱ������ͨ�����϶���ķ������������е�Ԫ�ء�

 �����ʹ�õ�����ʱ��ֻ��ͨ�������������ɾ�����޸ģ����ǵ�����Iterator�������Ԫ�أ�ֻ����ListIterator��������
**/

import java.util.*;
class ListDemo
{
	public static void main(String[] args)
	{
		ArrayList AL = new ArrayList(); 
		AL.add("Java1");
		AL.add("Java2");
		AL.add("Java3");
		AL.add("Java4");
		AL.add("Java5");
		AL.add("Java6");
        sop(AL);
	/****��Iterator���������У�׼����ӻ�ɾ��Ԫ��****/
		Iterator it = AL.iterator();
		while(it.hasNext())
		{
			Object obj = it.next();  //obj����ָ���������Ӧ��Ԫ��
			if(obj.equals("Java4"))   //obj�����Java4��ͬ
			{
				it.remove();   //�õ�����it��ɾ��obj��ָ��Ԫ��
			}
			sop("obj="+obj);
		}
		sop(AL);
	/****��ListIterator���������У�׼����ӻ�ɾ��Ԫ��****/
	     ListIterator LI = AL.listIterator();
         while(LI.hasNext())
		 {
			 Object obj = LI.next();
			 if(obj.equals("Java3"))
			 {
				 LI.add("ADD1");  //ͨ��ListIterator�����������Ԫ��
			 }
			 sop("Obj="+obj);
		 }
		 sop(AL);

	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}