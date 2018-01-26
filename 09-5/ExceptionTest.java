/*
   ��Ŀ���¡�
   ��������ʦ�õ����Ͽ�
   ��ʼ˼���Ͽ��г��ֵĴ���
   ��������ǣ�����ͻȻ������ͻȻð�̣�
   �������������.
   ���������ⷢ������д�����ǰ�漸��������ͬ��
   �����ѵ����ڣ�
   ��ð�̷����󣬻����ٴ��׳�һ�����󣺽��Σ������޷�������
   ��ʱ��ͳ�������ʦ�����⣺��ʱ�ƻ��޷����

*/
/* �����쳣*/
class BlueScreen extends Exception
{
	BlueScreen(String msg)
	{
		super(msg);
	}
}
class SmokeAppear extends Exception
{
	SmokeAppear(String msg)
	{
		super(msg);
	}
}
class Halt extends Exception
{
	Halt(String msg)
	{
		super(msg);
	}
}
/**********************************/
class Computer
{
	public int state = 1;
	public void Run()throws BlueScreen,SmokeAppear  //ע�������˸ú������д��뻹��Ҫ��һ�����throw�ؼ���
	{
		if(state == 0)
		{
			throw new BlueScreen("�����ˣ�");
		}
        if(state == 1)
		{
			throw new SmokeAppear("ð���ˣ�");
		}
		else
		{
			System.out.println("The Computer now is running!");
		}
	}
	public void Reset()
	{
		state = 2;
		System.out.println("The Computer resets!");
	}
}
class Teacher
{
	public void TeacherName(String name)
	{
		System.out.println(name);
    }
	Computer PC = new Computer();
	
	public void Teach()throws Halt
	{
		try
		{
			PC.Run();
		}
		catch (BlueScreen BS)
		{
			BS.printStackTrace();
			PC.Reset();
		}
		catch (SmokeAppear SA)
		{
			SA.printStackTrace();
			throw new Halt("������ֹ��");   //ð�̴�����������ʹ�����һ���׳������⣺��ֹ���λ�����
		}
		System.out.println("Teacher is now teaching!");
	}

}

class ExceptionTest
{
	public static void main(String[] args)
	{
		Teacher T = new Teacher();
		
		try
		{
			T.TeacherName("���");
		    T.Teach();
		}
		catch (Halt Ht)
		{
			System.out.println("������");
		}

	}
}