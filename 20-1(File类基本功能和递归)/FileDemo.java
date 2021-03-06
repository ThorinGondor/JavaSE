/***
   File类概述：
   （1）用于将文件或文件夹封装成对象
   （2）方便对文件或者文件夹的属性信息进行操作。
   （3）File对象可以作为参数传递给流的构造函数。
   1.创建：
        file.createNewFile(); 创建一个文件
		file.mkdirs(); 用于创建多级文件夹
   2.删除:
        file.delete();
		file.deleteOnExit();
   3.判断:
        file.exists();
   4.获取信息：
         file.getName();
		 file.length();
		 file.getAbsoultePath();
		 file.getParent();
		 file.isHidden();
***/
import java.io.*;
class  FileDemo
{
	public static void main(String[] args) throws IOException
	{
		CreateFile();
	}

	public static void CreateFile()throws IOException
	{
		File file = new File("abc\\kkk\\ggg\\lll");  //多级目录下的文件夹
		sop("mkdir?---"+file.mkdirs());              //创建多极目录该文件夹，并输出boolean值，若为false则说明已经存在该文件，若为true表明创建成功
		sop("exists?---"+file.exists());                //判断是否存在该文件夹,也是boolean值
		sop("isDirectory?---"+file.isDirectory());    //判断是不是一个文件夹(目录)？
		sop("path?---"+file.getAbsolutePath());       //获取该文件夹的绝对路径
		
	}

	public static void sop(Object o)
	{
		System.out.println(o);
	}
}
