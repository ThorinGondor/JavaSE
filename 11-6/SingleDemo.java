/*
   �������ģʽ��
   ����ʽ��
   class Single
   {
	   private static final Single s =new Single();
	   private Single()
	   {}
	   public static Single getInstance()
	   {
		   return s;
	   }
   }
 */  
 //����ʽ��
   class Single
   {
	   private static final Single s = null;
	   private Single()
	   {}
	   public static Single getSInstance()
	   {
		   if(s==null)
		   {
			   synchronized(Single.class)
			   {
				   if(s==null)
				   {
					   s=new Single();
				   }
			   }
			   
		   }
		   return s;
	   }
   }

class SingleDemo
{
	public static void main(String[] args)
	{}
}