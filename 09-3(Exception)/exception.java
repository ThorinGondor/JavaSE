/*
�쳣�����ǳ���������ʱ���ֲ��������
�쳣������������ͨ��Java�������ʽ��������һ�����⣬����װ�ɶ���
            ��ʵ����java�Բ������������������Ķ������֡�

��������Ļ��֣���Ϊ���֣�һ�������ص����⣬һ���Ƿ����ص����⣺
�������صģ�javaͨ��error���������
    ����errorһ�㲻��д����ԵĴ�����д���
���ڷ����صģ�javaͨ��exception���������
    ����exception����ʹ������ԵĴ�����ʽ���д���

����error��exception������һЩ��������
���磺�������������Ϣ������ԭ���

Throwable

�쳣�Ĵ�����java�ṩ�����е������д�����
try
{��Ҫ�����Ĵ��룻}
catch���쳣�� ������
{�����쳣�Ĵ��룻}
finally
{һ����ִ�е���䣻}

*/
class Demo
{
	int Divide(int a,int b)
	{
		return a/b;
	}
}
class exception    //������󡪡��쳣
{
	public static void main(String[] args)
	{	
		Demo D = new Demo();
		
		try
		{
			int x = D.Divide(12,0);  //�˴������쳣��������ִ��catch�������������䲻��ִ��
		    System.out.println(x);
		}

		catch(Exception e)  //Exception e = new ArithmeticException();
		{
			      System.out.println("��������Ϊ�㣡");
			/*1*/ System.out.println(e.getMessage());  // getMessage()���ܣ����ش��쳣����ϸ��Ϣ�ַ�����by zero
			/*2*/ System.out.println(e.toString());  //toString�������ܣ������쳣��Ϣ�ļ������
			/*3*/ e.printStackTrace();  //�����쳣���ƣ��쳣��Ϣ���쳣���ֵ�λ��

		}
		
		System.out.println("Over");
		
	}
}