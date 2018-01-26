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
	 
	   ���ϣ���Set����
	   ��ʵSet�ĵײ����ʹ����Map���ϡ�
****/
import java.util.*;

class MapDemo
{
	public static void main(String[] args)
	{
		Map<String,String> map = new HashMap<String,String>();
		map.put("01","����");
		map.put("02","����");
		map.put("03","����");
		map.put("04","����");
		map.put("05","����");
		map.put(null,"���");

		System.out.println(map.containsKey("02"));     //containsKey() �� containsValue() ���÷�ʾ��
		System.out.println(map.containsValue("����"));
		System.out.println(map.remove("04"));     //���key��04��ͬ���ظ�key��Ӧ��ֵ
        System.out.println(map.isEmpty());        //�ж��Ƿ�Ϊ��
		System.out.println(map.get("01"));        //��ȡ��Ӧ��keyΪ"01"��valueֵ
		System.out.println(map.get(null));        //��ȡ��Ӧ��keyΪnull(��)��valueֵ
		System.out.println(map);                  //���ȫ��ӳ�䣬��ʽΪkey=value
		System.out.println("Value(1):"+map.values());         //��ȡMap���������е�ֵ 
        
		//��ȡMap���������е�ֵ:
		Collection<String> coll = map.values();
		System.out.println("Value(2):"+coll);
	}
}