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

import java.util.*;

class Worker
{
}
class Student
{
}
class Tool<Customize>  //������Customize����ʴ�����Object������ʹ��Customize����,Customize�����һ������
{
	private Customize Ctm;
	public void setObject(Customize Ctm)
	{
		this.Ctm=Ctm;
	}
	public Customize getObject()  //Customize������һ��������ʹ��
	{
		return Ctm;
	}
}
class GenericDemo3
{
	public static void main(String[] args)
	{
		Tool<Worker> T = new Tool<Worker>();  //�����������Ͷ��壬����Customize������Worker��Student�����࣬����д����Щ����Ӷ��������ͣ���֤��ȫ
		T.setObject(new Worker());
		Worker W = T.getObject();
	}
}