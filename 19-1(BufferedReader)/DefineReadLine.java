
/***
   BufferedReader ��readLine()�ķ�������Ժ󣬿����Զ���һ�����а���һ�����ܺ�readLineһ�£���ģ��һ��BufferedReader
   ע��Jva�Դ���BufferedReader�����Զ����MyBufferedReader��ʹ��װ����ķ�����װ�ε���FileReader����ǿ�书��
***/
import java.io.*;
import java.util.*;
//�Զ���MyBufferedReader����������BufferedReader����
class MyBufferedReader
{
	private FileReader FR;
	MyBufferedReader(FileReader FR)
	{
		this.FR=FR;
	}

	//����һ�ζ�ȡһ�еķ���
	public String MyReadLine()throws IOException
	{
		//����һ����ʱ������װ�ַ����飬Ϊ��ʾ���㶨��һ��StringBuilder����
		StringBuilder SB = new StringBuilder(); //����
		int ch = 0;
		while((ch=FR.read())!=-1)
		{
			if(ch=='\r'){continue;}
			if(ch=='\n'){return SB.toString();}
			else{SB.append((char)ch);}  //���ݼ��������
		}
		return null;
	}
    //�رյķ���
	public void close()throws IOException
	{
		FR.close();
	}
}

class  DefineReadLine
{
	public static void main(String[] args)throws IOException 
	{
		FileReader FR = new FileReader("Demo.txt");
		MyBufferedReader MBF = new MyBufferedReader(FR);
        while(true)
		{
			String str = MBF.MyReadLine();
			if(str==null){break;}
			System.out.println(str);
		}
	}
}
