//throws����
class App
{
	int Run(int a,int b)throws Exception  //throws Exception�����ó���/�������п��ܳ�������
	{
		return a/b;
	}
}
class Strange
{
	
	public static void main(String[] args)
	{
        App A = new App();
	    try
	    {
		    int i = A.Run(15,0);  //�˴������쳣��������ִ��catch��������������System...����ִ��
	        System.out.println("The Result is "+i);
	    }
	    catch (Exception E)  //Exception E = ArithmeticException();
	    {
		    System.out.println("��������Ϊ�㣡");
		    System.out.println(E.getMessage());
		    E.printStackTrace();  //�����쳣���ƣ��쳣��Ϣ���쳣���ֵ�λ��
	    }
	    System.out.println("Over");
	}
}