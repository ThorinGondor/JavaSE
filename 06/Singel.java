/*
  ���ģʽ�����ĳһ����������֮��Ч�ķ�����
  java��23�����ģʽ��
  �������ģʽ�����һ�������ڴ�ֻ����һ������

��Ҫ��֤����Ψһ��
1.Ϊ�˱�������������ཨ���ö����Ƚ�ֹ�����������ö���
2.��Ϊ��������������Է��ʵ��������ֻ���ڱ������Զ���һ������

ʵ��;����
1.������˽�л�
2.�����д���һ���������
3.�ṩһ���������Ի�ȡ���ö���
*/
class module
{
	private int num;
	public void setnum(int num)
	{
		this.num=num;
	}
	public int getnum()
	{
		return num;
	}

	private static module m = new module();
	
	public static  module getInstance()
	{
		return m;
	}

}
class Single
{
	public static void main(String[] args)
	{
		module m1 = new module();
		module m2 = new module();
        m1.setnum(15);
		System.out.println(m1.getnum());
		m2.setnum(320);
		System.out.println(m2.getnum());

	}
}