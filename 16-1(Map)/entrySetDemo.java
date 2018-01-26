/****
    Map���ϸ������ü��ϴ洢��ֵ�ԣ�һ��һ������棬����Ҫ��֤����Ψһ�ԡ�
	����ȷ���Collection����װ�Ķ���һƱ�������ˣ���Map��װ����һ�ԶԷ��ޡ�
	���ǰ���ǵ����ļ��ϣ�������˫���ļ��ϡ�

	����һ��Map�ӿڡ�
	Map<K,V>
	K����Key������λ; 
	V����Value����ֵ;
	������ӳ���ϵ����Kӳ�䵽V����ÿ��Kֻ��ӳ�䵽Ψһһ��V��

	���ܣ�
	1.���Ԫ��: put(K key,V value)

	2.ɾ��Ԫ��: clear()
	            remove(Object key)

	3.�ж�Ԫ��: containsValue(Object Key)
	            containsKey(Object Value)
				isEmpty()

	4.��ȡԪ��: get(Object Key)
	            size()
				values()
			
				entrySet()
				keySet()
	Map���ϣ�
	   |--Hashtable:����ʵ�ֹ�ϣ���ù�ϣ����ӳ�䵽��Ӧ��ֵ���κη�null���󶼿�����������ֵ���������Ķ������ʵ��hashCode������equals������
	   |--HashMap��Ҳ�ǹ�ϣ�����ݽṹ����Hashtable������ͬ������������ʹ��null����ֵ����Ч�ʽϸߡ�
	   |--TreeMap���ײ��Ƕ������ṹ���������ڸ�Map�����еļ���������
	 
    Map���ϵ�����ȡ����ʽ��
	1.keySet����Map���������еļ�key���뵽Set���ϡ���ΪSet�߱������������п��Ե�����ʽȡ�����еļ����ٸ���get��������ȡÿһ������Ӧ��ֵ��
              ��ԭ�����ǽ�Map�������keyԪ����ȡ�����г�Set���ϣ�����Iteratorȡ����

	2.entrySet�������ص���ӳ���ϵ���������ͣ���Map�����е�ӳ���ϵ���뵽��Set���ϵ��С�
	             �����ϵ�����⣬���� Map.Entry<String,String>
****/
import java.util.*;
class Player
{
	private String name;
	private String team;

	Player(String name,String team)
	{
		this.name=name;
		this.team=team;
	}

	public String getName()
	{
		return name;
	}
	public String getTeam()
	{
		return team;
	}
}
class entrySetDemo 
{
	public static void main(String[] args) 
	{
		//����һ��Map���Ͽ��
		Map<String,String> map = new HashMap<String,String>();
		
		//����һϵ���µ���Ա����
		Player P1 = new Player("Curry","Warriors");
		Player P2 = new Player("James","Cavaliers");
		Player P3 = new Player("Leonard","Spurs");
		Player P4 = new Player("Westbrook","Thunder");
		Player P5 = new Player("Durant","Warriors");
        
		//����Ա�����������Ϊkey�������Ϊvalue�Ž�Map�����У�
		map.put(P1.getName(),P1.getTeam());
		map.put(P2.getName(),P2.getTeam());
		map.put(P3.getName(),P3.getTeam());
		map.put(P4.getName(),P4.getTeam());
		map.put(P5.getName(),P5.getTeam());
        System.out.println(map);

		//��entrySet������Map���ϵ�ӳ���ϵ�г���Set����
		Set<Map.Entry<String,String>> es = map.entrySet();
		//Ȼ������õ�����
		Iterator<Map.Entry<String,String>> it = es.iterator();
		while(it.hasNext())
	    {
			Map.Entry<String,String> me =it.next();
			String key = me.getKey();
			String value = me.getValue();
			System.out.println(key+" "+value);
		}
	}
}
