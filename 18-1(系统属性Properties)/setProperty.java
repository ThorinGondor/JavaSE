/***
System:
����ϵͳһЩ��Ϣ��
��ȡϵͳ������Ϣ��Properties�࣬getProperties();
Properties������˼������
System���еķ��������Զ��Ǿ�̬��,��˲���ֱ�ӽ���һ���¶���ֻ��ͨ��System.getProperties();������һ������
out����׼�����Ĭ���ǿ���̨
in����׼���룬Ĭ���Ǽ���
    
	//�Զ������һ��ӳ��Ž�Properties��Map������:
		System.setProperty("J20","J31");   
***/
import java.util.*;
class setProperty 
{
	public static void main(String[] args) 
	{
		//ֻ������getProperties();������һ��Properties����.
		Properties MapProp = System.getProperties(); //��ʽ��ߣ�ϵͳ������ԡ���ʽ��ߣ���������Properties���һ������MapProp���ö���ΪMap������
		Set<Object> ks = MapProp.keySet();       //����Map����MapProp������key�г�Set���������������õ������������
		//�Զ���һ��ӳ��Ž�Properties�С�
		System.setProperty("J20","J31");
		System.setProperty("PC.VisionCard","Nvidia Geforce GTX780M");

        //��ӡ�����
		Iterator<Object> it = ks.iterator();
		while(it.hasNext())
		{
			Object key = it.next();
			Object value = MapProp.get(key);
			System.out.println(key+"---"+value);
		}
		//eg.��ȡkeyΪ��os.name������Ӧ��valueֵ��
		Object value2 = MapProp.get("os.name");
		System.out.println(value2);
	}
}
