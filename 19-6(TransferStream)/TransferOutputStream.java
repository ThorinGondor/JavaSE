import java.io.*;
class TransferOutputStream
{
	public static void main(String[] args)throws IOException 
	{
		//����һ���ֽ�д����OutputStream
		OutputStream OS = new FileOutputStream("Demo.txt");
		//Ϊ���ܹ�ʹ��FileWriter��write(str);���ܣ����ｫ�ֽ�д����ת��Ϊ�ַ�д����:OutputStreamWriter
		OutputStreamWriter OSW = new OutputStreamWriter(OS);

		//��������������Ч�ʵĻ�����
		BufferedWriter BW = new BufferedWriter(OSW);
		BW.write("GoledenStateWarriors");
		BW.flush();
	}
}