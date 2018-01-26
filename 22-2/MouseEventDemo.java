import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MouseEventDemo
{
	private Frame F;
	private Button Bt1;
	private Button Bt2;
	private Button Bt3;
	MouseEventDemo()
	{
		init();  //��ʼ��
	}
	public void init()
	{
		//��������
		F = new Frame("����¼�����");
		Bt1 = new Button("�˳�");
		Bt2 = new Button("����������˳�");
		Bt3 = new Button("���˫���˳�");
		//ִ�й���---��ƴ���
		F.setBounds(300,300,300,300);
		F.setLayout(new FlowLayout());
		F.add(Bt1);
		F.add(Bt2);
		F.add(Bt3);
        //�¼�����1������رգ�
		F.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent WE)
			{
				System.exit(0);
			}
			public void windowOpened(WindowEvent WE)
			{
				System.out.println("������������");
			}
		});
		//�¼�����2---��ťactionPerforme
		Bt1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent AE)
			{
				System.out.println("��ť�ɵģ�");
				System.exit(0);
			}
		});
		//�¼�����3---���mouseEntered
        Bt2.addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent ME)
			{
				System.out.println("��������ˣ�");
				System.exit(0);
			}
		});
		//�¼�����4---���˫��
		Bt3.addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent ME)
			{
				System.out.println("����ѽ��룡");
			}
			public void mouseClicked(MouseEvent ME)
			{
				System.out.println(ME.getClickCount());  //getClickCount();ֻ��������ʱ�����Ż᲻�ϼ�����ר�ż�¼�Ƿ�Ϊ˫����������
				if(ME.getClickCount()==2){System.exit(0);}
			}
		});
		//���ӻ�����
		F.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new MouseEventDemo();
	}
}