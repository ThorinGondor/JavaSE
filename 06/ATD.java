class ATD
{
	public static void main(String[] args)
	{
		int[] arr = {4,78,26,56,90,85,18,7,3};
		AT.printArr(arr);
		
		AT t = new AT();

		/***************/

		t.printArr(arr);
		t.getMax(arr);
		t.getMin(arr);

		t.paixu(arr);

		t.printArr(arr);
		t.getMax(arr);
		t.getMin(arr);

	}
}