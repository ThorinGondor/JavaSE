/*
    �Զ����쳣����Ϊ��Ŀ�л����һЩ���е����⣬����Щ���Ⲣδ��Java����������װ��
	���Զ�����Щ���е��쳣�����԰���java�������װ��˼�룬�����е��쳣�����Զ�����쳣�ķ�װ��  
*/
/*
     ��Ŀ���ڱ���Ŀ�У������Ǹ�����Ҳ��Ϊ���쳣�����ܽ�������
	 ��ô����Ҫ�������������Զ��������

	 ���ں����ڲ�������throw�׳��쳣������ô�ͱ��������Ӧ�Ĵ���������
	 Ҫô���ڲ�try catch������
	 Ҫô�ں����������õ����ߴ�����
	 һ������º���������쳣����������Ҫ����
*/

class FuShuException extends Exception  //1.����һ�������쳣�̳��쳣�࣬�����γ�һ����ΪFuShuException���쳣
{
}

class APP
{
	int Run(int a,int b)throws FuShuException  //ע�������˸ú������д��뻹��Ҫ��һ������throw�ؼ���
	{
		if(b<0)
		{
			throw new FuShuException();  //2.�ֶ�ͨ��throw�ؼ����׳�һ���쳣����ʹ��FuShuException�쳣��Ϊb<0;
		}
		return a/b;  
	}
}

class CustomException   //�Զ����쳣����
{
	public static void main(String[] args)
	{
		APP ap = new APP();
		try
		{
			int i = ap.Run(40,-5);
		    System.out.println("The result is "+i);
		}
		catch (FuShuException FSE)
		{
			//�쳣�ľ����һЩ������ʽ������
			System.out.println("��������Ϊ������");
			System.out.println(FSE.toString());
            System.out.println(FSE.getMessage());
			FSE.printStackTrace();
		}
		
		System.out.println("Over");
	}
}