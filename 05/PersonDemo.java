//***********************************************//
/*�˿���:����������
��
{
 ���ţ��ţ�
   {
	   ��.������;
   }
}
��
{
	������{���������}
}

*/
//�������������������װ���̳У���̬��
//�Ժ󿪷�����ʵ�����Ҷ���ʹ�ã�û�ж��󣬾ʹ������
//�Ҷ��󣬽�������ʹ�ö���

/*����Ƕ���ʵ�����������������
  ��������������ʵʵ���ڴ��ڵĸ��塣
��Ͷ���Ĺ�ϵ������ʱ����Щ����Ĺ��ԣ��������������Ա�ȣ�
//************************************************
*/

class Person
{
   private int age;   //��װage��ʹ�ⲿ���ʲ��ῴ������age˽�л��Ժ������⼴ʹ�����˶���Ҳ����ֱ�ӷ����ˣ�������Ӧ�������䣬����Ҫ��Person�����ж�Ӧ�ķ���age�ķ�ʽ
   private int weight;
   /********/
   int flag1=0;        //һ������Ƿ������̸�ֵ1�������ж��Ƿ���Ҫ��� ��His age is��
   int flag2=0;
   
   void login(int num)
   {
	 System.out.println("P"+num+":");
   }
   
   public void setAge(int a)
    {
         if(a>12&&a<30)
		    {age=a;}
		 else
		    {System.out.println("illegal age");flag1=1;}
    }

   public int getAge()
	{
         return age;
	}
   public void setWei(int b)
	{   if(b>100&&b<180)
          {weight=b;}
        else
		  {System.out.println("illegal weight");flag2=1;}
	}
   void reportAll()
	{
		 if(flag1==0){System.out.println("His Age Is "+age);}
		 flag1=0;

         if(flag2==0){System.out.println("His Weight Is "+weight);}
		 flag2=0;
	}
   
   
}
   

class PersonDemo
{
	public static void main(String[] args)
	{   
	    Person P1 =new Person();   //������һ������P1
	    // P1.age=31;   //���������age��Person����������Private�ʶ�ֻ��ʧЧ�ˣ������privateȥ�����д������
		P1.login(1);
	    P1.setAge(21);
		P1.setWei(440);
	    P1.reportAll();

		Person P2 =new Person();   //�����ڶ�������P2
	    // P2.age=31;   //���������age��Person����������Private�ʶ�ֻ��ʧЧ�ˣ������privateȥ�����д������
		P2.login(2);
	    P2.setAge(25);
		P2.setWei(140);
	    P2.reportAll();

		Person P3 =new Person();   //�����ڶ�������P2
	    // P3.age=31;   //���������age��Person����������Private�ʶ�ֻ��ʧЧ�ˣ������privateȥ�����д������
		P3.login(3);
	    P3.setAge(250);
		P3.setWei(140);
	    P3.reportAll();
	}
}

class Second
{
	public static void main(String[] args)
	{
	   Person p1 = new Person();
	   System.out.println();
	   p1.setAge(25);
       p1.reportAll();
	 }
}