/*
  设计模式：解决某一类问题最行之有效的方法。
  java中23种设计模式：
  单例设计模式：解决一个类在内存只存在一个对象。

想要保证对象唯一。
1.为了避免其他程序过多建立该对象，先禁止其他程序建立该对象
2.还为了让其他程序可以访问到该类对象，只好在本类中自定义一个对象

实现途径：
1.将函数私有化
2.在类中创建一个本类对象
3.提供一个方法可以获取到该对象
*/
class module
{
	private int num;
	public void setnum(int num)
	{
		this.num=num;
	}
	public int getnum()
	{
		return num;
	}

	private static module m = new module();
	
	public static  module getInstance()
	{
		return m;
	}

}
class Single
{
	public static void main(String[] args)
	{
		module m1 = new module();
		module m2 = new module();
        m1.setnum(15);
		System.out.println(m1.getnum());
		m2.setnum(320);
		System.out.println(m2.getnum());

	}
}