//***********************************************//
/*人开门:名词提炼法
人
{
 开门（门）
   {
	   门.开（）;
   }
}
门
{
	开（）{操作门轴等}
}

*/
//面向对象三个特征：封装，继承，多态。
//以后开发：其实就是找对象使用，没有对象，就创造对象。
//找对象，建立对象，使用对象。

/*类就是对现实生活中事物的描述。
  对象就是这类事物，实实在在存在的个体。
类和对象的关系：描述时，这些对象的共性（例如姓名年龄性别等）
//************************************************
*/

class Person
{
   private int age;   //封装age，使外部访问不会看到，将age私有化以后，类以外即使建立了对象也不能直接访问了，但是人应该有年龄，就需要在Person类中有对应的访问age的方式
   private int weight;
   /********/
   int flag1=0;        //一旦年龄非法，立刻赋值1，用于判断是否需要输出 “His age is”
   int flag2=0;
   
   void login(int num)
   {
	 System.out.println("P"+num+":");
   }
   
   public void setAge(int a)
    {
         if(a>12&&a<30)
		    {age=a;}
		 else
		    {System.out.println("illegal age");flag1=1;}
    }

   public int getAge()
	{
         return age;
	}
   public void setWei(int b)
	{   if(b>100&&b<180)
          {weight=b;}
        else
		  {System.out.println("illegal weight");flag2=1;}
	}
   void reportAll()
	{
		 if(flag1==0){System.out.println("His Age Is "+age);}
		 flag1=0;

         if(flag2==0){System.out.println("His Weight Is "+weight);}
		 flag2=0;
	}
   
   
}
   

class PersonDemo
{
	public static void main(String[] args)
	{   
	    Person P1 =new Person();   //建立第一个对象P1
	    // P1.age=31;   //由于这里的age被Person类里设置了Private故而只能失效了，如果把private去掉这行代码可用
		P1.login(1);
	    P1.setAge(21);
		P1.setWei(440);
	    P1.reportAll();

		Person P2 =new Person();   //建立第二个对象P2
	    // P2.age=31;   //由于这里的age被Person类里设置了Private故而只能失效了，如果把private去掉这行代码可用
		P2.login(2);
	    P2.setAge(25);
		P2.setWei(140);
	    P2.reportAll();

		Person P3 =new Person();   //建立第二个对象P2
	    // P3.age=31;   //由于这里的age被Person类里设置了Private故而只能失效了，如果把private去掉这行代码可用
		P3.login(3);
	    P3.setAge(250);
		P3.setWei(140);
	    P3.reportAll();
	}
}

class Second
{
	public static void main(String[] args)
	{
	   Person p1 = new Person();
	   System.out.println();
	   p1.setAge(25);
       p1.reportAll();
	 }
}