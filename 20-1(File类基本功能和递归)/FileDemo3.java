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

class FileDemo3 
{
	public static void main(String[] args) 
	{
		Run();
	}

	public static void Run()
	{
		File dir = new File("F:\\Javastudy\\20-1");
		Object[] objs = dir.list(new FilenameFilter()
			{
			public boolean accept(File dir,String name)
				{
					return name.endsWith(".java");//过滤器，只获取该类后缀的文件
			    }
		    }
		);  //dir.list(new FilenameFilter(){xxx});

		for(Object o :objs)
		{
			System.out.println(o);
		}
	}
}
