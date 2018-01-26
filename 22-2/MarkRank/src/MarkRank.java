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
		//建立主窗体组件
		JF = new JFrame("成绩排名管理系统");
		Ct = JF.getContentPane();
		JL1=new JLabel("姓名：");
		JL2=new JLabel("成绩1");
		JL3=new JLabel("成绩2");
		JL4=new JLabel("成绩3");
		TF1 = new TextField(30);
		TF2 = new TextField(10);
		TF3 = new TextField(10);
		TF4 = new TextField(10);
		Bt = new Button("存储");
		Bt2 = new Button("显示排名");
		TA = new TextArea(20,40);
		//建立对话框组件
		//JD = new JDialog(JF,"输入非法！",true);
		//BtOK = new Button("OK");
		
		//设计图形界面
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
		
		//事件处理
		TreeSet<Student> TS = new TreeSet<Student>(new compareTool());
		MyEvent(TS);
		
		//可视化界面
		JF.setVisible(true);
		//JD.setVisible(false);
	}
	
	public static void MyEvent(TreeSet<Student> TS)
	{
		Bt.addMouseListener(new MouseAdapter() 
		{
			public void mouseClicked(MouseEvent ME)
			{
				ReadAdd(TS); //当鼠标点击“存储”按钮后进行的事件处理:读取文本内容,录入学生的姓名和成绩
				
			}
		});
		Bt2.addMouseListener(new MouseAdapter() 
		{
			public void mouseClicked(MouseEvent ME)
			{
				Print(TS);//当鼠标点击“显示排名”按钮后进行的事件处理：遍历TreeSet,输出学生排名
				
			}
		});
		TF1.addKeyListener(new KeyAdapter() //学生姓名文本框事件
		{
			public void keyPressed(KeyEvent KE)
			{
				int code = KE.getKeyCode();
				if(code>KeyEvent.VK_0 && code<KeyEvent.VK_9)
				{
					if(code!=KeyEvent.VK_BACK_SPACE)
					{
						System.out.println("输入非法！");
						KE.consume();  //禁止非法字符输入
					}
				}
			}
		});
		TF2.addKeyListener(new KeyAdapter() //成绩一文本框事件
		{
			public void keyPressed(KeyEvent KE)
			{
				int code = KE.getKeyCode();
				if(code<KeyEvent.VK_0||code>KeyEvent.VK_9)
				{
					if(code!=KeyEvent.VK_BACK_SPACE)
					{
						System.out.println("输入非法！");
						KE.consume();  //禁止非法字符输入
					}
				}
			}
		});
		TF3.addKeyListener(new KeyAdapter() //成绩二文本框
		{
			public void keyPressed(KeyEvent KE)
			{
				int code = KE.getKeyCode();
				if(code<KeyEvent.VK_0||code>KeyEvent.VK_9)
				{
					if(code!=KeyEvent.VK_BACK_SPACE)
					{
						System.out.println("输入非法！");
						KE.consume();  //禁止非法字符输入
					}
				}
			}
		});
		TF4.addKeyListener(new KeyAdapter() //成绩三文本框
		{
			public void keyPressed(KeyEvent KE)
			{
				int code = KE.getKeyCode();
				if(code<KeyEvent.VK_0||code>KeyEvent.VK_9)
				{
					if(code!=KeyEvent.VK_BACK_SPACE)
					{
						System.out.println("输入非法！");
						KE.consume();
					}
				}
			}
		});
	}
	
	public static void ReadAdd(TreeSet<Student> TS)//当鼠标点击按钮后进行的事件处理
	{
		String name = TF1.getText();   //获取文本框输入的姓名、成绩
		int Mark1 = Integer.parseInt(TF2.getText());
		int Mark2 = Integer.parseInt(TF3.getText());
		int Mark3 = Integer.parseInt(TF4.getText());
		TS.add(new Student(name,Mark1,Mark2,Mark3));  //将获取到的姓名和成绩输入到TreeSet当中形成新的对象，同时根据总分排序
		System.out.println(name+";"+Mark1+";"+Mark2+";"+Mark3);
		TF1.setText(null);  //获取完所有文本框的内容以后，清空所有文本框，以便下一轮输入
		TF2.setText(null);
		TF3.setText(null);
		TF4.setText(null);
	}
	public static void Print(TreeSet<Student> TS)//当鼠标点击按钮后进行的事件处理
	{
		TA.setText(null);  //输出新的排名前先把文本区域清零
		//遍历TreeSet输出
		Iterator<Student> it = TS.iterator();
		int rank=0;
		while(it.hasNext())
		{
			Student s = (Student)it.next();
			rank++;
			TA.append("第"+rank+"名----"+"姓名："+s.getName()+" 分数："+s.getSum()+"\r\n");
		}}

	public static void main(String[] args) 
	{
		new MarkRank();
	}

}
