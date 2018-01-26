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
   
   本例演示如何获取一系列的文件列表
         File.listRoots();
         file.list(); 
***/

import java.io.*;
class FileDemo2 
{
	public static void main(String[] args) 
	{
		listRootsDemo();
		Demo2();
	}

	public static void listRootsDemo()
	{
		Object[] objs = File.listRoots(); //左式：该方法返回指示可用的文件系统的根文件对象的数组。
		for(Object o:objs)
		{
			System.out.println(o);
		}
	}

	public static void Demo2()
	{
		File file = new File("F:\\");  //调用list方法时，file对象必须是一个目录，该目录还必须存在
		Object[] objs2 = file.list(); //左式：该方法可以获取该路径下所有的文件夹对象
		for(Object o2:objs2)
		{
			System.out.println(o2);
		}
	}
}
