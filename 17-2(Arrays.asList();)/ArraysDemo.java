/***
Arrays������:���ڲ�������Ĺ����ࡣ
���涼�Ǿ�̬������
     1. Arrays.asList(arr); ��������list���ϡ�
	  
	   ע��������ת���ɼ��ϵĺô����ڿ����ü��ϵ�˼��ͷ��������������е�Ԫ�ء�
	   �����Ժ��������Ҫ������������ʱ��Ӧת���ɼ����������ȽϺá�
	   ��Ϊ���鱾����������Ƚ��٣������������鷳�������Ϸ����ܶࡣ
	     
		 ע�⣺��������Arrays.asList();ת���ɼ���list�Ժ󣬿����õķ���Ϊ��
		   list.contains("XXX");
		   list.isEmpty();
		   list.get(3);
		   list.indexOf("XXX");
           list.subList();
		 �����ǲ�������ɾ������add("XXX"),remove(4);�������쳣
		
***/
import java.util.*;
class  ArraysDemo
{
	 public static void sop(Object o)
	{
		System.out.println(o);
	}
	public static void main(String[] args) 
	{
		String[] arr = {"A","B","C","D","E"};  //�½�һ��String���͵�����
		List<String> list = Arrays.asList(arr);//Arrays.asList(); ������ת����List����
        
		/**������ת���ɼ��ϵĺô����ڿ����ü��ϵ�˼��ͷ��������������е�Ԫ�ء�
		   �����Ժ��������Ҫ������������ʱ��Ӧת���ɼ����������ȽϺ�
		   ��Ϊ���鱾����������Ƚ��٣������������鷳�������Ϸ����ܶࡣ**/
		sop(list);
		sop(list.contains("C"));
		sop(list.isEmpty());
		sop(list.get(3));
		sop(list.indexOf("B"));
        /**
		ע�⣺��������Arrays.asList();ת���ɼ���list�Ժ󣬿����õķ���Ϊ��
		  list.contains("XXX");
		  list.isEmpty();
		  list.get(3);
		  list.indexOf("XXX");
          list.subList();
		�����ǲ�������ɾ������add("XXX"),remove(4);�������쳣
		**/

	}
   
}
