
/*
��������ֺ͸���һ�����Ƶĺ���ʱ���������øú����õ�������ĺ�������֮Ϊ���ǣ������Same���������˸����Same����
*/
class Father
{
	public void Same()
	{
		System.out.println("Fa");
	}

	public void Speak()
	{ 
		System.out.println("Visual Basic");
	}
}

class Son extends Father    //���ӱؼ̳��Ը�
{
	public void Same()
	{
		System.out.println("So");
	}

	public void Speak()
	{
		System.out.println("Java EE");
	}
}

class Cover
{
	public static void main(String[] args)
	{
		Son S1 = new Son();
		S1.Same();    //��Ȼ�����Ӷ���same�����������õ����������same�������ʶ��������void Same��������֮Ϊ����

		S1.Speak();
	}
}

/*********************************************************************************************************************/

class Nokia
{
	public void show()
	{
		System.out.println("Sebian");
	}
}

class Android extends Nokia
{
	public void show()
	{
		super.show();               //��������ʹ��super.�����������Ե��ø�����ĺ�����
		System.out.println("Android");
	}
}

class Iphone extends Nokia
{
	public void show()
	{
    Android A1 = new Android();
	A1.show();                               //Ϊʲô������super���У���Ϊsuperֱ��ָ����߸�����Nokia�ˣ�ֱ��������Android������֮��ֻ�ܽ���һ��Android����������Android�ĺ���show����
	System.out.println("IOS");
	}
}

class Cover2
{
	public static void main(String[] args)
	{
		Iphone I1 = new Iphone();
		I1.show();
	}
}