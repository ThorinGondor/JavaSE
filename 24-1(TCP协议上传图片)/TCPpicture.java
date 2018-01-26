import java.io.*;
import java.net.*;

class Client
{
	public static void main(String[] args) throws Exception
	{
		Socket S = new Socket("192.168.1.108",31000);
		//读取图片的字节流，转化为字符流
		BufferedInputStream BIS = new BufferedInputStream(new FileInputStream("F:\\Ferrari.jpg"));
		//获取网络输出流
		BufferedOutputStream Bout = new BufferedOutputStream(S.getOutputStream());
        
		//上传数据
		int ch = 0;
		while((ch = BIS.read())!=-1)
		{
			Bout.write((char)ch);
		}

        //上传结束
		S.shutdownOutput(); 
        
		//接收服务端反馈
		BufferedReader Bin = new BufferedReader(new InputStreamReader(S.getInputStream()));
		String str = Bin.readLine();
		System.out.println(str);
        
		//关闭流
		BIS.close();
		S.close();
	}
}

class Server
{
	public static void main(String[] args) throws Exception
	{
		ServerSocket SS = new ServerSocket(31000);
		Socket S = SS.accept();

		//读取来自客户端的网络输入流
        BufferedInputStream Bin = new BufferedInputStream(S.getInputStream());
		//设置数据写入本地的目标文件
		BufferedOutputStream BW = new BufferedOutputStream(new FileOutputStream("COPY.jpg"));
		
		//写入
		int ch = 0;
		while((ch = Bin.read())!=-1)
		{
			BW.write((char)ch);
		}
		//写入结束，网络输出流发送反馈字符
		BufferedWriter Bout = new BufferedWriter(new OutputStreamWriter(S.getOutputStream()));
		Bout.write("上传成功！");
		Bout.newLine();
		Bout.flush();

		//关闭
		BW.close();
		SS.close();
	}
}
