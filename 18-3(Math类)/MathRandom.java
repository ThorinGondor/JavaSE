/***
    Math�ࣺ 
	Math.ceil(xxx); ���ڸ����ݵ���С����(double��)
	Math.floor(xxx); С�ڸ����ݵ��������
	Math.round(xxx); ��������(long��)
	Math.pow(x,y); x��y�η�(double��)
	Math.random(); ���ȡһ��0.0~1.0֮�������(double��)
***/
import java.util.*;
class MathRandom
{
	public static void main(String[] args)
	{
		double x=Math.ceil(13.45); //Math.ceil(xxx); ���ڸ����ݵ���С����(double��)
		double y=Math.floor(16.78); //Math.floor(xxx); С�ڸ����ݵ��������
		long l=Math.round(24.45);  //Math.round(xxx); ��������
		double z=Math.pow(3,2); //Math.pow(x,y); x��y�η�

		sop(x);
		sop(y);
		sop(l);
		sop(z);

        double j=0;
		for(int i =0;i<10;i++)
		{
			j= Math.random();  //������һ��0.0~1.0������ (double��)
			sop(j);
		}
	}

	public static void sop(Object o)
	{
		System.out.println(o);
	}
}