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
*/
/******************************************************************/

interface USB      //“USB”接口
{
	public static final int num=17;  
	public abstract void Work();
}

class App implements USB   //类与类之间是继承关系extends，那么在接口这里，变成了执行、实现关系implements
{
	public void Work()
	{
		System.out.println("Work");
	}
}

class Interface
{
	public static void main(String[] args)
	{
		App A1 = new App();
		System.out.println(A1.num);
		System.out.println(USB.num);
		System.out.println(App.num);  //三种写法都可以
		A1.Work();
	}
}