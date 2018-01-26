/*多态的应用实例*/
/*
题目：
差班的学生，他们不学习、喜欢运动。
好班的学生，他们好好学习、喜欢运动。
*/
/*因此本题中，多态的形式：学生里有好学生和差学生两种形态。
*/
abstract class Student   //学生体系
{
	public abstract void Study();
	public void Sport()
	{
		System.out.println("喜欢运动");
	}
}

class BadStudent extends Student   //坏学生继承学生体系
{
	public void Study()
	{
		System.out.println("不学习");
	}
	public void Fight()
	{
		System.out.println("老打架");
	}
}

class GoodStudent extends Student
{
	public void Study()
	{
		System.out.println("好好学习");
	}
	public void Project()
	{
		System.out.println("爱做项目");
	}
}
class VariousDemo
{
	public static void main(String[] args)
	{
		/*例子一
		Student S1 = new BadStudent();
		S1.Study();
        BadStudent B1 = (BadStudent)S1;  //强制转换
		B1.Fight();
		*/

		/*例子二
		BadStudent B1 = new BadStudent();
		B1.Study();
		B1.Sport();

		GoodStudent G1 = new GoodStudent();
		G1.Study();
		G1.Sport();
		*/

        /*例子三*/
		DoWhat(new BadStudent());
		DoWhat(new GoodStudent());
	}
	/*例子三*/
	public static void DoWhat(Student S)
	{
		S.Study();
		S.Sport();
		if(S instanceof BadStudent)
		{
			BadStudent B1 = (BadStudent)S;
			B1.Fight();
		}
	    else if(S instanceof GoodStudent)
		{
			GoodStudent G1 = (GoodStudent)S;
			G1.Project();
		}
	}
}