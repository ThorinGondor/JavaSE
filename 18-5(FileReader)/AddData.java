/***
    �������ļ�������д:
    new FileWriter("Add.txt",true);
***/
import java.io.*;
import java.util.*;
class AddData
{
	public static void main(String[] args)throws IOException
	{
		FileWriter FW = new FileWriter("Note.txt",true);  //����һ��true�������������Ḳ���Ѿ��е��ļ���
		//�������ͻ����ļ����Ѿ��е�ĩβ����д
		FW.write("---ADD\r");  //���Ҫ���У����� \r ���š�
		FW.flush();
	}
}