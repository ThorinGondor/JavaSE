import java.util.Scanner;
class Tax
{
	int line = 3500;
	int tax = 0;
	int taxsalary=0;
	public int Count(int salary)
	{
		taxsalary=salary;
		if(salary<3500)
		{
			tax = 0;
			System.out.println("不需要交个人所得税！");
		}
		else
		{
		  if(salary>3500&&salary<5000)
		  {
			tax = (salary-line)*3;
		  }
		}
		
		if(salary>5000&&salary<8000)
		{
			tax = (5000-line)*3+(salary-5000)*10;
		}
		else
		{
			if(salary>8000&&salary<12500)
			{
				tax = (5000-line)*3+(8000-5000)*10+(salary-8000)*20;
			}
			if(salary>12500&&salary<38500)
			{
				tax = (5000-line)*3+(8000-5000)*10+(12500-8000)*20+(salary-12500)*25;
			}
		}

		if(salary>38500&&salary<58500)
		{
			tax = (5000-line)*3+(8000-5000)*10+(12500-8000)*20+(38500-12500)*25+(salary-38500)*30;
		}
		else
		{
		    if(salary>58500&&salary<83500)
		    {
			    tax = (5000-line)*3+(8000-5000)*10+(12500-8000)*20+(38500-12500)*25+(58500-38500)*30+(salary-58500)*35;
		    }
			if(salary>83500)
			{
				tax = (5000-line)*3+(8000-5000)*10+(12500-8000)*20+(38500-12500)*25+(58500-38500)*30+(83500-58500)*35+(salary-83500)*45;
			}
		}
		double tax2=(double)tax;
		return tax;
		
	}
	public int RealSal(int tax)
	{
		int realsal=taxsalary*100-tax;
	    return realsal;}
}
class PersonalTax
{
	public static void main(String[] args)
	{
		/***************/
		int num=0;
		double mun=0.00;
		/****************/
		Scanner in = new Scanner(System.in);
		try
		{
			System.out.println("请输入您的工资！");
			mun=in.nextFloat();
            num=(int)mun;  //强制转换
			System.out.println("您输入的工资是："+num);
		}
		catch (Exception e)
		{
		}
		Tax T = new Tax();
		int Tax = T.Count(num);
		int realsal = T.RealSal(Tax);
		System.out.println("您应交税款为："+Tax+" 实际工资是："+realsal);
	}
}