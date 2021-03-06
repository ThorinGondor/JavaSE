package MyMenu;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.io.*;

class MenuOpenFile
{
	private static JFrame JF;
	private static Container Ct;
    private static MenuBar MB;  //菜单祖
	private static Menu M;  //菜单栏
	private static MenuItem MI0; //菜单里的各个组件
	private static MenuItem MI1;
	private static MenuItem MI2;

	private static FileDialog FD1;
	private static FileDialog FD2;

	private static TextArea TA;
	private static TextArea TA2;

	MenuOpenFile()  //初始化
	{
		File file = null;
		Initialize(file);
	}
	public static void Initialize(File file)
	{
		//建立对象
		JF = new JFrame("对话框Dialog演示");
		Ct = JF.getContentPane();
		MB = new MenuBar();
		M = new Menu("开始");
		TA = new TextArea(30,30);
		TA2 = new TextArea(30,30);
		
		MI0 = new MenuItem("打开");
        MI1 = new MenuItem("保存");
		MI2 = new MenuItem("退出");

		FD1 = new FileDialog(JF,"我要打开",FileDialog.LOAD);
		FD2 = new FileDialog(JF,"我要保存",FileDialog.SAVE);
		
		//设计主窗体图形界面
		JF.setBounds(300,300,500,600);
		JF.setLayout(new FlowLayout());
		JF.setMenuBar(MB);
		JF.add(TA);
		JF.add(TA2);
		MB.add(M);
		M.add(MI0);
		M.add(MI1);
		M.add(MI2);
		
		//事件处理
		MyEvent(file);
		//可视化
		JF.setVisible(true);
	}

	public static void MyEvent(File file)
	{
		MI0.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent AE)
			{
				ReadAndWrite(file);	//打开文本文件，并将文本的内容读取在右边文本区域TA2上，同时将该内容写入到Storage文件夹的文本
			}
		});
        
		MI1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent AE)
			{
				Store(file);  //将右边文本区域TA2输入的内容写入想要存的路径以及路径下的文本
			}
		});
		
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
		new MenuOpenFile();
	}
	
	public static void ReadAndWrite(File file)
	{
		FD1.setVisible(true);  //文件浏览对话框启动
		String dirPath = FD1.getDirectory();
		String FileName = FD1.getFile();
		file =new File(dirPath,FileName);
		if(dirPath==null||FileName==null) //如果用户没有打开任何文件点了取消，则为null，程序直接返回，结束事件处理
		{return;}
		else
		TA.append("您打开的文件路径是："+dirPath+"文件名称是："+FileName+"\r\n");
		try
		{
			TA2.setText(null);
			
			FileReader FR = new FileReader(file);
			BufferedReader BR = new BufferedReader(FR);
			FileWriter FW = new FileWriter(new File("G:\\Storage",FileName));
			BufferedWriter BW = new BufferedWriter(FW);
		    while(true)
			{
				String str = BR.readLine();
				if(str==null){break;}
				TA2.append(str+"\r\n");
			    BW.write(str);
			    BW.newLine();
			    BW.flush();
			}
		}
		catch (IOException IOE)
		{
			throw new RuntimeException("读取失败！");
		}
	}
	public static void Store(File file)
	{
		if(file==null)
		{
			FD2.setVisible(true);
		    String dirPath = FD2.getDirectory();
		    String FileName = FD2.getFile();
		    if(dirPath==null||FileName==null)
		    {return;}
			file = new File(dirPath,FileName);
		}
		try
		{
			FileWriter FW = new FileWriter(file);
			BufferedWriter BW = new BufferedWriter(FW);
			String str = TA2.getText();
			BW.write(str);
			BW.flush();
		}
		catch (IOException IOE)
		{
			throw new RuntimeException("写入失败");
		}
		
	}
}
