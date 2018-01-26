/****
 ��������
   |---ObjectInputStream(); 
   |---ObjectOutputStream();
 ����ֱ�Ӳ���һ������������һ��Person�࣬Ȼ��newһ������ObjectInputStream�ſ��Զ������ж�ȡ��д��Ȳ���
 ʹ�������л�
 ����Ϊ��
 OOS.writeObject(new Person("Curry",30));
 OIS.readObject();  ע����ȡ����object��
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
		//��������
		FileOutputStream FOS = new FileOutputStream("Person.object");  //Դ����Ŀ�겻��Ҫд��Person.txt����������Ҳ�ǿ����������룬д��object��׺����
		ObjectOutputStream OOS = new ObjectOutputStream(FOS);
		
		//���ú������ܺͷ���
		OOS.writeObject(new Person("Curry",30));
		OOS.writeObject(new Person("Durant",35));
		OOS.close();
	}

	public static void readObj()throws Exception
	{
		FileInputStream FIS = new FileInputStream("Person.object");
		ObjectInputStream OIS = new ObjectInputStream(FIS);

		Person p1 = (Person)OIS.readObject();  //Object��ת��ΪPerson��
		Person p2 = (Person)OIS.readObject();  
		System.out.println(p1);
		System.out.println(p2);
		OIS.close();
	}
}