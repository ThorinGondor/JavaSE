/****
������ʽ������һ������ı��ʽ
    ���ã�����ר�Ų����ַ�����
	�ص㣺��һЩ�صصķ�������ʾһЩ��������������ͼ���д�����ѧϰ������ʽ��������ѧϰһЩ������ŵ�ʹ�á�
	�ô������Լ򻯶��ַ����ĸ��Ӳ�����

�������ƥ�䣺
    1��ƥ�䣺String matches()�������ù���ƥ���ַ�����ֻҪ��һ�������Ϲ���matches�ͷ���false
	2���иString split()����
	3���滻��String replace()��replaceAll()����
****/

/****
��������
    ��qq�������У��
	Ҫ��5~15,0���ܿ�ͷ��ֻ��������
****/
class RegexDemo
{
	public static void main(String[] args) 
	{
		QQcheck();
		Demo();
	}
	public static void QQcheck() 
	{
		String qq = "1360002051";
		String regex = "[1-9]\\d{9}";  
		boolean flag = qq.matches(regex);    //����ƥ�䣬����booleanֵ

		if(flag==true)
		{
			System.out.println("OK");
		}
		else
		{
			System.out.println("Invalid");
		}
	}

	public static void Demo()
	{
		String str = "cy";
		String regex = "[abc][x-z]";  //��һλ������abc�е�һ�����ڶ�λ������x��z;���ң��ù���ֻ��У�鳤��Ϊ2���ַ�����
		boolean flag = str.matches(regex);
		System.out.println(flag);
	}
}
