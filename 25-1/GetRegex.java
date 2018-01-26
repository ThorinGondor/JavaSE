/****
  
������ʽ������һ������ı��ʽ
    ���ã�����ר�Ų����ַ�����
	�ص㣺��һЩ�صصķ�������ʾһЩ��������������ͼ���д�����ѧϰ������ʽ��������ѧϰһЩ������ŵ�ʹ�á�
	�ô������Լ򻯶��ַ����ĸ��Ӳ�����

�������ƥ�䣺
    1��ƥ�䣺String matches()�������ù���ƥ���ַ�����ֻҪ��һ�������Ϲ���matches�ͷ���false
	2���иString split()����
	3���滻��String replace()��replaceAll()������
	4����ȡ��Pattern��Matcher
	
	������ʾ���ĸ���������ʽ��ȡ�ַ������ַ���
	��ȡ���������ǽ��ַ����з��Ϲ�����Ӵ�ȡ����
	�������裺
	��1���Ƚ�������ʽ��װ�ɶ����轨��Pattern�Ķ���
	��2����������ʽ�����Ҫ�������ַ�����������轨��ƥ����Matcher�Ķ���
	��3�������󣬻�ȡ����ƥ�����档
	��4��ͨ������Է��Ϲ�����Ӵ����в���������ȡ��
   
****/
import java.util.regex.*;

class GetRegex 
{
	public static void main(String[] args) 
	{
		getDemo();
	}
	public static void getDemo()
	{
		String line = "Ma Shang jiu yao kai xue le";  //Ҫ���������ַ���
		String regex = "\\b[a-zA-Z]{3}\\b"; //����\\b��˼Ϊ���ʱ߽磬�Ǳ߽�ƥ����
		
		//(1)ͨ������Pattern�Ķ���pt��ʹ��compile();�����������װ�ɶ���
		Pattern pt = Pattern.compile(regex);
		
		//(2)����Matcher�Ķ���Mc��ʹ��matcher();���������ַ���
		Matcher Mc = pt.matcher(line);
		
		//(3)ʹ��find();����Ѱ�ҷ��Ϲ�����Ӵ���������group();������ȡ�ҵ����Ӵ�
		while(Mc.find())
		{
			System.out.println(Mc.group());
			System.out.println(Mc.start()+"----"+Mc.end()); //��ȡ�����Ӵ��ĵ�һ���ַ������һ���ַ���λ��
		}
	}
}
