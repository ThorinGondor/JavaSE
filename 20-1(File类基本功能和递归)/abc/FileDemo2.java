/***
   File�������
   ��1�����ڽ��ļ����ļ��з�װ�ɶ���
   ��2��������ļ������ļ��е�������Ϣ���в�����
   ��3��File���������Ϊ�������ݸ����Ĺ��캯����
   1.������
        file.createNewFile(); ����һ���ļ�
		file.mkdirs(); ���ڴ����༶�ļ���
   2.ɾ��:
        file.delete();
		file.deleteOnExit();
   3.�ж�:
        file.exists();
   4.��ȡ��Ϣ��
         file.getName();
		 file.length();
		 file.getAbsoultePath();
		 file.getParent();
		 file.isHidden();
   
   ������ʾ��λ�ȡһϵ�е��ļ��б�
         File.listRoots();
         file.list(); 
***/

import java.io.*;
class FileDemo2 
{
	public static void main(String[] args) 
	{
		listRootsDemo();
		Demo2();
	}

	public static void listRootsDemo()
	{
		Object[] objs = File.listRoots(); //��ʽ���÷�������ָʾ���õ��ļ�ϵͳ�ĸ��ļ���������顣
		for(Object o:objs)
		{
			System.out.println(o);
		}
	}

	public static void Demo2()
	{
		File file = new File("F:\\");  //����list����ʱ��file���������һ��Ŀ¼����Ŀ¼���������
		Object[] objs2 = file.list(); //��ʽ���÷������Ի�ȡ��·�������е��ļ��ж���
		for(Object o2:objs2)
		{
			System.out.println(o2);
		}
	}
}
