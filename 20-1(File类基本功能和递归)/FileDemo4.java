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
   
   ������ʾ:
       �г�ָ��Ŀ¼�µ��ļ������ļ��У�������Ŀ¼������
	   Ҳ����ָ��Ŀ¼����������

	   ��ΪĿ¼�л���Ŀ¼��ֻҪʹ��ͬһ���г�Ŀ¼���ܵĺ�����ɼ��ɣ�dir.listFile();
	   ���г������г��ֵĻ���Ŀ¼�Ļ����ٴε��øú������ܼ��ɡ�
	   Ҳ���Ǻ�����������������ֱ��ַ�ʽ���ǵصݹ�
***/
import java.io.*;
class FileDemo4 
{
	public static void main(String[] args) 
	{
		File dir = new File("F:\\Javastudy\\20-1");
		ShowDir(dir);
	}

	public static void ShowDir(File dir)
	{
		File[] files = dir.listFiles();
		for(int x=0;x<files.length;x++)
		{
			if(files[x].isDirectory())
			{ShowDir(files[x]);}  //�������������ļ��У����ٴε��øú�������ȡ���ļ����µ������ļ�
			else
			{System.out.println(files[x]);}
		}
	}
}
