import java.io.*;
import java.util.*;
class DataStream
{
	public static void main(String[] args)throws IOException
	{
		writeData();  //д������
		readData();   //��ȡ����
	}

	public static void writeData()throws IOException
	{
		FileOutputStream FOS = new FileOutputStream("Demo.txt");
		DataOutputStream DOS = new DataOutputStream(FOS);
		
		DOS.writeInt(234);
		DOS.writeBoolean(true);
		DOS.writeDouble(456.234);
		DOS.writeUTF("��ã�");

		DOS.close();
	}

	public static void readData()throws IOException
	{
		//��������
		FileInputStream FIS = new FileInputStream("Demo.txt");
		DataInputStream DIS = new DataInputStream(FIS);
		
		//���ö�����
		int num = DIS.readInt();
		boolean flag = DIS.readBoolean();
		double d = DIS.readDouble();
		String str = DIS.readUTF();
		
		System.out.println(num);
		System.out.println(flag);
		System.out.println(d);
		System.out.println(str);
		
		DIS.close();
	}
}