/**
    �����ࣺ
	������������ͬ�����鳤�ȹ̶������Դ洢�����������͡�
	�����ϵĳ����ǿɱ�ģ�������ֻ�ܴ洢����
	�������ˮ�����Ǹ�������
	�����������������������֮���й���Ҳ�����ԣ�ǰ���������ϲ㶼��һ��Բ�Σ������������ϲ㶼��һ�������Σ�ͬʱ���ϻ���Բ�Ƿ��Σ���������������������ԣ�
	�������γ��˼��Ͽ�ܣ�����ľ���Collection����Բ�Ƿ��Σ�

	                     Collection;
	          List;                    Set;
 ArrayList  LinkedList  Vector;   HashSet TreeSet;
    
**/
import java.util.*;

class CollectDemo 
{
	public static void main(String[] args) 
	{
	/**����һ������������ʹ��Collection�Ľӿ�����,����ArrayList**/
		ArrayList AL = new ArrayList();

	/**1.���Ԫ�أ�**/
		AL.add("Java1");
		AL.add("Java2");
		AL.add("Java3");
		AL.add("Java4");
		AL.add("Java5");

	/**2.��ȡ�����������ϳ���**/
	    sop(AL.size());
	/**3.��ӡ�ü���**/
	    sop("ԭ����:"+AL);
	/**4.ɾ��Ԫ��**/
	    AL.remove("Java3");
		sop("ɾ����:"+AL);
	/**5.�ж��Ƿ�Ϊ�պ��Ƿ����ĳЩԪ��**/
	    sop(AL.isEmpty());
		sop(AL.contains("Java4"));
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}

/**
     add(str);  ȷ����collection����ָ����Ԫ��
	 clear();   �������
	 remove(str);  ��Collection���Ƴ�ָ��Ԫ�صĵ���ʵ��
	 AL1.retainALL(AL2); AL1��ֻ�ᱣ����AL2����ͬ��Ԫ�أ���ȡ������
**/
/**
      
**/