class Demo
{
  public static void main(String[] args)
  {
     int x = 4;
	 x=x+2;
	 System.out.println(x);     //����
	 
	 float y = 2.3f; 
	 System.out.println(y);      //С��
	 
     char z = '1';
	 System.out.println(z);       //�ַ�
	 
	 byte a=1;
	 a=(byte)(a+4);   //����ǿ��ת��
     System.out.println(a);
	
     System.out.println("Ger"+"many");   //���Germany���ַ������
	 System.out.println("ab"+5+5);       //���ab55
	 System.out.println("a="+5+",b="+7); //���a=5,b=7

/*if���*/
	 x=12;
	 if(x>3 && x<10){x=5;}
	 else x=999;
	  System.out.println(x);
     
/*switch*/
	 int c = 5;
	  switch(c)
		  {
	      case 1 : System.out.println("first");break;
		  case 5 : System.out.println("Fifth");break;
		  }

/*while���*/	 
	 x=1942;
	 while(x<1945)
	  {
	   x=x+1;
	   System.out.println("Ger"+"many"+" "+x);
	  }
  }
}

