/****
������������ַ��и
    ������(�����ö��Ž����и�)
	String str = "Kimi,Raikkonen";
	String regex = ",";
	String[] arr = str.split(regex);
    
	(�����õ�����и��Ϊ������һ���ַ�,��Ҫ����������ȴ���ת����š�\\��)
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
		/**��1��**/
		String str = "Kimi,Raikkonen";
		String regex = ",";
		String[] arr = str.split(regex);  //regex�������ݡ����������и�
		
		for(String s:arr)
		{
			System.out.println(s);
		}
        
		/**��2��**/
		String line = "Stephen.Curry";
		String regex2 = "\\.";  //�����Ҫ�õ��и�������ת����š�\\��
		String[] buff = line.split(regex2);

		for(String bu: buff)
		{
			System.out.println(bu);
		}

		/**��3��**/
		String dir = "C:\\ProgramFiles\\Demo.txt";
		String regex3 = "\\\\";  //�˴�˵����ǰ����б��\\��ת�����������б�ܲ��������и�ķ��ţ�\\
		String[] buffers = dir.split(regex3);
		for(String b:buffers)
		{
			System.out.println(b);
		}
		/**��4���и����**/
		String word = "djKKurLLsfJJ";
		String regex4 = "(.)\\1";  //(.)����ĳһ��һ�ַ����ұ���װ��\\1��ʾǰһ�飨λ�����ַ��ڵڶ�λ���ٴ��ظ�
		String[] store = word.split(regex4);
		for(String s : store)
		{
			System.out.println(s);
		}
	}
}
