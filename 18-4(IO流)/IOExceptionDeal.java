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
    ��һ�������ַ�����Reader��Writer��
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

	��������IOException�쳣�Ĵ���ʽ��

***/
import java.io.*;
import java.util.*;

class IOExceptionDeal
{
	public static void main(String[] agrs)throws IOException
	{
		FileWriter FW = null;
		try
		{
		    FW = new FileWriter("K:\\IOExceptionDeal.txt");   
		    /***ͨ���ַ�����������***/
		    FW.write("ABCDE");  //write(str); �����ַ���д����IO������
		    FW.flush();         //ˢ�¸�IO���Ļ��������������������ݴ浽Ŀ���ļ���ȥ
		    FW.write("GHIJK");
		    FW.flush();
		    FW.write("LMNOP");
		    FW.flush();
		    
		}
		catch (IOException IOE)
		{
			System.out.println("�����쳣:"+IOE.toString());
		}
		finally
		{
			/***���û�����쳣���ɹ�����IO�����ſɹرո�IO��***/
		    if(FW!=null)
			{FW.close();}
			System.out.println("OVER");
		}
	}
}