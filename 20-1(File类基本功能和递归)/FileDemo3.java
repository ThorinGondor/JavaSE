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

class FileDemo3 
{
	public static void main(String[] args) 
	{
		Run();
	}

	public static void Run()
	{
		File dir = new File("F:\\Javastudy\\20-1");
		Object[] objs = dir.list(new FilenameFilter()
			{
			public boolean accept(File dir,String name)
				{
					return name.endsWith(".java");//��������ֻ��ȡ�����׺���ļ�
			    }
		    }
		);  //dir.list(new FilenameFilter(){xxx});

		for(Object o :objs)
		{
			System.out.println(o);
		}
	}
}
