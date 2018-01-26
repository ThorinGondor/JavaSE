import java.net.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.io.IOException;

class UDP_Client1 
{
	private static JFrame JF;
	private static Container Ct;
	private static TextField TF;
	private static TextArea TA;
	private static Button Bt1;
	private static Button Bt2;
	private static MenuBar MB;
	private static Menu M;
	private static MenuItem MI0;
	UDP_Client1()
	{
		Initialize();
	}
	
	public static void Initialize()
	{
		JF = new JFrame("QQ聊天系统——客户1");
		Ct =JF.getContentPane();
		Bt1 = new Button("点击发送");
		Bt2 = new Button("清空聊天框");
		TA = new TextArea(20,40);
		TF = new TextField(30);
		MB =new MenuBar();
		M = new Menu("编辑");
		MI0 = new MenuItem("保存聊天记录");
		
		JF.setMenuBar(MB);
		MB.add(M);
		M.add(MI0);
		Ct.add(TA);
		Ct.add(TF);
		Ct.add(Bt1);
		Ct.add(Bt2);
		JF.setBounds(500, 500, 400, 450);
		JF.setLayout(new FlowLayout());
		
		MyEvent();
		
		JF.setVisible(true);
	}
	
	public static void MyEvent()
	{
		/****点击按钮发送****/
		Bt1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent AE)
			{
				try 
				{
					SendSystem();
					TF.setText(null);
				} 
				catch (IOException e) 
				{
					e.printStackTrace();
					System.exit(0);
				}
			}
		});
		Bt2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent AE)
			{
				TA.setText(" ");
				TA.setText(null);
			}
		});
		/****关闭系统****/
		JF.addWindowListener(new WindowAdapter() 
		{
			public void windowClosing(WindowEvent WE)
			{
				System.exit(0);
			}
		});
		
		/****禁止在TA输入****/
		TA.addKeyListener(new KeyAdapter()   
		{
			public void keyPressed(KeyEvent KE)
			{
				KE.consume();
			}
		});
		/****回车发送****/
		TF.addKeyListener(new KeyAdapter() 
		{
			public void keyPressed(KeyEvent KE)
			{
				int code = KE.getKeyCode();
				if(code==KeyEvent.VK_ENTER)
				{
					try 
				    {
						SendSystem();
						TF.setText(null);
					} 
				    catch (IOException e) 
					{
						System.out.println("发送失败！");
					}
				}
				else
					return;
			}
		});
		/****保存聊天记录****/
		MI0.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent AE)
			{
				try 
				{
					StoreTA();
				} 
				catch (IOException e) 
				{
					System.out.println("保存记录失败！");
				}
			}
		});
	}
	public static void StoreTA() throws IOException
	{
		String str = TA.getText();
		BufferedWriter BW = new BufferedWriter(new FileWriter("F:\\QQ_Storage_Client1_UDP.txt",true));
		BW.write(str);
		BW.flush();
		BW.newLine();
		BW.close();
	}
/****************************************************************/
	public static void main(String[] args)throws IOException  
	{
		new UDP_Client1();
		ReceiveSystem();

	}
	
	public static void SendSystem() throws IOException
	{
		DatagramSocket DS = new DatagramSocket(12344);
		byte[] buffers = new byte[1024];
		buffers = TF.getText().getBytes();
		DatagramPacket DP = new DatagramPacket(buffers,buffers.length,InetAddress.getByName("192.168.1.106"),65427);
		DS.send(DP);
		DS.close();
	}
	
	public static void ReceiveSystem() throws IOException
	{
		DatagramSocket DS =new DatagramSocket(65534);
		while(true)
		{
			byte[] buffers = new byte[1024];
			DatagramPacket DP = new DatagramPacket(buffers,buffers.length);
		    DS.receive(DP);
		    String name = DP.getAddress().getHostName();
		    String str = new String(DP.getData(),0,DP.getLength());
		    if(str.equals("我下线了！"))
		    	break;
		    TA.append("对方的消息："+"--"+name+": "+str+"\r\n");
		}
		DS.close();
	}

}
