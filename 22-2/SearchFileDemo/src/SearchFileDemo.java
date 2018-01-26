/***
 �����������һ��ͼ�ν��棬����������һ��·������Ȼ����������ť���������ı���������ʾ��·���µ������ļ���
 ***/
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.File;

public class SearchFileDemo 
{
	private static JFrame JF;
	private static Button Bt;
	private static Container Ct;
	private static TextField TF;
	private static TextArea TA;
	SearchFileDemo()
	{
		initialize();
	}
	public static void initialize()
	{
		//������������
		JF = new JFrame("����Ŀ¼�µ��ļ�");
		Ct = JF.getContentPane();
		Bt = new Button("����");
		TF = new TextField(30);
		TA = new TextArea(20,40);
		
		//ִ�й��ܣ����ͼ�ν���
		Ct.add(TF);
		Ct.add(Bt);
		Ct.add(TA);
		Ct.setBackground(Color.ORANGE);
		JF.setLayout(new FlowLayout());
		JF.setBounds(300,300,400,400);
		
		//�¼�����
		MyEvent();
		//��Ϊ���ӻ�
		JF.setVisible(true);
	}
	
	public static void MyEvent() 
	{
		Bt.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent AE)
			{
				ReadAndWrite();
			}
		});
		
		TF.addKeyListener(new KeyAdapter() 
		{
			public void keyPressed(KeyEvent KE)
			{
				int code = 0;
				code = KE.getKeyCode();
				if(code==KeyEvent.VK_ENTER)
				{
					ReadAndWrite();
				}
			}
		});
	}
	
	public static void ReadAndWrite()
	{
		String dirPath = TF.getText();  //�����ť�Ժ󣬽��ж�ȡ�ı���TF���ı��¼�����  ��ȡ�ı����ķ�����TF.getText();
		
		//����File�����dir����·��������dirPath
		File dir =new File(dirPath);
		TA.setText(null);
		if(dir.isDirectory())  //�ж��Ƿ�Ϊ�Ϸ�Ŀ¼
		{
		    //�������������洢dirPath��ȡ�����ļ�����
		    String[] buffers = dir.list();
		    //�����û���������
		    for(String buffer:buffers)
		    {
			    TA.append(buffer+"\r\n"); //����������д���ı�����
		    }
		}
		else
		{
			TA.setText("·���Ƿ������������룡");
		}
	}
	
	public static void main(String[] args) 
	{
		new SearchFileDemo();
	}

}