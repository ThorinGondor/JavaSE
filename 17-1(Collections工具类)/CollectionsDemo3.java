/****
集合框架的工具类.
    Collections用法:
	1.创建(new)一个新的集合对象，例如ArrayList AL = new ArrayList();
	2.创建(class)一个比较器Comparator的子类，CompareTool() implements Comparator，并自定义排序方法。
	3.完成添加一系列元素后，可以使用下列方式排序：
	  Collections.sort(AL);
	  Collections.max(AL);
	  
	  Collections.sort(AL,new CompareTool());
	  Collections.max(AL.new CompareTool());
      
	  Collections.binarySearch(AL,"Lopez");
****/
import java.util.*;

class CollectionsDemo3
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
		AL.add("Clarkson");
		AL.add("Zubac");
		AL.add("Lopez");
		AL.add("Pope");

		sop(AL);
		int index = Collections.binarySearch(AL,"Lopez");  //找到Lopez这个元素在list表中的位置
		sop("INDEX="+index);
	} 

	public static void sop(Object o)
	{
		System.out.println(o);
	}
}

class CompareTool implements Comparator<String>  //安装字符串长短进行排序
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
