/*��̬�����
��ʽ��
static
{
	��̬�������ִ�����
}
�ص㣺������ļ��ض�ִ�У�ִֻ��һ��
*/
class StaticCode
{
	StaticCode(int x)
	{
		System.out.println("Run"+x);
	}
	public static void show()
	{
		System.out.println("show");
	}
	static
	{
		System.out.println("new static code");

	}
	
}

class StaticCodeDemo
{
	static
	{
		System.out.println("Start");  //��̬����Static�������
	}
	public static void main(String[] args)
	{
        /*new StaticCode();
		new StaticCode();
		new StaticCode();*/    //���������ã���ˣ�����������������staticcode����������������static{}��̬����飡ֻ��ִ��һ�Σ�
	  //StaticCode.show();      //������Ȼֻ������Static.show()����������static�������Ǳ�����ִ��һ�Σ�
		new StaticCode(15);
        System.out.println("Over");
	}
	static
	{
		System.out.println("End");   //ͬ����ΪҲ�Ǿ�̬���룬������Over���End
	}

}

