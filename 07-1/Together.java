
//�Ӹ�������Ժ����Ա���ص㣺
/*
 ���г�Ա��
  1.����
  2.����
  3.���캯��
*/
class Father
{
	int num = 4; 
	String name = "Father";
}

class Son extends Father    //���ӱؼ̳��Ը�
{
	int num = 5;
	String name = "Son";
	public void Son()
	{
		System.out.println("2:Num is "+this.num+" Name is "+this.name);   //this������������Ϣ�����ã�super��������ĸ������Ϣ������
	}
	public void Father()
	{
		System.out.println("Father Name is "+super.name+" Father Num is "+super.num);   //��������ʹ��super���Ե���S1�ļ̳еĸ������Ϣ
	}
}

class Together
{
	public static void main(String[] args)
	{
         Son S1 = new Son();
		 System.out.println("1:Num is "+S1.num+" Name is "+S1.name);   //���son��5��˵�������������ӣ�son������Ϣ�����̳еĲ��֣����Ǹ�����Ϣ���ڣ�
		 S1.Son();                                                    //���߰���δ���Ž�void Son()Ҳ�У�һ��Ч��
         S1.Father();   //���S1�ĸ������Ϣ
	}
}