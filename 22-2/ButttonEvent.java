import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

class  ButtonEvent
{
	//����ͼ�ν���
	private Frame F;
	private Button Bt;
	FrameDemo()
	{
		init();
	}
    public void init()
	{
		F = new Frame("My Frame");
		F.setBounds(300,300,300,300);//setBounds();��������ֵ�Ϳ�����
		F.setLayout(new FlowLayout());
		Bt = new Button("�˳�");
		F.add(Bt);
		myEvent();
		F.setVisible(true);
	}

	private void myEvent()
	{
		F.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		//�ð�ť�߱��˳�����Ĺ���
		/***
		��ť�����¼�Դ,��������������һ��û��������Adapter��
		***/
		Bt.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("��ť�ɵ�");
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) 
	{
		new FrameDemo();
	}
}