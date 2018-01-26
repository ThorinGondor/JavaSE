/*将学生Student和工人Worker的共性描述（姓名name和年龄age）提取出来，单独进行描述。 class Person
只要让学生和工人与单独描述的这个类有关系，就可以了(用extends，即继承)

继承：
1.提高了代码复用性
2.类（class Student）与类（class Person）之间能产生关系，有了次关系才有了多态的特性

注意：千万不要为了获取其他类的功能，简化代码而用继承
必须是类与类之间有所属关系才可以继承，是所属关系（Student是Person的一员；A is B.）
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
class Person    //父级
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