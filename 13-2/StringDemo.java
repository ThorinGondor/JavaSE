/**
    常见的字符串操作：
	例如“abcd”
	1.获取
	  1.1 获取字符串中的包含的字符数，即字符串长度： int length();
	  1.2 获取某一位置上的某个字符：char charAt(int index);
      1.3 根据字符获取该字符在字符串的位置： int indexof(int str); 返回的是str在字符串中第一次出现的位置
	                                         int indexof(int str,int fromIndex):从fromIndex指定位置开始，获取str在字符串中出现的位置
	2.判断
	  2.1 字符串中是否包含某一个子串 boolean contains(str);     boolean量将会返回true或者false
	  2.2 字符串是否有内容：         boolean isEmpty();         原理就是判断长度是否为0;
	  2.3 字符串是否以指定内容开头： boolean startsWith(str);  
	  2.4 字符串是否以指定内容结尾:  boolean endsWith(str);
	  2.5 字符串内容是否相同：       boolean equals(str);
	                                 boolean equalsIgnoreCase(str); (忽略大小写）
**/
class  StringDemo
{
	public static void judge()
	{
		String str = "StephenCurry";

		//判断是否包括某一串字符
		sop(str.contains("Curry"));
		//判断是否以某个字符开头
		sop(str.startsWith("S"));
		//判断是否以某个字符结尾
		sop(str.endsWith("y"));
		//判断字符串是否是空的
		sop(str.isEmpty());
	}

	public static void method_get()
	{
		String str = "abcdefgfedcdba";
		//获取长度
		sop(str.length());
		//根据索引获取字符
        sop(str.charAt(4));
		//根据字符获取索引 即从前往后找
        sop(str.indexOf('e'));
		//反向索引一个字符出现的位置 即从后往前找
		sop(str.lastIndexOf("b"));
	}
	public static void main(String[] args) 
	{
		method_get();
		judge();
	}
	public static void sop(Object obj)  //Object obj = str.length();
	{ 
        System.out.println(obj);       //obj = str.length()
	}
}
