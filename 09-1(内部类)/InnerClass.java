/*
�ڲ���ķ��ʹ���
1.�ڲ������ֱ�ӷ����ⲿ��ĳ�Ա������˽��private
  ��Ϊ�ڲ��������һ���ⲿ�������
  ��ʽ�� �ⲿ������.this.XXX
2.�ⲿ��Ҫ�����ڲ�����봴���ڲ���Ķ���new Inner������

���ʸ�ʽ��
1.���ڲ��ඨ�����ⲿ���Ա��λ���ϣ����ҷ�˽�У��������ⲿ�������У�����ֱ�ӽ����ڲ������
  ��ʽ�� �ⲿ����.�ڲ����� ������ = new �ⲿ�����.�ڲ������
 2.���ڲ����ڳ�Աλ���ϣ��Ϳ��Ա���Ա���η�������
   ���磺private��
         static��
3.�������ⲿ���Ա���ʸ��ⲿ����ڲ���Ǿ�̬��Աfunction��
   Outer().Inner() OI = new Outer().Inner();   //��Ҫ�����µĶ���
   OI.function;
  �������ⲿ���Ա���ʸ��ⲿ����ڲ���̬��Աfunction��
   Outer.Inner.function();   //ֱ�ӵ���
*/

//�ڲ���ĺô��������ٴ����µĶ���

/*
��ʱӦ�ã�����������ʱ��������ڲ�����������������ڲ�����������
��Ϊ�ڲ�������ʹ���ⲿ���������
eg��
class Body
  {
	public void method()
	{}
	private class Heart
	{
		function(){}
	}
	public void FangWen()   //����Heart�Ѿ���˽�л����ʶ���Ҫ�����µĶ�����������
	{
		Heart Ht = new Heart();
		Ht.function;
	}
  }
You screwed up.
*/
class Outer  //�ⲿ��
{
	private int x = 3;

	void method()
	{
		Inner I = new Inner();  //�ⲿ��Ҫ�����ڲ�����봴���ڲ���Ķ���new Inner������
		I.function();
	}

	class Inner  //�ڲ���
	{
		//int x = 10;
		public void function()
		{
		//	int x =6;
			System.out.println("���ʳɹ���Inner:"+Outer.this.x);  //�ڲ������ֱ�ӷ����ⲿ��ĳ�Աx������˽��private x
		}
	}

}
/****************************************/
class InnerClass
{
	public static void main(String[] args)
	{
		Outer O = new Outer();
		O.method();

		//��Ҫֱ�ӷ����ڲ�����inner����
		Outer.Inner OI = new Outer().new Inner();
		OI.function();
	}
}