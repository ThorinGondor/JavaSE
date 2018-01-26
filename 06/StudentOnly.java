class Student
{
/*1*/	private Student()
	    {}
/*2*/   private static Student S = new Student();
/*3*/   public static Student getInstance()
	    {
	        return S;
        }
		//以上为保证对象私有化的必写三部曲！！！
/**************************************************************/
        //下面就是一些可以自由写的方法了
	private int age;
	public void setAge(int age)
	{
		this.age = age;
	}
	public void getAge()
	{
		System.out.println("age is "+this.age);
	}

   
}

class StudentOnly
{
	public static void main(String[] args)
	{
		Student S1 = Student.getInstance();
		Student S2 = Student.getInstance();
		S1.setAge(15);
		S2.setAge(20);
		S1.getAge();
		S2.getAge();  //这时候会全部输出20！因为对象只有一个，在set了S2的age为20以后，S1的age也不得不变成20！
	}
}