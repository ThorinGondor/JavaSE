//�������󣺽��ڳԲ��˽���У����
class RegexPractice 
{
	public static void main(String[] args) 
	{
		String str = "��...����..��Ҫ..ҪҪҪ...ѧѧ..ѧ..��...����...��...�̳�..��";
		//(1)�滻��
		String regex = "\\.{2,}";
		String result = str.replaceAll(regex,"");
		System.out.println(result);
		
		//(2)�滻����
		String regex2 = "(.)\\1+"; //(.)��һλ����һ�ַ���\\1��ʾ�ٴ��ظ� +��ʾ�ظ�һ������
		String result2 = result.replaceAll(regex2,"$1");  //����$1��ʾ��ȡǰһ������ĵ�һ���ַ�
		System.out.println(result2);
	}
}
