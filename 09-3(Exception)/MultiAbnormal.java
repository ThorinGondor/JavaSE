/*
�Զ��쳣�Ĵ�����

1.�����쳣ʱ������������������쳣
  eg������8�еģ�throws ArithmeticException

2.�Է����˴����뼴App���������������쳣���Ͷ�Ӧ�м���catch�顣
  ������catch����ڼ̳й�ϵ���ͰѸ�����ڵ�һ����
*/
class App
{
	int Run(int a, int b)throws ArithmeticException,ArrayIndexOutOfBoundsException  //�˴�������������쳣������Ϊ���쳣���Ǳ�Խ���쳣
	{
		int[] arr = new int[a];
		System.out.println(arr[4]);
		return a/b;
	}
}
class MultiAbnormal
{
	public static void main(String[] args)
	{
		App A = new App();
		try
		{
			int j = A.Run(4,0);
			System.out.println("The Result is "+j);
		}

		catch (ArithmeticException B)  //ArithmeticException B�������ڳ���Ϊ��ʱ��ȡ��catch���쳣��Ϣ,���û���ֳ���Ϊ����������catch������ִ�У�
		{
			System.out.println("��������Ϊ�㣡");
			System.out.println(B.toString());
			B.printStackTrace();
		}

		catch (ArrayIndexOutOfBoundsException B)  //ArrayIndexOutOfBoundsException B�������ڽǱ�Խ��ʱ��ȡ�쳣��Ϣ�����û���ֽǱ�Խ����������catch������ִ�У�
		{
			System.out.println("�Ǳ�Խ���ˣ�");
			System.out.println(B.toString());
			B.printStackTrace();
		}

		System.out.println("Over");
	}
}