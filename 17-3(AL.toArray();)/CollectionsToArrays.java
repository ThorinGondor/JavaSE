/***
集合变数组：
Collection接口中的toArray();方法
***/
import java.util.*;
class CollectionsToArrays
{
	public static void main(String[] args)
	{
		List<String> AL = new ArrayList<String>();  //创建一个新的集合
	    AL.add("A");
	    AL.add("B");
	    AL.add("C");
    
        String[] arr = AL.toArray(new String[AL.size()]);  //该集合转化为数组
		/**
		1.
		当指定类型的数组的长度小于集合的size()，则该方法内部会创建一个新的数组，长度为集合的size
		当指定类型的数组的长度大于集合的size()，就不会创建新的数组，而是使用传递进来的数组。
		所以创建一个刚刚好的数组最优.
		2.
		为什么要把集合转化为数组？
		为了限定对元素的操作，防止对元素进行增删
		**/
	    sop(Arrays.toString(arr));
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}