/***
Calendar类：
Calendar cl = Calendar.getInstance();  //获取一个日历
//获取年、月、日的方法
cl.get(Calendar.YEAR);
cl.get(Calendar.MONTH);
cl.get(Calendar.DAY_OF_MONTH);
***/
/***
     注意区别：Calendar类抽象，不能直接new一个对象，而Date类可以直接new一个对象.
***/
/***
     本题需求：分别通过Calendar类和Date类来获取年份
***/
import java.util.*;
import java.text.*;
class CalendarDemo 
{
	public static void main(String[] args) 
	{
		/**使用Calendar类，方法如下：**/
        Calendar cl = Calendar.getInstance();  //Calendar.getInstance();根据所在时区和环境获取一个日历
        sop(cl.get(Calendar.YEAR)+"年"+cl.get(Calendar.MONTH)+"月"+cl.get(Calendar.DAY_OF_MONTH)+"日");
 
		/**如果不用Calendar类，方法如下**/
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年"/*MM月dd日E*/);
		sop(date);
		String YEAR = sdf.format(date);
		sop(YEAR);  //只输出年份
	}

	public static void sop(Object o)
	{
		System.out.println(o);
	}
}
