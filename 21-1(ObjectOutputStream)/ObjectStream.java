/****
 操作对象：
   |---ObjectInputStream(); 
   |---ObjectOutputStream();
 可以直接操作一个对象，例如有一个Person类，然后new一个对象，ObjectInputStream才可以对它进行读取和写入等操作
 使对象序列化
 方法为：
 OOS.writeObject(new Person("Curry",30));
 OIS.readObject();  注：获取的是object类
****/
import java.util.*;
import java.io.*;
class ObjectStream
{
	public static void main(String[] args)throws Exception
	{
		writeObj();
		readObj();
	}

	public static void writeObj()throws Exception
	{
		//创建对象
		FileOutputStream FOS = new FileOutputStream("Person.object");  //源或者目标不需要写成Person.txt，反正里面也是看不懂的乱码，写成object后缀即可
		ObjectOutputStream OOS = new ObjectOutputStream(FOS);
		
		//调用函数功能和方法
		OOS.writeObject(new Person("Curry",30));
		OOS.writeObject(new Person("Durant",35));
		OOS.close();
	}

	public static void readObj()throws Exception
	{
		FileInputStream FIS = new FileInputStream("Person.object");
		ObjectInputStream OIS = new ObjectInputStream(FIS);

		Person p1 = (Person)OIS.readObject();  //Object类转化为Person类
		Person p2 = (Person)OIS.readObject();  
		System.out.println(p1);
		System.out.println(p2);
		OIS.close();
	}
}