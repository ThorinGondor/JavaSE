/**
     ���ͣ����ڽ����ȫ���⣬�������������˲�ͬ���͵����ݣ�(����String���int���)��
	       
		   �ô���1.������ʱ�ڳ��ֵ�����ת�Ƶ��˱�������У�������ʱ������١�
		         2.������ǿ��ת�����鷳��
		   
		   ���͵ĸ�ʽ��ͨ��<XXX>�����塢����Ҫ�����������������͡�

		   ͨ���ڼ��Ͽ��Collection�кܳ�����ֻҪ���������ţ���Ҫ���巺�͡�
		   ��ʹ�ü���ʱ������Ҫ��������Ҫ�洢������������Ϊ�������ݵ�<>���ɡ�
**/
/***
     ʲôʱ���÷����ࣿ������Ҫ�����������������Ͳ�ȷ����ʱ�����ڶ���Object�������չ�����ڶ��巺��������չ<XXX>
	 
	 ���ַ��������÷��Ͷ��� �ࡣ
***/
/***
      ������������ķ��ͣ�����������Ч�����������ʹ�ã���ô�����ཨ���Ķ�����ȷҪ���������ͺ���ô���ڴ˶���㲻�ܲ�������������͡�

	  Ϊ���ò�ͬ�������Բ�����ͬ���ͣ������ͻ���ȷ����
	  ��ô�ɽ����Ͷ����ڷ����ϡ�
	  �����Խ����Ͷ����ڽӿ��ϡ�
***/
import java.util.*;
interface ThePort<E>
{
	public abstract void Show(E e);
}

class Card<E> implements ThePort<E>
{
	public void Show(E e)
	{
		System.out.println(e);
	}
}

class GenericDemo5
{
	public static void main(String[] args)
	{
		Card<String> Cd = new Card<String>();
		Cd.Show("DF");
	}
}