import java.util.*;
import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class FileManage 
{
/***************图形化界面********************/
	private static JFrame JF;
	private static Container Ct;
	private static TextArea TA1;
	private static TextArea TA2;
	private static TextArea TA3;
	private static FileDialog FD1;
	private static FileDialog FD2;
	private static MenuBar MB;
	private static Menu M;
	private static MenuItem MI0;
	private static MenuItem MI1;
	
	FileManage()
	{
		initialize();
	}
	
	public static void initialize()
	{
		JF = new JFrame("文件管理系统");
		Ct = JF.getContentPane();
		TA1 = new TextArea(30,30);
		TA2 = new TextArea(30,30);
		TA3 = new TextArea(30,30);
		FD1 = new FileDialog(JF,"打开文件",FD1.LOAD);
		FD2 = new FileDialog(JF,"保存文件",FD2.SAVE);
		MB = new MenuBar();
		M = new Menu("文件");
		MI0 = new MenuItem("打开文件");
		MI1 = new MenuItem("保存文件");
		
		JF.setLayout(new FlowLayout());
		JF.setBounds(500,500,750,600);
		JF.setMenuBar(MB);
		MB.add(M);
		M.add(MI0);
		M.add(MI1);
		Ct.add(TA1);
		Ct.add(TA2);
		Ct.add(TA3);
		
		MyEvent();
		
		JF.setVisible(true);
		FD1.setVisible(false);
		FD2.setVisible(false);
	}
	
	public static void MyEvent()
	{
		JF.addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent WE)
			{
				System.exit(0);
			}
		});
		MI0.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent AE)
			{
				FD1.setVisible(true);
				Read_Print();
			}
		});
		MI1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent AE)
			{
				FD2.setVisible(true);
				Read_Save();
			}
		});
	}
/********************************************************************************/
	public static void main(String[] args)
	{
		new FileManage();
	}
	public static void Read_Print()
	{
		//先对文本框清空
		TA1.setText(" ");
		TA2.setText(" ");
		TA1.setText(null);
		TA2.setText(null);
		
		String dir_name = FD1.getDirectory();  //获取文件目录
        String file_name = FD1.getFile();  //获取文件名
        if(dir_name==null||file_name==null)
        	return;
        File file = new File(dir_name,file_name);  //封装该文件，使得我们可以操作该文件
        TA2.append("您打开的文件路径："+dir_name+"\r\n"+"文件名为："+file_name);
        
        //读取并记录：选中的文本内容
        try 
        {
			BufferedReader BR = new BufferedReader(new FileReader(file));
			BufferedWriter BW = new BufferedWriter(new FileWriter(new File("G:\\File_Manage_Storage",file_name)));
			while(true)
			{
				String str = BR.readLine();
				if(str==null)
					break;
				TA1.append(str+"\r\n");
				BW.write(str);
				BW.flush();
				BW.newLine();
			}
			BR.close();
			BW.close();
		} 
        catch (FileNotFoundException Fe) 
        {
        	System.out.println("找不到该文件！");
		}
        catch (IOException IOe) 
        {
        	System.out.println("读取或写入失败！");
		}
        //打印该文件下所有的文件名
        TA3.setText(null);  //先清零
        TA3.append("路径： "+dir_name+"下的文件列表:\r\n");
        File directory = new File(dir_name);   //建立一个目录对象
        String[] buffers = directory.list();   //使用目录对象的功能list();获取文件列表，放入缓存中
        for(String buff:buffers)     //遍历输出缓存的内容 
        {
        	TA3.append("|- - ->"+buff+"\r\n");
        }
	}
	
	public static void Read_Save()
	{
		try 
		{
			String dir_name = FD2.getDirectory();
			String file_name = FD2.getFile();
			BufferedWriter BR = new BufferedWriter(new FileWriter(new File(dir_name,file_name)));
			String str = TA1.getText();
			BR.write(str);
			BR.newLine();
			BR.flush();
			BR.close();
		} 
		catch (IOException e) 
		{
			System.out.println("写入失败！");
		}
	}
}
