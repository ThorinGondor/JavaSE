/***
Map��չ֪ʶ��
Map���ϱ�ʹ������Ϊ�߱�ӳ���ϵ��

��Map����Ƕ����һ��СMap����
***/
import java.util.*;
class MapAdvance
{
	public static void main(String[] args) 
	{
		HashMap<String,String> ClassA = new HashMap<String,String>();
		ClassA.put("01","Li");
		ClassA.put("02","Wang");

		HashMap<String,String> ClassB = new HashMap<String,String>();
		ClassB.put("01","Zhang");
		ClassB.put("02","Zhao");

		HashMap<String,Map<String,String>> Grade = new HashMap<String,Map<String,String>>();
		Grade.put("01",ClassA);
		Grade.put("02",ClassB);

		getStudent(ClassA);
	}

	public static void getStudent(HashMap<String,String> map)
	{
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext())
		{
			String num = it.next();
			String name = map.get(num);
			System.out.println(num+":"+name);
		}
	}
}