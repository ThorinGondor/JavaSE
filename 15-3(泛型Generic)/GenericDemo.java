/**
     ���ͣ����ڽ����ȫ���⣬�������������˲�ͬ���͵����ݣ�(����String���int���)��
	       
		   �ô���1.������ʱ�ڳ��ֵ�����ת�Ƶ��˱�������У�������ʱ������١�
		         2.������ǿ��ת�����鷳��
		   
		   ���͵ĸ�ʽ��ͨ��<XXX>�����塢����Ҫ�����������������͡�

		   ͨ���ڼ��Ͽ��Collection�кܳ�����ֻҪ���������ţ���Ҫ���巺�͡�
		   ��ʹ�ü���ʱ������Ҫ��������Ҫ�洢������������Ϊ�������ݵ�<>���ɡ�
**/
import java.util.*;

class GenericDemo
{
	public static void main(String[] args) 
	{
		ArrayList<String> AL = new ArrayList<String>(); //<String>�޶���ArrayList�����Ԫ�ض�ֻ��ΪString���͵��ַ���
		AL.add("Kimi");
		AL.add("Schumacher");
		AL.add("Alonso");
		AL.add("Hamilton");
		AL.add("Vettel");


		Iterator<String> it = AL.iterator();  //Iterator�������<String>ע���Ժ󣬾���Ҳ��֮��ʧ��Iterator�����������Ͱ�ȫ��
		while(it.hasNext())
		{
			String s0 = /*(String)*/it.next();  //��������ע�ͣ����ﲻ����Ҫǿ��ת��
			System.out.println(s0+"---"+s0.length());
		}
	}
}

