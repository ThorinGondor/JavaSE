/****
  
�������ʽ������һ������ı���ʽ
    ���ã�����ר�Ų����ַ�����
	�ص㣺��һЩ�صصķ�������ʾһЩ��������������ͼ���д�����ѧϰ�������ʽ��������ѧϰһЩ������ŵ�ʹ�á�
	�ô������Լ򻯶��ַ����ĸ��Ӳ�����

�������ƥ�䣺
    1��ƥ�䣺String matches()�������ù���ƥ���ַ�����ֻҪ��һ�������Ϲ���matches�ͷ���false
	2���иString split()����
	3���滻��String replace()��replaceAll()������
	4����ȡ��
	
	������ʾ���������ʽ�滻�ַ������ַ�
   
****/

class ReplaceRegex
{
	public static void main(String[] args)
	{
		ReplaceDemo1();
		ReplaceDemo2();
	}
	public static void ReplaceDemo1()
	{
		String str = "KevonD13818183068uran13918771046t"; //���Σ������������ֻ���һ��#��
		String reg = "\\d{5,}";  //���� //d��ʾ�������֣�{5,}��ʾ���ٳ������
		String newstr = str.replaceAll(reg,"#");
		System.out.println(newstr);
	}
	public static void ReplaceDemo2()
	{
		String str = "dsddadKKsdquiRRRRcdsasdmmmsadeqqqdseweWWWWWsdff";
		String regex = "(.)\\1+";
		String newstr = str.replaceAll(regex,"#"); //���ظ����ַ�����#��
		System.out.println(newstr);
        
		String str2 = "dsddadKKsdquiRRRRcdsasdmmmsadeqqqdseweWWWWWsdff";
		String newstr2 = str2.replaceAll(regex,"$1");  //���ظ����ַ����ɵ����ַ���$1��ʾ��ȡǰһ���������ʽ�ĵ�һ���ַ�(.)
        System.out.println(newstr2);
	}
}