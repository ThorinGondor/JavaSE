class AT
{   
	int max=0;
    int min=0;

/***********************************************/

	public static void printArr(int[] arr)
	{   
		System.out.print("The array is [");
		for(int x = 0 ;x<arr.length;x++)
		{
			System.out.print(arr[x]+" ");
		}
		System.out.println("]");
		System.out.println("******");
	}

/************************************************/

	public void getMax(int[] arr)
	{
		for(int a=0;a<arr.length-1;a++)
		{
			if(arr[a]>arr[max])
				max=a;
		}
	System.out.println("Now max is "+arr[max]);
	}

/*************************************************/
	
	public void getMin(int[] arr)
	{
        for(int b=0;b<arr.length;b++)
		{
			if(arr[b]<arr[min])
			{min=b;}
		}
		System.out.println("Now min is "+arr[min]);
	}
/**************************************************/
   public void paixu(int[] arr)
	{
	   for(int m=0;m<arr.length-1;m++)
		{
		   for(int n=m+1;n<arr.length;n++)
			{
				if(arr[m]>arr[n])
				   {exchange(arr,m,n);}
		    }
	    }
	System.out.println("After the arrangment:");
    }
    public void exchange(int[] arr,int p,int q)
    {
   int temp;
   temp=arr[p];
   arr[p]=arr[q];
   arr[q]=temp;
    }
}


