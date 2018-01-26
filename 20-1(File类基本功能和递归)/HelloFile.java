/***
   File类概述：
   （1）用于将文件或文件夹封装成对象
   （2）方便对文件或者文件夹的属性信息进行操作。
   （3）File对象可以作为参数传递给流的构造函数。
   1.创建：
        file.createNewFile();
   2.删除:
        file.delete();
		file.deleteOnExit();
   3.判断:
        file.exists();
		file.isAbsolute();  //判断是否为绝对路径名
		file.canRead();
		gilr.canWrite();
   4.获取信息：
        file.getName();
	    file.length();
		file.getAbsoultePath();
		file.getParent();   //获取其父类路径
		
***/
import java.io.*;
class  HelloFile
{
	public static void main(String[] args) throws IOException
	{
		CreateFile();
	}

	public static void CreateFile()throws IOException
	{
		File file = new File("Word.txt");  //将Word.txt封装成file对象
		sop("created?---"+file.createNewFile());         //创建该文本文件，并输出boolean值，若为false则说明已经存在该文件，若为true表明创建成功
		sop("exists?---"+file.exists());                //判断是否存在该文本文件,也是boolean值
		sop("Name?---"+file.getName());               //获取该文本文件的名称
		sop("path?---"+file.getAbsolutePath());       //获取该文本文件的绝对路径
        //sop("deleted?---"+file.delete());                //删除该文本文件，并返回boolean值
		
	}

	public static void sop(Object o)
	{
		System.out.println(o);
	}
}
