/****
   GUI: Graphic User Interface 图形用户接口，也即图形化界面。
    创建图形化界面：
    1.创建frame窗体并转为容器Container
    2.创建一系列组件，例如JLabel、JButton等
    3.对窗体进行基本设置
    4.让组件添加到窗体中
    5.让窗体显示setVisible();

	 事件监听机制的特点：
    1.事件源（图形界面的组件）
    2.事件（Event，每个事件源都有自己特有的对应事件和共性事件）
    3.监听器（将可以触发某一事件的动作都已经封装到了监听器中）
    ***以上三者在java中都已经定义好了，直接获取其对象来用即可，我们需要做的是产生的动作进行处理***
    4.事件处理
****/
import java.awt.*; //抽象窗口工具包，需调用本地系统方法实现功能，比较依赖于平台（跨平台能力比较弱），属于重量级控件
import javax.swing.*;//在Awt的基础上，建立的一套图形界面系统，提供了更多的组件，完全由java实现，增强了移植性，属于轻量级控件，可以实现彻底的跨平台。
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
		//创建窗体及其他一系列组件
		Frame F = new Frame("图形界面演示"); //创建一个窗体F
		Button Bt = new Button("点击此处");
		
		//执行功能----设计界面
		F.setLayout(new FlowLayout());//规定布局
		F.add(Bt);//添加组件
		F.setLocation(300,200);//尺寸
		F.setSize(300,300);//大小
		
        
		//执行功能----事件处理(关闭、开启、激活等功能)
		F.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.out.println("我关");  //点击关闭时引发的动作。
				System.exit(0);
			}

			public void windowActivated(WindowEvent e)
			{
				System.out.println("激活了");  //从窗口后置到窗口前置时引发的动作
			}
			public void windowOpened(WindowEvent e)
			{
				System.out.println("窗口启动！");  //窗口打开以后引发的动作
			}
		});
		F.setVisible(true);
	}
}
/*
class MyWin implements WindowListener
{
	//按道理应覆盖七个函数方法，可是我只用到了关闭的动作，但是仍必须覆写
}
//因为WinodowListener的子类WinodwAdapter已经实现了WindowListener接口
//并覆盖了其中所有的方法，那么只要继承自WindowAdapter方法覆盖所需的方法即可
*/
