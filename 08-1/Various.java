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
		System.out.println("爱睡觉");
	}
}
/*****************************************/
class Various
{
	public static void main(String[] args)
	{
		//法：
		/*Animal C1 = new Cat();   //多态的表现:父类的引用指向了自己的子类对象
		Animal C2 = new Cat();
	    Animal D1 = new Dog();
		Animal D2 = new Dog();
		Animal P1 = new Pig();
		
		Function(C1);
		Function(C2);
		Function(D1);
		Function(D2);
		Function(P1);*/
        //下示为优化以后的代码：
		Function(new Cat());
		Function(new Dog());
		Function(new Pig());

	}
	public static void Function(Animal M)
	{
		M.Eat();
	}
}