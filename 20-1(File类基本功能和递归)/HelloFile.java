/***
   File�������
   ��1�����ڽ��ļ����ļ��з�װ�ɶ���
   ��2��������ļ������ļ��е�������Ϣ���в�����
   ��3��File���������Ϊ�������ݸ����Ĺ��캯����
   1.������
        file.createNewFile();
   2.ɾ��:
        file.delete();
		file.deleteOnExit();
   3.�ж�:
        file.exists();
		file.isAbsolute();  //�ж��Ƿ�Ϊ����·����
		file.canRead();
		gilr.canWrite();
   4.��ȡ��Ϣ��
        file.getName();
	    file.length();
		file.getAbsoultePath();
		file.getParent();   //��ȡ�丸��·��
		
***/
import java.io.*;
class  HelloFile
{
	public static void main(String[] args) throws IOException
	{
		CreateFile();
	}

	public static void CreateFile()throws IOException
	{
		File file = new File("Word.txt");  //��Word.txt��װ��file����
		sop("created?---"+file.createNewFile());         //�������ı��ļ��������booleanֵ����Ϊfalse��˵���Ѿ����ڸ��ļ�����Ϊtrue���������ɹ�
		sop("exists?---"+file.exists());                //�ж��Ƿ���ڸ��ı��ļ�,Ҳ��booleanֵ
		sop("Name?---"+file.getName());               //��ȡ���ı��ļ�������
		sop("path?---"+file.getAbsolutePath());       //��ȡ���ı��ļ��ľ���·��
        //sop("deleted?---"+file.delete());                //ɾ�����ı��ļ���������booleanֵ
		
	}

	public static void sop(Object o)
	{
		System.out.println(o);
	}
}
