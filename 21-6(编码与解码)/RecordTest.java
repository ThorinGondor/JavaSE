/****

****/
import java.util.*;
import java.io.*;

class RecordTest
{
	public static void main(String[] args) throws IOException
	{
		TreeSetDemo();
		//StreamDemo();
	}
	public static void TreeSetDemo()throws IOException
    {
	    TreeSet<Student> TS = new TreeSet<Student>(new CompareTool());
	    while(true)
		{
			sop("请输入姓名：");
			String str1 = new Scanner(System.in).nextLine();
			if("over".equals(str1)){break;}
			sop("请输入第一门成绩");
			int marka = new Scanner(System.in).nextInt();
			sop("请输入第二门成绩");
			int markb = new Scanner(System.in).nextInt();
			sop("请输入第三门成绩");
			int markc = new Scanner(System.in).nextInt();
			TS.add(new Student(str1,marka,markb,markc));
		}

		FileWriter FW1 = new FileWriter("stud.txt");
		BufferedWriter BW1 = new BufferedWriter(FW1);

		Iterator<Student> it = TS.iterator();
		while(it.hasNext())
		{
			Student s = (Student)it.next();
			String str = new String("Student:【Name:"+s.getName()+"; Sum:"+s.getSum()+"】");
			BW1.write(str);
			BW1.newLine();
			BW1.flush();
		}
    }

	/*public static void StreamDemo()throws IOException
    {
		FileInputStream FIS = new FileInputStream("paixu.txt");
		InputStreamReader ISR = new InputStreamReader(FIS);
		BufferedReader BR = new BufferedReader(ISR);

		FileOutputStream FOS = new FileOutputStream("stud.txt");
        OutputStreamWriter OSW = new OutputStreamWriter(FOS);
		BufferedWriter BW = new BufferedWriter(OSW);

		while(true)
		{
			String str = BR.readLine();
            if(str==null){break;}
			System.out.println(str);
			BW.write(str);
			BW.newLine();
			BW.flush();
		}
		BR.close();
		BW.close();
	}*/
	public static void sop(Object o)
	{
		System.out.println(o);
	}
}

class Student
{
	private String name=null;
	private int MarkA=0;
	private int MarkB=0;
	private int MarkC=0;
	
	Student(String name,int MarkA,int MarkB,int MarkC)
	{
		this.name=name;
		this.MarkA=MarkA;
		this.MarkB=MarkB;
		this.MarkC=MarkC;
	}
	
    public String getName()
	{
		return name;
	}
	public int getSum()
	{
		return MarkA+MarkB+MarkC;
	}
}


class CompareTool implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		Student s1 = (Student)obj1;
		Student s2 = (Student)obj2;
		int result=0;
		if(s1.getSum()==s2.getSum())
		{
			result = 1;
		}
		if(s1.getSum()>s2.getSum())
		{
			result = -1;
		}
		if(s1.getSum()<s2.getSum())
		{
			result = 1;
		}
		return result;
	}
}