import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SearchFileDemo2 
{
	private static JFrame JF;
	private static Container Ct;
	private static Button Bt;
	private static TextField TF;
	private static TextArea TA;
	SearchFileDemo2()
	{
		Initialize();
	}
	public void Initialize()
	{
		//�������
		JF = new JFrame("�����ļ�");
		Ct = JF.getContentPane();
		Bt = new Button("ת��");
		TF = new TextField(30);
		TA = new TextArea(20,40);
		
		//ִ�й��ܣ����ͼ�ν���
		JF.setBounds(400,400,400,400);
		JF.setLayout(new FlowLayout());
		Ct.add(TF);
		Ct.add(Bt);
		Ct.add(TA);
		
		//�¼�����
		MyEvent();
		
		//������=������ӻ�
		JF.setVisible(true);
	}
	
	public static void MyEvent()
	{
		Bt.addMouseListener(new MouseAdapter() 
		{
			public void mouseClicked(MouseEvent ME)
			{
				Deal();
			}
		});
		TF.addKeyListener(new KeyAdapter() 
		{
			public void keyPressed(KeyEvent KE)
			{
				int code = KE.getKeyCode();
				if(code==KeyEvent.VK_ENTER)
				{Deal();}
			}
		});
	}
	
	public static void Deal()
	{
		TA.setText(null);
		String dirPath = TF.getText();
		File dir = new File(dirPath);
		if(dir.isDirectory())
		{
			String[] buffers = dir.list();
			for(String buffer:buffers)
			{
				TA.append(buffer+"\r\n");
			}
		}
		else
		{
			TA.setText("����Ƿ������������룡");
		}
	}

	public static void main(String[] args) 
	{
		new SearchFileDemo2();
	}

}