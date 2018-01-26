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

     TreeSet����ĵڶ��ַ�ʽ����Ԫ�������߱��Ƚ���ʱ�����߲�����Ҫ���߱��ıȽ��ԣ���ʱ��Ҫ�ü�������߱��Ƚ��ԡ�
                              Ӧ�ڼ��ϳ�ʼ��ʱ�����˱ȽϷ�ʽ��
							  ����һ���Ƚ��������Ƚ���������Ϊ�������ݸ�TreeSet���ϵĹ��캯����
							  �������Ǵ���һ���µĶ���ʵ��Comparator�����Ҹö��������������´���һ��TreeSet��ʱ��͵ý��е��ã������д���
***/

/***
��ϰ�������ַ�������������TreeSet����ַ������������ַ����ĳ�������
***/
import java.util.*;

class TreeSetPra
{
	public static void main(String[] args)
    {
		TreeSet TS = new TreeSet(new CompareTool());  //����TreeSet��ʱ���ȥ���ô�����µıȽϹ���
		TS.add("abcde");
		TS.add("cdfg");
		TS.add("ouejwic");
		TS.add("opa");
		TS.add("jke");
		TS.add("dsqwefdrf");

		/***��ӡ�����Ľ��***/
		Iterator it = TS.iterator();
		while(it.hasNext())
		{
			sop(it.next());
		}
		/**********************/
	}

	public static void sop(Object o)
	{
		System.out.println(o);
	}
}

class CompareTool implements Comparator //�ȽϹ��ߣ������������ã���add�����ĸ������������������
{
	public int compare(Object obj1,Object obj2)
	{
		int result=0;
		String s1 = (String)obj1;//ǿ��ת����String����
		String s2 = (String)obj2;
 
        /***��ƾ���ıȽϷ���***/
		if(s1.length()>s2.length())
		{
			result = 1;
		}
		if(s1.length()<s2.length())
		{
			result = -1;
		}
		if(s1.length()==s2.length())
		{
			result = s1.compareTo(s2);
		}

		return result;
	}
}