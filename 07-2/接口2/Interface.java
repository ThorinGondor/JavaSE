/*接口：初期理解，可以认为是一个特殊的抽象类，当抽象类中的方法都是抽象的，那么该类可以通过接口的形式来表示。
Interface用于定义接口
class用于定义类

接口中的成员都有固定修饰符
常量：public static final
方法：public abstract
接口里的成员都是public的

切记：接口是不可以创建对象的，因为有抽象方法
需要被子类实现，子类对接口中的抽象方法全部覆盖后，子类才可以实例化
否则子类是抽象类

支持多个接口连接到一个执行程序
也可以接口与接口之间也有关系
*/
/******************************************************************/

interface USB      //创建“USB”接口
{
	public static final int num=17;  
	public abstract void Work();
}

interface USART   //创建“串口”接口
{
	public static final int num=19;
	public abstract void Run();
}
interface IIC extends USART      //创建“IIC”接口,IIC继承了USART
{
	public static final String name="IIC";
	public abstract void Do();
}
interface Telemtry extends IIC
{
	public static final String version="Telemtry";
	public abstract void act();
}
/****************************************************************/
class App1 implements USB,USART   //类与类之间是继承关系extends，那么在接口这里，变成了执行、实现关系implements。该class建立了一个App连接到USB接口
{
	public void Work()
	{
		System.out.println("The App1 selected, the Entrance is USB");
	}
	public void Run()
	{
		System.out.println("The App1 selected, the Entrance is USART");
	}
}

class App2 implements IIC   //App2连接到了IIC接口（且IIC继承USART），所以，App2实现（连接到）了IIC和USART各自的函数功能
{
	public void Run()
	{
		System.out.println("The App2 selected, the Entrance is USART");
	}
	public void Do()
	{
		System.out.println("App2 selected, the Entrance is IIC, and the name is "+name);
	}
}
class App3 implements Telemtry
{
	public void Run(){};
	public void Do(){};
	public void act()
	{
		System.out.println("App3 selected, the entrance is Telemtry,and the version is "+version);
	}
}
/*************************************************************/
class Interface  //主程序
{
	public static void main(String[] args)
	{
		App1 A1 = new App1();
		System.out.println("App1 test "+USB.num);  
		System.out.println("App1 test "+USART.num);
		A1.Work();
		A1.Run();

		App2 A2 = new App2();
		System.out.println("App2 test "+IIC.name);
		A2.Do();

		App3 A3 = new App3();
		System.out.println("App3 test "+Telemtry.version);
		A3.act();
	}
}