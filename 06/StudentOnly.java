class Student
{
/*1*/	private Student()
	    {}
/*2*/   private static Student S = new Student();
/*3*/   public static Student getInstance()
	    {
	        return S;
        }
		//����Ϊ��֤����˽�л��ı�д������������
/**************************************************************/
        //�������һЩ��������д�ķ�����
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
		S2.getAge();  //��ʱ���ȫ�����20����Ϊ����ֻ��һ������set��S2��ageΪ20�Ժ�S1��ageҲ���ò����20��
	}
}