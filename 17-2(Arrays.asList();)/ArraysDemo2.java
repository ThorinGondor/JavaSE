/***
Arrays������:���ڲ�������Ĺ����ࡣ
���涼�Ǿ�̬������
     1. Arrays.asList(arr); ��������list���ϡ�
	  
	   ע��������ת���ɼ��ϵĺô����ڿ����ü��ϵ�˼��ͷ��������������е�Ԫ�ء�
	   �����Ժ��������Ҫ������������ʱ��Ӧת���ɼ����������ȽϺá�
	   ��Ϊ���鱾�����������Ƚ��٣������������鷳�������Ϸ����ܶࡣ
	     
		 ע�⣺��������Arrays.asList();ת���ɼ���list�Ժ󣬿����õķ���Ϊ��
		   list.contains("XXX");
		   list.isEmpty();
		   list.get(3);
		   list.indexOf("XXX");
           list.subList();
		 �����ǲ�������ɾ������add("XXX"),remove(4);�������쳣
		
***/
import java.util.*;
class  ArraysDemo2
{
	 public static void sop(Object o)
	{
		System.out.println(o);
	}
	public static void main(String[] args) 
	{
		int[] arr1 = {3,2,8,6,0,5,4,9};         //����һ��int���͵�����
		List<int[]> list1 = Arrays.asList(arr1); //������ת��Ϊ���ϵ�����
		sop(list1);                              //��ʱ�����ȴ������������Ϊһ�������ɵĹ�ϣֵ

		/**�������Ӧ������ƣ�����**/
		Integer[] arr2 = {3,2,8,6,0,5,4,9};
		List<Integer> list2 = Arrays.asList(arr2);
		sop(list2);                          //��ʱ���������
	}
   
}