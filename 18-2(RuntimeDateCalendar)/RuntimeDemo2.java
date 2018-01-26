/***
    Runtime对象：
	概述：该类的作用是使得本程序能和win环境相连，从而对win环境进行操作，例如启动一些程序：
	exec("软盘:\\路径\\XXX.exe");

	该Runtime类中并没有提供构造函数，说明不可以new一个对象，故而该类中的方法都是静态的。
	不过该类中还有非静态方法，说明该类肯定还有一个方法可以获取该类对象，而且该方法是静态的，并且返回值类型是本类类型(Runtime类型)。
	该方法就是：  static Runtime getRuntime();
	综上所述，其实就是它为静态的，不能直接new一个对象，必须通过指定的函数：Runtime.getRuntime();来建立对象
***/
import java.util.*;
import java.lang.System.*;
class  RuntimeDemo2
{
	public static void main(String[] args) 
	{
		Runtime Rt = Runtime.getRuntime();  //只能利用getRuntime()函数来建立一个Runtime对象
		try
		{
			Process p0 = Rt.exec("F:\\winmine.exe");  //右式令Runtime启动一个扫雷进程，左式创建一个进程对象p0来代表它
			Thread.sleep(1000);
			p0.destroy();   //p0.杀掉子扫雷进程
            
			/**同上，也可以打开一个记事本程序**/
			Process p1 = Rt.exec("notepad.exe");  //左式启动一个记事本进程，右式创建一个进程p1对象来代表它
			Thread.sleep(1000); 
			p1.destroy();   //p1.杀掉记事本进程
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
	}
}
