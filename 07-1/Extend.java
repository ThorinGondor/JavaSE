/*��ѧ��Student�͹���Worker�Ĺ�������������name������age����ȡ�������������������� class Person
ֻҪ��ѧ���͹����뵥��������������й�ϵ���Ϳ�����(��extends�����̳�)

�̳У�
1.����˴��븴����
2.�ࣨclass Student�����ࣨclass Person��֮���ܲ�����ϵ�����˴ι�ϵ�����˶�̬������

ע�⣺ǧ��ҪΪ�˻�ȡ������Ĺ��ܣ��򻯴�����ü̳�
������������֮����������ϵ�ſ��Լ̳У���������ϵ��Student��Person��һԱ��A is B.��
*/
class Student extends Person
{
	//private int age;
	//private String name;

	public void Study()
	{
		
		System.out.println("Study "+name+" Age "+age);
	}
}
/*******************************************************/
class Worker extends Person
{
	//private int age;
	//private String name;

	public void Work()
	{
		
		System.out.println("Work "+name+" Age "+age);
	}
}
/*******************************************************/
class Person    //����
{
    int age;
	String name;
}
/********************************************************/
class Extend
{
	public static void main(String[] args)
	{
		Student S1 = new Student();
		S1.age=15;
		S1.name="Zhangsan";
		S1.Study();
		Worker W1 = new Worker();
		W1.age=20;
		W1.name="Lisi";
		W1.Work();
	}
}