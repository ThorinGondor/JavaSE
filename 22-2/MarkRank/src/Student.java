public class Student 
{
	private String name=null;
	private int Mark1=0;
	private int Mark2=0;
	private int Mark3=0;
	
	Student(String name,int Mark1,int Mark2,int Mark3)
	{
		this.name = name;
		this.Mark1 = Mark1;
		this.Mark2 = Mark2;
		this.Mark3 = Mark3;
	}
	public String getName()
	{
		return name;
	}
	public int getSum()
	{
		return Mark1+Mark2+Mark3;
	}
}
