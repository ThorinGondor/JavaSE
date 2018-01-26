class Try   //类是Try
{
	
/*1*/	private Try()//使得TryAgain函数里无法再建立新对象Try（）（因为本行代码使得它已经私有化）
	{
	}

/*2*/	private static Try T = new Try();   //在此类中创建一个本类对象T (必须)
/*********************************************/	
/*3*/	public static Try getInstance()
	{
		return T;    //返回T的值给下面代码的Try T1
	}
/*********************************************/ 
	
//以后当需要将该事物的对象保证唯一时，就加上以上三步即可！！

	private int num;
	public void setNum(int n)
	{
		this.num = n;
		
	}
	public void getNum()
	{
        System.out.println("num is "+this.num);
	}

}

class TryAgain
{
	public static void main(String[] args)
	{
        Try T1 = Try.getInstance();   //这样保证对象只有一个，就是T1

		Try T2 = Try.getInstance();
		T1.setNum(15);
	    T1.getNum();
		
		T2.getNum();    //由于只有一个对象T1，即使创建新对象T2，这里T2的num随着T1的num set为15，它的num也被set为了15

	}
}