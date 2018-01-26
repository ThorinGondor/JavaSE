/***
    Math类： 
	Math.ceil(xxx); 大于该数据的最小整数(double类)
	Math.floor(xxx); 小于该数据的最大整数
	Math.round(xxx); 四舍五入(long类)
	Math.pow(x,y); x的y次方(double类)
	Math.random(); 随机取一个0.0~1.0之间的数据(double类)
***/
import java.util.*;
class MathRandom
{
	public static void main(String[] args)
	{
		double x=Math.ceil(13.45); //Math.ceil(xxx); 大于该数据的最小整数(double类)
		double y=Math.floor(16.78); //Math.floor(xxx); 小于该数据的最大整数
		long l=Math.round(24.45);  //Math.round(xxx); 四舍五入
		double z=Math.pow(3,2); //Math.pow(x,y); x的y次方

		sop(x);
		sop(y);
		sop(l);
		sop(z);

        double j=0;
		for(int i =0;i<10;i++)
		{
			j= Math.random();  //随机输出一个0.0~1.0的数据 (double类)
			sop(j);
		}
	}

	public static void sop(Object o)
	{
		System.out.println(o);
	}
}