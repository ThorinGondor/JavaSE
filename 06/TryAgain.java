class Try   //����Try
{
	
/*1*/	private Try()//ʹ��TryAgain�������޷��ٽ����¶���Try��������Ϊ���д���ʹ�����Ѿ�˽�л���
	{
	}

/*2*/	private static Try T = new Try();   //�ڴ����д���һ���������T (����)
/*********************************************/	
/*3*/	public static Try getInstance()
	{
		return T;    //����T��ֵ����������Try T1
	}
/*********************************************/ 
	
//�Ժ���Ҫ��������Ķ���֤Ψһʱ���ͼ��������������ɣ���

	private int num;
	public void setNum(int n)
	{
		this.num = n;
		
	}
	public void getNum()
	{
        System.out.println("num is "+this.num);
	}

}

class TryAgain
{
	public static void main(String[] args)
	{
        Try T1 = Try.getInstance();   //������֤����ֻ��һ��������T1

		Try T2 = Try.getInstance();
		T1.setNum(15);
	    T1.getNum();
		
		T2.getNum();    //����ֻ��һ������T1����ʹ�����¶���T2������T2��num����T1��num setΪ15������numҲ��setΪ��15

	}
}