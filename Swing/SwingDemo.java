import java.awt.*;
import javax.swing.*;
class SwingDemo extends JFrame
{
	public void CreateJFrame(String title)
	{
	JFrame jf = new JFrame(title);               //建立一个新框架，名为【title】
	Container ct = jf.getContentPane();          //建立一个新容器，它可用于存放各种内容，例如标签、颜色等
	JLabel jl = new JLabel("Hello 图形界面！");  //建立一个新标签，名为【图形界面】

	jl.setHorizontalAlignment(SwingConstants.CENTER);  //设置该标签的位置
	ct.add(jl);                                        //容器存放该标签
	ct.setBackground(Color.orange);                    //容器存放内容的颜色
	
	jf.setVisible(true);                         //框架可视设置
	jf.setSize(300,200);                         //框架大小设置

	//jf.setDefultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

	public static void main(String[] args)
    {
		SwingDemo SD = new SwingDemo();
		SD.CreateJFrame("创建一个JFrame窗体");
    }
}

