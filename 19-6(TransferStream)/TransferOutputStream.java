import java.io.*;
class TransferOutputStream
{
	public static void main(String[] args)throws IOException 
	{
		//建立一个字节写入流OutputStream
		OutputStream OS = new FileOutputStream("Demo.txt");
		//为了能够使用FileWriter的write(str);功能，这里将字节写入流转化为字符写入流:OutputStreamWriter
		OutputStreamWriter OSW = new OutputStreamWriter(OS);

		//这样可以添加提高效率的缓冲区
		BufferedWriter BW = new BufferedWriter(OSW);
		BW.write("GoledenStateWarriors");
		BW.flush();
	}
}