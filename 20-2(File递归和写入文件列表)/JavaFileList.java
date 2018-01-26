/****
   ��ϰ����һ��ָ��Ŀ¼�µ�java�ļ��ľ���·���洢��һ���ı��ļ��С�
   ����һ��java�ļ��б�

   ˼·��
   ��1����ָ��Ŀ¼���еݹ�
   ��2����ȡ�ݹ����������java�ļ���·��
   ��3������Щ·���洢�������У�Collections��
   ��4���������е�����д�뵽һ���ļ���
****/
import java.io.*;
import java.util.*;

class JavaFileList
{
	public static void main(String[] args)throws IOException
	{
		/**1.��������**/
		File dir = new File("F:\\Javastudy\\20-1");//����һ��Ŀ¼
		List<String> list =new ArrayList<String>();  //����һ��ArrayList����
		
		/**2.����ִ��**/
		FileToList(dir,list);      //ִ�б���������������Щ�ļ�����list����
		WriteToFile(list);         //�������е�Ԫ��д��һ���µ��ı��ĵ���

		System.out.println(list.size());
	}

	public static void FileToList(File dir,List<String> list)
	{
		File[] files = dir.listFiles();
		for(File file : files)
		{
			if(file.isDirectory())
			{
				FileToList(file,list);  //�ݹ�
			}
			else
			{
				if(file.getName().endsWith(".java"))  //������ļ���׺����java�򽫸��ļ������ƺ�·����ӽ�list����
				{
					list.add(file.getName()+"---"+file.getAbsolutePath());
				}
			}
		}
	}
    
	public static void WriteToFile(List<String>list)throws IOException  //�������е�Ԫ��д��һ���µ��ı��ĵ���
	{
		//�����ַ�д����
		FileWriter FW = new FileWriter("F:\\JavaFileList.txt");
		//���뻺�漼��
		BufferedWriter BW = new BufferedWriter(FW);
		
		for(String s:list)   //������list���ϵ�Ԫ�أ�ע��Ӧ��String�ࣩ����ͨ���ַ�д����������Ԫ��д���ı��ĵ�
		{
			BW.write(s);
			BW.newLine();
			BW.flush();
		}
	}
}