import java.io.*;
class CopyPicture
{
	public static void main(String[] args)throws IOException
	{
		COPY();
	}
	public static void COPY()throws IOException
	{
		FileInputStream FIS = new FileInputStream("F:\\���ջ���15.jpg"); //������ȡ�ֽ���
		//���������������ⴴ�����黺����
		BufferedInputStream BIS = new BufferedInputStream(FIS);
        
		FileOutputStream FOS = new FileOutputStream("F:\\���ջ��븱��.jpg"); //����д���ֽ���
		BufferedOutputStream BOS = new BufferedOutputStream(FOS);
		
		System.out.println("����ͼƬ������...");
		//��ȡ��д��
		while(true)
		{
			int ch = BIS.read();
			if(ch==-1){break;}
			BOS.write((char)ch);
			BOS.flush();
		}
        System.out.println("���������");
		//�ر�
		BIS.close();
		BOS.close();
	}
}