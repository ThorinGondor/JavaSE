/****
    ������ʾmp3�ļ��ĸ��ƣ���Ҫͨ����������
	BufferedOutputStream();
	BufferedInputStream();
****/
import java.io.*;
class CopyMedia
{
	public static void main(String[] args)throws IOException 
	{
		long start = System.currentTimeMillis();
		COPY();
		long end = System.currentTimeMillis();
		System.out.println(start+"---"+end);
	}

	public static void COPY()throws IOException
    {
		//�����ֽ�����ȡд����
		FileInputStream FIS = new FileInputStream("F:\\ӣ����.mp3");
		FileOutputStream FOS = new FileOutputStream("F:\\ӣ��������.mp3");
        
		//���뽨�����漼��
		BufferedInputStream BIS = new BufferedInputStream(FIS);
		BufferedOutputStream BOS = new BufferedOutputStream(FOS);
		//�����������������㲻���ٽ�������������������

		while(true)
		{
			int ch = BIS.read(); //��ʽ��ȡ����
			if(ch==-1){break;}   //����ѭ��
			BOS.write((char)ch); //д������
		}
		BIS.close();
		BOS.close();
	}
}