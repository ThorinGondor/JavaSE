import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class MarkRank 
{
	private static JFrame JF;
	private static Container Ct;
	private static JLabel JL1;
	private static JLabel JL2;
	private static JLabel JL3;
	private static JLabel JL4;
	private static TextField TF1;
	private static TextField TF2;
	private static TextField TF3;
	private static TextField TF4;
	private static Button Bt ;
	private static Button Bt2 ;
	private static TextArea TA;
	
	//private static JDialog JD;
	//private static Button BtOK;
	MarkRank()
	{
		initialize();
	}
	public void initialize()
	{
		//�������������
		JF = new JFrame("�ɼ���������ϵͳ");
		Ct = JF.getContentPane();
		JL1=new JLabel("������");
		JL2=new JLabel("�ɼ�1");
		JL3=new JLabel("�ɼ�2");
		JL4=new JLabel("�ɼ�3");
		TF1 = new TextField(30);
		TF2 = new TextField(10);
		TF3 = new TextField(10);
		TF4 = new TextField(10);
		Bt = new Button("�洢");
		Bt2 = new Button("��ʾ����");
		TA = new TextArea(20,40);
		//�����Ի������
		//JD = new JDialog(JF,"����Ƿ���",true);
		//BtOK = new Button("OK");
		
		//���ͼ�ν���
		JF.setBounds(400, 400, 780, 400);
		JF.setLayout(new FlowLayout());
		Ct.add(JL1);
		Ct.add(TF1);
		Ct.add(JL2);
		Ct.add(TF2);
		Ct.add(JL3);
		Ct.add(TF3);
		Ct.add(JL4);
		Ct.add(TF4);
		Ct.add(Bt);
		Ct.add(Bt2);
		Ct.add(TA);
		//JD.setBounds(400,400,100,100);
		//JD.add(BtOK);
		//JD.setLayout(new FlowLayout());
		
		//�¼�����
		TreeSet<Student> TS = new TreeSet<Student>(new compareTool());
		MyEvent(TS);
		
		//���ӻ�����
		JF.setVisible(true);
		//JD.setVisible(false);
	}
	
	public static void MyEvent(TreeSet<Student> TS)
	{
		Bt.addMouseListener(new MouseAdapter() 
		{
			public void mouseClicked(MouseEvent ME)
			{
				ReadAdd(TS); //����������洢����ť����е��¼�����:��ȡ�ı�����,¼��ѧ���������ͳɼ�
				
			}
		});
		Bt2.addMouseListener(new MouseAdapter() 
		{
			public void mouseClicked(MouseEvent ME)
			{
				Print(TS);//�����������ʾ��������ť����е��¼�����������TreeSet,���ѧ������
				
			}
		});
		TF1.addKeyListener(new KeyAdapter() //ѧ�������ı����¼�
		{
			public void keyPressed(KeyEvent KE)
			{
				int code = KE.getKeyCode();
				if(code>KeyEvent.VK_0 && code<KeyEvent.VK_9)
				{
					if(code!=KeyEvent.VK_BACK_SPACE)
					{
						System.out.println("����Ƿ���");
						KE.consume();  //��ֹ�Ƿ��ַ�����
					}
				}
			}
		});
		TF2.addKeyListener(new KeyAdapter() //�ɼ�һ�ı����¼�
		{
			public void keyPressed(KeyEvent KE)
			{
				int code = KE.getKeyCode();
				if(code<KeyEvent.VK_0||code>KeyEvent.VK_9)
				{
					if(code!=KeyEvent.VK_BACK_SPACE)
					{
						System.out.println("����Ƿ���");
						KE.consume();  //��ֹ�Ƿ��ַ�����
					}
				}
			}
		});
		TF3.addKeyListener(new KeyAdapter() //�ɼ����ı���
		{
			public void keyPressed(KeyEvent KE)
			{
				int code = KE.getKeyCode();
				if(code<KeyEvent.VK_0||code>KeyEvent.VK_9)
				{
					if(code!=KeyEvent.VK_BACK_SPACE)
					{
						System.out.println("����Ƿ���");
						KE.consume();  //��ֹ�Ƿ��ַ�����
					}
				}
			}
		});
		TF4.addKeyListener(new KeyAdapter() //�ɼ����ı���
		{
			public void keyPressed(KeyEvent KE)
			{
				int code = KE.getKeyCode();
				if(code<KeyEvent.VK_0||code>KeyEvent.VK_9)
				{
					if(code!=KeyEvent.VK_BACK_SPACE)
					{
						System.out.println("����Ƿ���");
						KE.consume();
					}
				}
			}
		});
	}
	
	public static void ReadAdd(TreeSet<Student> TS)//���������ť����е��¼�����
	{
		String name = TF1.getText();   //��ȡ�ı���������������ɼ�
		int Mark1 = Integer.parseInt(TF2.getText());
		int Mark2 = Integer.parseInt(TF3.getText());
		int Mark3 = Integer.parseInt(TF4.getText());
		TS.add(new Student(name,Mark1,Mark2,Mark3));  //����ȡ���������ͳɼ����뵽TreeSet�����γ��µĶ���ͬʱ�����ܷ�����
		System.out.println(name+";"+Mark1+";"+Mark2+";"+Mark3);
		TF1.setText(null);  //��ȡ�������ı���������Ժ���������ı����Ա���һ������
		TF2.setText(null);
		TF3.setText(null);
		TF4.setText(null);
	}
	public static void Print(TreeSet<Student> TS)//���������ť����е��¼�����
	{
		TA.setText(null);  //����µ�����ǰ�Ȱ��ı���������
		//����TreeSet���
		Iterator<Student> it = TS.iterator();
		int rank=0;
		while(it.hasNext())
		{
			Student s = (Student)it.next();
			rank++;
			TA.append("��"+rank+"��----"+"������"+s.getName()+" ������"+s.getSum()+"\r\n");
		}}

	public static void main(String[] args) 
	{
		new MarkRank();
	}

}