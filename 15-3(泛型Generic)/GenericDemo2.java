/**
     ���ͣ����ڽ����ȫ���⣬�������������˲�ͬ���͵����ݣ�(����String���int���)��
	       
		   �ô���1.������ʱ�ڳ��ֵ�����ת�Ƶ��˱�������У�������ʱ������١�
		         2.������ǿ��ת�����鷳��
		   
		   ���͵ĸ�ʽ��ͨ��<XXX>�����塢����Ҫ�����������������͡�

		   ͨ���ڼ��Ͽ��Collection�кܳ�����ֻҪ���������ţ���Ҫ���巺�͡�
		   ��ʹ�ü���ʱ������Ҫ��������Ҫ�洢������������Ϊ�������ݵ�<>���ɡ�
**/
import java.util.*;

class GenericDemo2
{
	public static void main(String[] args) 
	{
		TreeSet<String> TS = new TreeSet<String>(new CompareTool());
		TS.add("China");
		TS.add("America");
		TS.add("France");
		TS.add("Russia");
		TS.add("England");

		Iterator<String> it = TS.iterator();
		while(it.hasNext())
		{
			String str = it.next();
			System.out.println(str);
		}
	}
}

class CompareTool implements Comparator<String>  //�����������ֻ��ΪString����
{
	public int compare(String o1,String o2)
	{
		int result=0;
		String s1=o1;    //��Ϊ�����Ѿ�����String�࣬����Ҳ�Ͳ�����Ҫǿ��ת��
		String s2=o2;   
		
		/****����ıȽϷ���****/
		if(o1.length()<o2.length())
		{
			result=-1;
		}
		if(o1.length()>o2.length())
		{
			result=1;
		}
		if(o1.length()==o2.length())
	    {
			result=o1.compareTo(o2);
		}
		return result;
	}
}
