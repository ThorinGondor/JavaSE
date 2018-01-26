class Person
{
    String name;
	static String country = "CH";  //static：静态的成员变量，使得成员变量可以被类名直接调用，使得“country”多了一种调用方法优先于对象存在

	public void show()
	{
	   System.out.println(this.name+","+this.country);   //this可以特别对应每个对象的name和country，防止互相干扰，但是只能在对象中使用，不能在类中使用
	}
}

class StaticDemo
{
	public static void main(String[] args)
	{
		Person p1 = new Person();
	    p1.name = "Lisi";
		p1.country = "AM";
        System.out.println(p1.country);

		Person p2 = new Person();
	    p2.name = "zhang";
		p2.country = "FRA";
		System.out.println(p2.country);

		/************************/

		p1.show();
		p2.show();
		
		
	}
}