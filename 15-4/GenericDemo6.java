/**
     ���ͣ����ڽ����ȫ���⣬�������������˲�ͬ���͵����ݣ�(����String���int���)��
	       
		   �ô���1.������ʱ�ڳ��ֵ�����ת�Ƶ��˱�������У�������ʱ������١�
		         2.������ǿ��ת�����鷳��
		   
		   ���͵ĸ�ʽ��ͨ��<XXX>�����塢����Ҫ�����������������͡�

		   ͨ���ڼ��Ͽ��Collection�кܳ�����ֻҪ���������ţ���Ҫ���巺�͡�
		   ��ʹ�ü���ʱ������Ҫ��������Ҫ�洢������������Ϊ�������ݵ�<>���ɡ�
**/
/***
     ʲôʱ���÷����ࣿ������Ҫ�����������������Ͳ�ȷ����ʱ�����ڶ���Object�������չ�����ڶ��巺��������չ<XXX>
	 
	 ���ַ��������÷��Ͷ��� �ࡣ
***/
/***
      ������������ķ��ͣ�����������Ч�����������ʹ�ã���ô�����ཨ���Ķ�����ȷҪ���������ͺ���ô���ڴ˶���㲻�ܲ�������������͡�

	  Ϊ���ò�ͬ�������Բ�����ͬ���ͣ������ͻ���ȷ����
	  ��ô�ɽ����Ͷ����ڷ����ϡ�
	  �����Խ����Ͷ����ڽӿ��ϡ���Demo4��5��4���Բ����ܶ಻ͬ���ݣ�5�޶�ĳ����������
***/
/***
      �������󣻴�������ArrayList��һ����String���������޶���һ����Integer���������޶�������������Ԫ�أ�ͨ������һ����������ӡ��
	  �ø��ú���Ӧʹ�÷����޶���
***/

import java.util.*;

class GenericDemo6 
{
	public static void main(String[] args) 
	{
		ArrayList<String> AL0 = new ArrayList<String>();
		ArrayList<Integer> AL1 = new ArrayList<Integer>();
		
		AL0.add("abc");
		AL0.add("def");
		AL0.add("ghi");
		AL1.add(9);
		AL1.add(78);
		AL1.add(36);

		Print(AL0);
		Print(AL1);
	}
/*********��һ��
	public static void Print(ArrayList<?> AL)
	{
		Iterator<?> it = AL.iterator();
		while(it.hasNext())
	    {
			System.out.println(it.next());
		}
	}

/***********������*/
    public static <E> void Print(ArrayList<E> AL)
    {
		Iterator<E> it = AL.iterator();
		while(it.hasNext())
		{
			E e = it.next();
			System.out.println(e);//��һ��Ҳ����ֱ�Ӱ��շ�һ�����it.next()
		}
	}
}