/*��ȡһ�γ��������ʱ��*/
/*ԭ����ȡ��ʼʱ��ͽ���ʱ���������*/
/*��ȡʱ�䣺System.currentTimeMillis(); */
abstract class GetTime
{
	public abstract void APP();
	public final void gettime()  //final��ֹ���ǣ�����Ϊ�Ż���һ�ַ�ʽ
	{
		long start = System.currentTimeMillis();
		APP();
		long end = System.currentTimeMillis();
		
		System.out.println();
		System.out.println("����"+" ��ʼʱ��:"+start+" ����ʱ��:"+end+" ����ʱ��:"+(end-start));
	}
}
/******************************/
class SubTime extends GetTime  //����ǰ��Ĵ���
{
	public void APP()
	{
		for(int i=0;i<100;i++)
		{System.out.print(i+",");}
	}
}
/******************************/
class Template
{
	public static void main(String[] args)
	{
		//GetTime GT1 = new GetTime();
		//GT1.gettime();
		SubTime S1 = new SubTime();
		S1.gettime();
	}
}