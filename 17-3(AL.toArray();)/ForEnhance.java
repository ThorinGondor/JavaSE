/***
    �߼�Forѭ����
	��ʽ��
	for(�������� ������:�������ļ���(Collections)��������)
	{
	}

	�÷����Լ��Ͻ��б���ʱ��ֻ�ܻ�ȡ���ϵ�Ԫ�أ����ǲ��ܶ�Ԫ�ؽ��в�����
	�����������˻�ȡԪ�أ������Խ���remove()������ListIterator�����Խ���LL.add("XXX");
	���黹��ʹ�ô�ͳ��forѭ��д���͵�������
***/
import java.util.*;
class  ForEnhance
{
	public static void main(String[] args) 
	{
		List<String> AL = new ArrayList<String>();
		AL.add("A");
		AL.add("B");
		AL.add("C");
        
		/*JDK 1.2�õ��������鷳
		Iterator<String> it = AL.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		*/

		//JDK 1.��for��ǿ���򵥷���
		for(String str:AL)
		{
			System.out.println(str);
		}
	}
}
