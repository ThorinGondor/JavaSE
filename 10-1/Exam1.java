/*�쳣����ϰ��
  ��Ŀ����һ�������κͳ����Σ����Ƕ����Ի�ȡ������������area��������ַǷ�����ֵ,����Ϊ��ȡ��������쳣
  ��Ҫ�Ըó���������
*/
class FuShuException extends Exception
{
	FuShuException(String msg)
	{super(msg);}
}
/*****************************************/
//�ӿ�shape:
interface shape
{
    int GetArea(int a,int b)throws FuShuException;  //���и��ǣ�����ĸ����׳���һ���쳣������Ҳ�������׳����쳣��
}
//�����������󣺳����Ρ�������
class triangle implements shape
{
	public int GetArea(int a,int b)throws FuShuException
	{
		if(a<=0||b<=0)
		{
			throw new FuShuException("�׺͸߲���Ϊ������");
		}
		else
		{
			return a*b/2;
		}
	}
}
class rectangle implements shape
{
	public int GetArea(int a,int b)throws ArithmeticException
	{
		if(a<=0||b<=0)
		{
			throw new ArithmeticException("�׺͸߲���Ϊ������");
		}
		return a*b;
	}
}
/*****************************************/
//���������£�
class Exam1
{
	public static void main(String[] args)
	{
		triangle t = new triangle();
		rectangle r = new rectangle();
        try
        {
			int i = t.GetArea(3,4);
		    int j = r.GetArea(7,-8);
			System.out.println("�����������"+j+" ���������"+i);
        }
        catch (FuShuException FSE)
        {
			FSE.printStackTrace();
        }
		finally
		{
			System.out.println("�������");
		}
	}
}