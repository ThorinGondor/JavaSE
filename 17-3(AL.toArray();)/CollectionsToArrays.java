/***
���ϱ����飺
Collection�ӿ��е�toArray();����
***/
import java.util.*;
class CollectionsToArrays
{
	public static void main(String[] args)
	{
		List<String> AL = new ArrayList<String>();  //����һ���µļ���
	    AL.add("A");
	    AL.add("B");
	    AL.add("C");
    
        String[] arr = AL.toArray(new String[AL.size()]);  //�ü���ת��Ϊ����
		/**
		1.
		��ָ�����͵�����ĳ���С�ڼ��ϵ�size()����÷����ڲ��ᴴ��һ���µ����飬����Ϊ���ϵ�size
		��ָ�����͵�����ĳ��ȴ��ڼ��ϵ�size()���Ͳ��ᴴ���µ����飬����ʹ�ô��ݽ��������顣
		���Դ���һ���ոպõ���������.
		2.
		ΪʲôҪ�Ѽ���ת��Ϊ���飿
		Ϊ���޶���Ԫ�صĲ�������ֹ��Ԫ�ؽ�����ɾ
		**/
	    sop(Arrays.toString(arr));
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}