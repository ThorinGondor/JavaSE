import java.awt.*;
import javax.swing.*;
class SwingDemo extends JFrame
{
	public void CreateJFrame(String title)
	{
	JFrame jf = new JFrame(title);               //����һ���¿�ܣ���Ϊ��title��
	Container ct = jf.getContentPane();          //����һ�����������������ڴ�Ÿ������ݣ������ǩ����ɫ��
	JLabel jl = new JLabel("Hello ͼ�ν��棡");  //����һ���±�ǩ����Ϊ��ͼ�ν��桿

	jl.setHorizontalAlignment(SwingConstants.CENTER);  //���øñ�ǩ��λ��
	ct.add(jl);                                        //������Ÿñ�ǩ
	ct.setBackground(Color.orange);                    //����������ݵ���ɫ
	
	jf.setVisible(true);                         //��ܿ�������
	jf.setSize(300,200);                         //��ܴ�С����

	//jf.setDefultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

	public static void main(String[] args)
    {
		SwingDemo SD = new SwingDemo();
		SD.CreateJFrame("����һ��JFrame����");
    }
}

