class Nokia
{
	void Show()
	{
		System.out.println("Sebian");
	}
}

class Sam extends Nokia
{
	void Show()
	{
		super.Show();
        System.out.println("Update...");
		System.out.println("Android");
	}
}
/************************************************/
class Update
{
	public static void main(String[] args)
	{
		//Nokia N1 = new Nokia();
		//N1.Show();
		/*Update to Android*/
		Sam S1 = new Sam();
		S1.Show();
	}
}