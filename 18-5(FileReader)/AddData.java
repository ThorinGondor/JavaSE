/***
    对已有文件进行续写:
    new FileWriter("Add.txt",true);
***/
import java.io.*;
import java.util.*;
class AddData
{
	public static void main(String[] args)throws IOException
	{
		FileWriter FW = new FileWriter("Note.txt",true);  //传递一个true参数，代表不会覆盖已经有的文件！
		//这样它就会在文件里已经有的末尾处续写
		FW.write("---ADD\r");  //如果要换行，需用 \r 符号。
		FW.flush();
	}
}