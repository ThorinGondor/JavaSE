/****
   练习：将一个指定目录下的java文件的绝对路径存储到一个文本文件中。
   建立一个java文件列表。

   思路：
   （1）对指定目录进行递归
   （2）获取递归过程中所有java文件的路径
   （3）将这些路径存储到集合中：Collections类
   （4）将集合中的数据写入到一个文件中
****/
import java.io.*;
import java.util.*;

class JavaFileList
{
	public static void main(String[] args)throws IOException
	{
		/**1.建立对象**/
		File dir = new File("F:\\Javastudy\\20-1");//建立一个目录
		List<String> list =new ArrayList<String>();  //建立一个ArrayList集合
		
		/**2.功能执行**/
		FileToList(dir,list);      //执行遍历操作，并将这些文件传进list集合
		WriteToFile(list);         //将集合中的元素写入一个新的文本文档中

		System.out.println(list.size());
	}

	public static void FileToList(File dir,List<String> list)
	{
		File[] files = dir.listFiles();
		for(File file : files)
		{
			if(file.isDirectory())
			{
				FileToList(file,list);  //递归
			}
			else
			{
				if(file.getName().endsWith(".java"))  //如果该文件后缀名是java则将该文件的名称和路径添加进list当中
				{
					list.add(file.getName()+"---"+file.getAbsolutePath());
				}
			}
		}
	}
    
	public static void WriteToFile(List<String>list)throws IOException  //将集合中的元素写入一个新的文本文档中
	{
		//建立字符写入流
		FileWriter FW = new FileWriter("F:\\JavaFileList.txt");
		//加入缓存技术
		BufferedWriter BW = new BufferedWriter(FW);
		
		for(String s:list)   //遍历该list集合的元素（注意应是String类），并通过字符写入流将各个元素写入文本文档
		{
			BW.write(s);
			BW.newLine();
			BW.flush();
		}
	}
}