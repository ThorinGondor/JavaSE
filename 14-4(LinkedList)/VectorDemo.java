/**
    Vector��ArrayList�������ڣ�ǰ����Ҫ��Enumeration(ö��)��ִ�л�ȡ�����ɾ���ȶ�����������ʹ�õ�����Iterator��ListIterator��
    ö����vector���е�ȡ����ʽ��
	ö�ٺ͵���������
	
	��ʵö�ٺ͵�����һ���ģ���������ö�ٵ������Լ����������������Ա�������ȡ���ˣ�ö�پ����������ˡ�
**/

import java.util.*;
class VectorDemo
{
	public static void main(String[] args)
	{
		Vector V = new Vector();
		V.add("Java0");
		V.add("Java1");
		V.add("Java2");
		V.add("Java3");
		V.add("Java4");
		V.add("Java5");
		sop(V);
		Enumeration Enu = V.elements();
		//��������
		/*Iterator it = AL.iterator();*/
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}