/***
   日期Date类:该类非静态函数，可以直接创建(new一个)新对象。
   (之前的Properties类和Runtime类是静态函数，必须根据指定函数来创建新对象)。
   
   直接打印日期Date类的对象date格式复杂不易读。
   因此可以使用SimpleDateFormat类，new一个该类的对象sdf，再使用该对象sdf的format()功能：sdf.format(date);可以对date的复杂格式进行简单模式化。
***/

import java.util.*;
import java.text.*;  //使用DateFormat类必须导入该类
class DateDemo
{
	public static void main(String[] args)
	{
		Date date = new Date();
        sop(date);  //输出：星期 月份 日期 时分秒 年份
		

		//将模式封装到SimpleDateFormat的对象当中.通俗说法就是建立一个时间模式的对象，使用该模式对象的功能可以将上述复杂的时间格式格式化
		DateFormat SDF = new SimpleDateFormat("yyyy年MM月dd日E");
		//调用format方法让模式对指定Date对象进行格式化:
		String time = SDF.format(date);
		sop(time); //输出：2017年08月15日星期二
	}

	public static void sop(Object o)
	{
		System.out.println(o);
	}
}