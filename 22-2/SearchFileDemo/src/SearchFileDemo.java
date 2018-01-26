/***
 本题需求：设计一个图形界面，功能是输入一个路径名，然后点击搜索按钮，可以在文本区域在显示该路径下的所有文件。
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
		//创建窗体和组件
		JF = new JFrame("搜索目录下的文件");
		Ct = JF.getContentPane();
		Bt = new Button("搜索");
		TF = new TextField(30);
		TA = new TextArea(20,40);
		
		//执行功能，设计图形界面
		Ct.add(TF);
		Ct.add(Bt);
		Ct.add(TA);
		Ct.setBackground(Color.ORANGE);
		JF.setLayout(new FlowLayout());
		JF.setBounds(300,300,400,400);
		
		//事件处理
		MyEvent();
		//设为可视化
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
		String dirPath = TF.getText();  //点击按钮以后，进行读取文本区TF的文本事件处理  读取文本区的方法是TF.getText();
		
		//建立File类对象dir，将路径名存入dirPath
		File dir =new File(dirPath);
		TA.setText(null);
		if(dir.isDirectory())  //判断是否为合法目录
		{
		    //建立缓冲区，存储dirPath获取到的文件名称
		    String[] buffers = dir.list();
		    //遍历该缓冲区即可
		    for(String buffer:buffers)
		    {
			    TA.append(buffer+"\r\n"); //将缓冲数据写入文本区域
		    }
		}
		else
		{
			TA.setText("路径非法！请重新输入！");
		}
	}
	
	public static void main(String[] args) 
	{
		new SearchFileDemo();
	}

}
