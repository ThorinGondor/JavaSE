class  StringDemo
{
	public static void main(String[] args) 
	{
		String s0 = "Klay";               //s0是一个类型变量，对象是Klay，它代表一个对象
		String s1 = new String("Klay");   //s1有两个对象
		System.out.println(s0==s1);        //故而这里的结果是不相同
		System.out.println(s0.equals(s1)); //String类复写了Object类中的equals方法，该方法用于判断字符串是否相同
	}
}
