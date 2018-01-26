/****
   GUI: Graphic User Interface ͼ���û��ӿڣ�Ҳ��ͼ�λ����档
    ����ͼ�λ����棺
    1.����frame���岢תΪ����Container
    2.����һϵ�����������JLabel��JButton��
    3.�Դ�����л�������
    4.�������ӵ�������
    5.�ô�����ʾsetVisible();

	 �¼��������Ƶ��ص㣺
    1.�¼�Դ��ͼ�ν���������
    2.�¼���Event��ÿ���¼�Դ�����Լ����еĶ�Ӧ�¼��͹����¼���
    3.�������������Դ���ĳһ�¼��Ķ������Ѿ���װ���˼������У�
    ***����������java�ж��Ѿ�������ˣ�ֱ�ӻ�ȡ��������ü��ɣ�������Ҫ�����ǲ����Ķ������д���***
    4.�¼�����
****/
import java.awt.*; //���󴰿ڹ��߰�������ñ���ϵͳ����ʵ�ֹ��ܣ��Ƚ�������ƽ̨����ƽ̨�����Ƚ������������������ؼ�
import javax.swing.*;//��Awt�Ļ����ϣ�������һ��ͼ�ν���ϵͳ���ṩ�˸�����������ȫ��javaʵ�֣���ǿ����ֲ�ԣ������������ؼ�������ʵ�ֳ��׵Ŀ�ƽ̨��
import java.awt.event.*;
import java.util.*;
import java.io.*;

class FrameEvent
{
	public static void main(String[] args)
	{
		new JFrameDesign().createGUI();
	}
}

class JFrameDesign extends JFrame
{
	public static void createGUI()
	{
		//�������弰����һϵ�����
		Frame F = new Frame("ͼ�ν�����ʾ"); //����һ������F
		Button Bt = new Button("����˴�");
		
		//ִ�й���----��ƽ���
		F.setLayout(new FlowLayout());//�涨����
		F.add(Bt);//������
		F.setLocation(300,200);//�ߴ�
		F.setSize(300,300);//��С
		
        
		//ִ�й���----�¼�����(�رա�����������ȹ���)
		F.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.out.println("�ҹ�");  //����ر�ʱ�����Ķ�����
				System.exit(0);
			}

			public void windowActivated(WindowEvent e)
			{
				System.out.println("������");  //�Ӵ��ں��õ�����ǰ��ʱ�����Ķ���
			}
			public void windowOpened(WindowEvent e)
			{
				System.out.println("����������");  //���ڴ��Ժ������Ķ���
			}
		});
		F.setVisible(true);
	}
}
/*
class MyWin implements WindowListener
{
	//������Ӧ�����߸�����������������ֻ�õ��˹رյĶ����������Ա��븲д
}
//��ΪWinodowListener������WinodwAdapter�Ѿ�ʵ����WindowListener�ӿ�
//���������������еķ�������ôֻҪ�̳���WindowAdapter������������ķ�������
*/
