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
   
   本例演示:
       列出指定目录下的文件或者文件夹，包含子目录的内容
	   也就是指定目录下所有内容

	   因为目录中还有目录，只要使用同一个列出目录功能的函数完成即可：dir.listFile();
	   在列出过程中出现的还是目录的话，再次调用该函数功能即可。
	   也就是函数自身调用自身，这种表现方式就是地递归
***/
import java.io.*;
class FileDemo4 
{
	public static void main(String[] args) 
	{
		File dir = new File("F:\\Javastudy\\20-1");
		ShowDir(dir);
	}

	public static void ShowDir(File dir)
	{
		File[] files = dir.listFiles();
		for(int x=0;x<files.length;x++)
		{
			if(files[x].isDirectory())
			{ShowDir(files[x]);}  //如果该物件属于文件夹，则再次调用该函数，获取该文件夹下的所有文件
			else
			{System.out.println(files[x]);}
		}
	}
}
