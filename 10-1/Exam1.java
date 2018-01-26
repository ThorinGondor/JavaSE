/*异常的练习：
  题目：有一个三角形和长方形，它们都可以获取面积，对于面积area，如果出现非法的数值,则视为获取面积出现异常
  现要对该程序进行设计
*/
class FuShuException extends Exception
{
	FuShuException(String msg)
	{super(msg);}
}
/*****************************************/
//接口shape:
interface shape
{
    int GetArea(int a,int b)throws FuShuException;  //若有覆盖，子类的覆盖抛出了一种异常，父类也必须有抛出该异常！
}
//建立两个对象：长方形、三角形
class triangle implements shape
{
	public int GetArea(int a,int b)throws FuShuException
	{
		if(a<=0||b<=0)
		{
			throw new FuShuException("底和高不能为负数！");
		}
		else
		{
			return a*b/2;
		}
	}
}
class rectangle implements shape
{
	public int GetArea(int a,int b)throws ArithmeticException
	{
		if(a<=0||b<=0)
		{
			throw new ArithmeticException("底和高不能为负数！");
		}
		return a*b;
	}
}
/*****************************************/
//主程序如下：
class Exam1
{
	public static void main(String[] args)
	{
		triangle t = new triangle();
		rectangle r = new rectangle();
        try
        {
			int i = t.GetArea(3,4);
		    int j = r.GetArea(7,-8);
			System.out.println("长方形面积："+j+" 三角形面积"+i);
        }
        catch (FuShuException FSE)
        {
			FSE.printStackTrace();
        }
		finally
		{
			System.out.println("运算结束");
		}
	}
}