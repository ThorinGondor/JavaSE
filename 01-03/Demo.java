class Demo
{
  public static void main(String[] args)
  {
     int x = 4;
	 x=x+2;
	 System.out.println(x);     //整数
	 
	 float y = 2.3f; 
	 System.out.println(y);      //小数
	 
     char z = '1';
	 System.out.println(z);       //字符
	 
	 byte a=1;
	 a=(byte)(a+4);   //必须强制转换
     System.out.println(a);
	
     System.out.println("Ger"+"many");   //输出Germany，字符串相加
	 System.out.println("ab"+5+5);       //输出ab55
	 System.out.println("a="+5+",b="+7); //输出a=5,b=7

/*if语句*/
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

/*while语句*/	 
	 x=1942;
	 while(x<1945)
	  {
	   x=x+1;
	   System.out.println("Ger"+"many"+" "+x);
	  }
  }
}

