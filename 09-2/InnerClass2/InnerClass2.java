/*
�����ڲ��ࣺ
1.����ʵ�����ڲ���ļ�д��ʽ��
2.���������ڲ����ǰ�᣺
  �ڲ�������Ǽ̳�һ�������ʵ�ֽӿ�
 3.�����ڲ���ĸ�ʽ��new ���� ���� �ӿڣ���{�������������}
 4.��ʵ�����ڲ������һ�������������
 5.�����ڲ����ж���ķ�����ò�Ҫ��������
*/
abstract class ABS
{
	public abstract void Show();
}
class Outer
{
	int i = 3;
	/*
	class Inner extends ABS
	{
		public void Show()
		{
			System.out.println("Show "+i);
		}

	}*/
	public void method()
	{
		//new Inner().Show();   ��μ���ɫ���ֵĴ����أ������Ǽ򻯳�һ�������,�Ż���Ĵ������£�
		new ABS()
		{
		   public void Show()
		   {
			   System.out.println("Show i="+i);
		   }
		}.Show(); //new ABS().Show() �⵱�м��˸�{}�����еĺ���ʵ����Show������ ��Ϊ����ABS��Show��һ������������˱�������һ��{}������ʵ�廯Show���������ܽ��е���
	}
}
class InnerClass2
{
	public static void main(String[] args)
	{
		new Outer().method();
	}
}