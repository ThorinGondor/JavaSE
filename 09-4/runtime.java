/*
Exception����һ������������쳣������RunTimeException����˼������ʱ�쳣��
����ں����������׳����쳣���������Բ��������쳣��һ�����Ա���ɹ���
����ں����������˸��쳣�������߿��Բ��ý��д���һ������ɹ���
*/
class APP
{
	int Work(int a, int b)
	{
		if(b==0)
		{
			throw new ArithmeticException();  //���������ArithmeticException����Ҫtry��catch��ֱ���ӳ���throw������
		}
		return a/b;
	}
}
class runtime
{
	public static void main(String[] args)
	{
		APP ap = new APP();
		int x = ap.Work(9,0);
		System.out.println("���������"+x);
		System.out.println("Over");	
	}
}