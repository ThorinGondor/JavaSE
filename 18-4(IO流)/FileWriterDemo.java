/***
   IO��������
   ��1��IO���ɴ����豸֮������ݴ��䡣
   ��2��Java���ڲ������Ķ�����IO���С�
   ��3�����������ݷ�Ϊ���֣��ֽ������ַ�����
   ��4�������������Ϊ���������������

   IO�����û��ࣺ
   ��1���ֽ��������������ࣺInputStream��OutputStream
    (2) �ַ����������ࣺReader��Writer
***/
/***
    ���������ַ�����Reader��Writer��
    ���Բ����ļ�Ϊ������ʾ��
	������Ӳ���ϴ���һ���ļ���д��һЩ�������ݣ�

	��һ��ר�����ڲ����ļ���Writer�������FileWriter
	������д�뷽����
	FileWriter FW = new FileWriter("Diary.txt"); 
	FW.writre(str);
	FW.flush();
	FW.write(str);
	FW.flush();
	.......
	FW.close();
***/
import java.io.*;
import java.util.*;
class FileWriterDemo
{
	public static void main(String[] agrs)throws IOException
	{
		//����һ��FileWriter���󣬸ö����ʼ��ʱ�ͱ���Ҫ��ȷ���������ļ� 
		FileWriter FW = new FileWriter("Diary.txt");   //�������ܴ�����һ��txt�ļ�
		
		/***ͨ���ַ�����������***/
		FW.write("ABCDE");  //write(str); �����ַ���д����IO������
		FW.flush();         //ˢ�¸�IO���Ļ��������������������ݴ浽Ŀ���ļ���ȥ
		FW.write("GHIJK");
		FW.flush();
		FW.write("LMNOP");
		FW.flush();
		/***�رո�IO��***/
		FW.close();
	}
}