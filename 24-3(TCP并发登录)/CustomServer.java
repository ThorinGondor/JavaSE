import java.io.*;
import java.net.*;

class Server
{
	public static void main(String[] args) throws Exception
	{
		serveSystem();
	}

	public static void serveSystem() throws Exception
	{
		ServerSocket SS = new ServerSocket(34200);
        Socket S =SS.accept();
		byte[] buf = new byte[1024];
        S.getInputStream().read(buf);
		BufferedWriter Bout = new BufferedWriter(new OutputStreamWriter(S.getOutputStream()));
		Bout.write("<font color ='red' size = '7'>�ͻ�������,���Է���������Ϣ<\font>");
		Bout.newLine();
		Bout.flush();
	}
}