import java.util.*;
public class compareTool implements Comparator<Object>
{
	public int compare(Object obj1,Object obj2)
	{
		Student s1 = (Student)obj1;
		Student s2 = (Student)obj2;
		int result=0;
		if(s1.getSum()>=s2.getSum())
		{
			result=-1;
		}
		if(s1.getSum()<s2.getSum())
		{
			result=1;
		}
		return result;
	}
}
