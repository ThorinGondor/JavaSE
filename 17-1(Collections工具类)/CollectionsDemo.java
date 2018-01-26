/****
Collections�������Ͽ�ܵĹ�����.
    Collections�÷�:
	1.����(new)һ���µļ��϶�������ArrayList AL = new ArrayList();
	2.����(class)һ���Ƚ���Comparator�����࣬CompareTool() implements Comparator�����Զ������򷽷���
	3.������һϵ��Ԫ�غ󣬿���ʹ�����з�ʽ����
	  Collections.sort(AL);
	  Collections.max(AL);
	  Collections.sort(AL,new CompareTool());
	  Collections.max(AL.new CompareTool());
****/
import java.util.*;

class CollectionsDemo
{
	public static void main(String[] args) 
	{
		sortDemo();
	}

	public static void sortDemo()
	{
		ArrayList<String> AL = new ArrayList<String>();
		AL.add("Ball");
		AL.add("Nance");
		AL.add("Lopez");
		AL.add("Clarkson");
		AL.add("Zubac");
		AL.add("Pope");

		sop(AL);
		Collections.sort(AL,new CompareTool());  //Collections��sort���߿���ֱ�ӶԼ���AL����Ĭ������
		sop(AL);
	} 

	public static void sop(Object o)
	{
		System.out.println(o);
	}
}

class CompareTool implements Comparator<String>
{
	public int compare(String S1,String S2)
	{
		int result=0;
		if(S1.length()>S2.length())
		{
			result = 1;
		}
		if(S1.length()<S2.length())
		{
			result = -1;
		}
		if(S1.length()==S2.length())
		{
			result = S1.compareTo(S2);
		}
		return result;
	}
}
