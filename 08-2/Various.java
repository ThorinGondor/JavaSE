/*
多态的概念理解：
多态：可以理解为事物存在的多种体现形态
eg：人：男人、女人、小孩、老人等
eg：动物：猫、狗、鼠等

如下所示：
猫 A = new 猫（）；
动物 A = new 猫（）；

这里，A具备猫和动物的特点

多态如何应用：
（1）多态的体现：
     父类的引用指向了自己的子类对象；
	 父类的引用也可以接收自己的子类对象
（2）多态的前提：
     必须是类与类之间有关系，要么继承（extends）要么实现（implements）
	 通常还有一个前提：存在覆盖。
（3）多态的好处：
     大大提高了程序的扩展性。
（4）多态的弊端：
     只能使用父类的引用访问父类中存在的成员（Eat）
*/
/***********************************************************/
//以下，代码开始。
/***********************************************************/
abstract class Animal
{
	public abstract void Eat();
}

class Cat extends Animal 
{
	public void Eat()
	{
		System.out.println("爱吃鱼");
	}
	public void CatchMouse()
	{
		System.out.println("抓老鼠");
	}
}

class Dog extends Animal
{
	public void Eat()
	{
		System.out.println("爱吃骨头");
	}
	public void Hunt()
	{
		System.out.println("会打猎");
	}
}
class Pig extends Animal
{
	public void Eat()
	{
		System.out.println("爱吃粮食");
	}
	public void Sleep()
	{
		System.out.println("会睡觉");
	}
}
/*****************************************/
class Various
{
	public static void main(String[] args)
	{
		Animal A1 = new Cat();  //类型提升，向上转型
		A1.Eat();
		Cat C = (Cat)A1;  //如果想要调用猫的特有方法(抓老鼠)，操作方法：进行子类强制转换
        C.CatchMouse();    //这时可以调用特有方法
		//多态都是自始至终都是子类Cat在做变换
        /*下同*/
		Animal A2 = new Dog();
		A2.Eat();
		Dog D = (Dog)A2;
		D.Hunt();
        /*代码优化*/
		Function(new Pig());
		Function(new Cat());
	}
	public static void Function(Animal M)
	{
		M.Eat();
		if(M instanceof Pig)
		{
			Pig P = (Pig)M;
		    P.Sleep();
		}
		else if(M instanceof Cat)
		{
			Cat C = (Cat)M;
			C.CatchMouse();
		}
	}
}