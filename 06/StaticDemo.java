class Person
{
    String name;
	static String country = "CH";  //static����̬�ĳ�Ա������ʹ�ó�Ա�������Ա�����ֱ�ӵ��ã�ʹ�á�country������һ�ֵ��÷��������ڶ������

	public void show()
	{
	   System.out.println(this.name+","+this.country);   //this�����ر��Ӧÿ�������name��country����ֹ������ţ�����ֻ���ڶ�����ʹ�ã�����������ʹ��
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