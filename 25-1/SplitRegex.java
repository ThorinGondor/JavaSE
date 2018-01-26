/****
利用正则进行字符切割：
    方法：(可以用逗号进行切割)
	String str = "Kimi,Raikkonen";
	String regex = ",";
	String[] arr = str.split(regex);
    
	(不能用点进行切割，因为它就是一个字符,非要用这个必须先打上转义符号“\\”)
****/
import java.util.*;

class SplitRegex 
{
	public static void main(String[] args) 
	{
		SplitDemo();
	}

	public static void SplitDemo()
	{
		/**（1）**/
		String str = "Kimi,Raikkonen";
		String regex = ",";
		String[] arr = str.split(regex);  //regex正则会根据“，”进行切割
		
		for(String s:arr)
		{
			System.out.println(s);
		}
        
		/**（2）**/
		String line = "Stephen.Curry";
		String regex2 = "\\.";  //如果非要用点切割，必须打上转义符号“\\”
		String[] buff = line.split(regex2);

		for(String bu: buff)
		{
			System.out.println(bu);
		}

		/**（3）**/
		String dir = "C:\\ProgramFiles\\Demo.txt";
		String regex3 = "\\\\";  //此处说明：前两个斜杠\\是转义符，后两个斜杠才是用于切割的符号：\\
		String[] buffers = dir.split(regex3);
		for(String b:buffers)
		{
			System.out.println(b);
		}
		/**（4）切割叠词**/
		String word = "djKKurLLsfJJ";
		String regex4 = "(.)\\1";  //(.)代表某一任一字符并且被封装，\\1表示前一组（位）的字符在第二位处再次重复
		String[] store = word.split(regex4);
		for(String s : store)
		{
			System.out.println(s);
		}
	}
}
