import java.util.*;
/**
ʹ��LinkedListģ��һ����ջ���߶������ݽṹ

��ջ���Ƚ���� ��ͬһ��ˮ��
���У��Ƚ��ȳ� ��ͬһ��ˮ��

����ģ����е��Ƚ��ȳ������Ϊ��������
**/
class Duilie
{
	LinkedList LL = new LinkedList();
	
	public void myAdd(Object obj)
	{
		LL.addFirst(obj);
	}
	public Object myGet()
	{
		return LL.removeLast();
	}
	public boolean isNull()
	{
		return LL.isEmpty();
	}
}
class LLPra
{
	public static void main(String[] args)
	{
		Duilie d = new Duilie();
		d.myAdd("Java0");
		d.myAdd("Java1");
		d.myAdd("Java2");
		d.myAdd("Java3");
		d.myAdd("Java4");
		System.out.println(d.myGet());
		System.out.println(d.myGet());
		System.out.println(d.myGet());
		System.out.println(d.myGet());
		System.out.println(d.myGet());
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
	
}