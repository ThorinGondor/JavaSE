class For
{
	public static void main(String[] args)
	{
	   int a=0,b=1,c=1;
	   for(int x=0;x<9;x++ )
		{
	        for(int y=0;y<=x;y++ )
			{
		     a++;
			 c=a*b;
			 if(c<10)
				{System.out.print(a+"x"+b+"="+c+"   ");}
			 else if(c>10){System.out.print(a+"x"+b+"="+c+"  ");}
			}
		   System.out.println();
		   b++;
		   a=0;
		}
	}
}