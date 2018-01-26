/*
   题目如下。
   背景：老师用电脑上课
   开始思考上课中出现的错误。
   例如错误是：电脑突然蓝屏；突然冒烟；
   对问题进行描述.
   蓝屏的问题发生后进行处理，与前面几个例程相同。
   本题难点在于：
   当冒烟发生后，还会再次抛出一个错误：讲课（程序）无法继续。
   这时候就出现了老师的问题：课时计划无法完成

*/
/* 创建异常*/
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
	public void Run()throws BlueScreen,SmokeAppear  //注；别忘了该函数本行代码还需要进一步添加throw关键字
	{
		if(state == 0)
		{
			throw new BlueScreen("蓝屏了！");
		}
        if(state == 1)
		{
			throw new SmokeAppear("冒烟了！");
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
			throw new Halt("讲课终止！");   //冒烟错误进行描述和处理，又一次抛出新问题：终止讲课换电脑
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
			T.TeacherName("许炜");
		    T.Teach();
		}
		catch (Halt Ht)
		{
			System.out.println("换电脑");
		}

	}
}