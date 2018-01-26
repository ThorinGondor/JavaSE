/***
    装饰设计模式：
	当想要对已经有的对象进行功能增强时，可以针对该对象定义一个类，将基于java包中已经有的对象的功能进行加强。
	自定义的该类就称为装饰类
    
	装饰类需要（1）通过构造静态函数添加被装饰的对象。（2）并基于被装饰对象的功能提供更强的功能。
***/
class Man
{
	public void Eat()
	{
		System.out.println("吃饭");
	}
}
class SuperMan
{
	private Man m;  //（1）通过构造静态函数添加被装饰的对象。
	SuperMan(Man m)
	{
		this.m=m;
	}
	public void SuperEat()  //（2）并基于被装饰对象的功能提供更强的功能。
	{
		System.out.println("开胃菜");
		m.Eat();
		System.out.println("餐后甜点");
	}
}
class  FunctionEnhance
{
	public static void main(String[] args) 
	{
		Man m = new Man();  //建立已有对象Person
		SuperMan SM = new SuperMan(m); //装饰类，增强Person的功能
		SM.SuperEat();  //这样用装饰类的增强方法
	}
}

/***
装饰类相比继承类，优点在于它不需要对父类进行复写，同时还可以针对一些功能进行优化。
装饰比继承更灵活，避免继承的程序体系臃肿，而且降低了类与类之间的关系，没有直接的关系了。
装饰类是已有对象的增强道具，具备的功能和已有对象是相同的。

因此建议使用装饰类，可以写继承类，但是不要过多地用，还是以装饰类为主
***/