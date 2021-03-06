package MenuDemo;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;

class MenuDemo
{
	private static JFrame JF;
	private static Container Ct;
    private static MenuBar MB;  //菜单祖
	private static Menu M;  //菜单栏
	private static Menu SubMenu;  //创建一个副菜单栏
	private static MenuItem MI0; //菜单里的各个组件
	private static MenuItem MI1;
	private static MenuItem MI2;
	private static MenuItem MI3;

	MenuDemo()  //初始化
	{
		Initialize();
	}
	public static void Initialize()
	{
		//建立对象
		JF = new JFrame("对话框Dialog演示");
		Ct = JF.getContentPane();
		MB = new MenuBar();
		M = new Menu("开始");
		SubMenu = new Menu("打开");
		MI0 = new MenuItem("文件");
		MI1 = new MenuItem("编辑");
		MI2 = new MenuItem("退出");
		MI3 = new MenuItem("子栏目");
		
		//设计主窗体图形界面
		JF.setBounds(300,300,500,600);
		JF.setMenuBar(MB);
		MB.add(M);
		M.add(SubMenu);
		M.add(MI0);
		M.add(MI1);
		M.add(MI2);
		SubMenu.add(MI3);
		//事件处理
		MyEvent();
		//可视化
		JF.setVisible(true);
	}
	public static void MyEvent()
	{
		MI2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent AE)
			{
				System.exit(0);
			}
		});
	}
	public static void main(String[] args) 
	{
		new MenuDemo();
	}
}
