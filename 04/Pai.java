class Pai
{
	public static void main(String[] args)
	{
	   int[] arr={8,19,6,9,80,74,142,56,67,95,88,100};
	   System.out.println(arr.length);
	   for(int c=0;c<12;c++)
		{System.out.print(arr[c]+" ");}  //输出数组元素个数
	   System.out.println();  //输出排序前

	   //排序开始：
	   int a;
	   for(int i=0;i<12;i++)
		{
	      for(int j=0;j<12;j++)
			{
		    if(arr[i]<arr[j]){a=arr[j];arr[j]=arr[i];arr[i]=a;}
			 }
	     }
		for(int b=0;b<12;b++)
		{System.out.print(arr[b]+" ");}  //输出排序后
	}
}