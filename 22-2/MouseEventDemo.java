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
		init();  //初始化
	}
	public void init()
	{
		//创建对象
		F = new Frame("鼠标事件处理");
		Bt1 = new Button("退出");
		Bt2 = new Button("鼠标碰到就退出");
		Bt3 = new Button("鼠标双击退出");
		//执行功能---设计窗体
		F.setBounds(300,300,300,300);
		F.setLayout(new FlowLayout());
		F.add(Bt1);
		F.add(Bt2);
		F.add(Bt3);
        //事件处理1（窗体关闭）
		F.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent WE)
			{
				System.exit(0);
			}
			public void windowOpened(WindowEvent WE)
			{
				System.out.println("主窗体启动！");
			}
		});
		//事件处理2---按钮actionPerforme
		Bt1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent AE)
			{
				System.out.println("按钮干的！");
				System.exit(0);
			}
		});
		//事件处理3---鼠标mouseEntered
        Bt2.addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent ME)
			{
				System.out.println("鼠标碰到了！");
				System.exit(0);
			}
		});
		//事件处理4---鼠标双击
		Bt3.addMouseListener(new MouseAdapter()
		{
			public void mouseEntered(MouseEvent ME)
			{
				System.out.println("鼠标已进入！");
			}
			public void mouseClicked(MouseEvent ME)
			{
				System.out.println(ME.getClickCount());  //getClickCount();只有在连击时，它才会不断计数，专门记录是否为双击甚至更多
				if(ME.getClickCount()==2){System.exit(0);}
			}
		});
		//可视化处理
		F.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new MouseEventDemo();
	}
}
