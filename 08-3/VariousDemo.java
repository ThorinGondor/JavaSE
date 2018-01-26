/*��̬��Ӧ��ʵ��*/
/*
��Ŀ��
����ѧ�������ǲ�ѧϰ��ϲ���˶���
�ð��ѧ�������Ǻú�ѧϰ��ϲ���˶���
*/
/*��˱����У���̬����ʽ��ѧ�����к�ѧ���Ͳ�ѧ��������̬��
*/
abstract class Student   //ѧ����ϵ
{
	public abstract void Study();
	public void Sport()
	{
		System.out.println("ϲ���˶�");
	}
}

class BadStudent extends Student   //��ѧ���̳�ѧ����ϵ
{
	public void Study()
	{
		System.out.println("��ѧϰ");
	}
	public void Fight()
	{
		System.out.println("�ϴ��");
	}
}

class GoodStudent extends Student
{
	public void Study()
	{
		System.out.println("�ú�ѧϰ");
	}
	public void Project()
	{
		System.out.println("������Ŀ");
	}
}
class VariousDemo
{
	public static void main(String[] args)
	{
		/*����һ
		Student S1 = new BadStudent();
		S1.Study();
        BadStudent B1 = (BadStudent)S1;  //ǿ��ת��
		B1.Fight();
		*/

		/*���Ӷ�
		BadStudent B1 = new BadStudent();
		B1.Study();
		B1.Sport();

		GoodStudent G1 = new GoodStudent();
		G1.Study();
		G1.Sport();
		*/

        /*������*/
		DoWhat(new BadStudent());
		DoWhat(new GoodStudent());
	}
	/*������*/
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