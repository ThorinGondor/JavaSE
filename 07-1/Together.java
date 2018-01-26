
//子父类出现以后，类成员的特点：
/*
 类中成员：
  1.变量
  2.函数
  3.构造函数
*/
class Father
{
	int num = 4; 
	String name = "Father";
}

class Son extends Father    //有子必继承自父
{
	int num = 5;
	String name = "Son";
	public void Son()
	{
		System.out.println("2:Num is "+this.num+" Name is "+this.name);   //this代表本类对象的信息的引用，super代表对它的父类的信息的引用
	}
	public void Father()
	{
		System.out.println("Father Name is "+super.name+" Father Num is "+super.num);   //在子类里使用super可以调出S1的继承的父类的信息
	}
}

class Together
{
	public static void main(String[] args)
	{
         Son S1 = new Son();
		 System.out.println("1:Num is "+S1.num+" Name is "+S1.name);   //输出son和5，说明调出来的是子（son）的信息，即继承的部分，但是父类信息还在！
		 S1.Son();                                                    //或者把这段代码放进void Son()也行，一个效果
         S1.Father();   //输出S1的父类的信息
	}
}