class Student
{
	/*1*/private Student()
	{}
	/*2*/private static Student S = new Student();
	/*3*/public static Student getinstance()
	{
		return S;
	}                                                  //��֤����˽�л�������
	/*****************************/
	private int age;
	private String name;
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public void getInformation()
	{
		System.out.println("Name is "+this.name+";Age is "+this.age+".");
	}
}

class StudentOnly
{
	public static void main(String[] args)
	{
		Student S1 = Student.getinstance();
		Student S2 = Student.getinstance();
		S1.setName("Zhangsan");
		S1.setAge(15);
		S1.getInformation();
		S2.setName("Lisi");
		S2.setAge(35);
		S2.getInformation();   
		S1.getInformation();    //������Է��֣���S2��������������ȥ�Ժ�����ֻ����һ����������S1����ϢҲ���ȸĳ���S2����Ϣ
	}
}