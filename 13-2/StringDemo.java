/**
    �������ַ���������
	���硰abcd��
	1.��ȡ
	  1.1 ��ȡ�ַ����еİ������ַ��������ַ������ȣ� int length();
	  1.2 ��ȡĳһλ���ϵ�ĳ���ַ���char charAt(int index);
      1.3 �����ַ���ȡ���ַ����ַ�����λ�ã� int indexof(int str); ���ص���str���ַ����е�һ�γ��ֵ�λ��
	                                         int indexof(int str,int fromIndex):��fromIndexָ��λ�ÿ�ʼ����ȡstr���ַ����г��ֵ�λ��
	2.�ж�
	  2.1 �ַ������Ƿ����ĳһ���Ӵ� boolean contains(str);     boolean�����᷵��true����false
	  2.2 �ַ����Ƿ������ݣ�         boolean isEmpty();         ԭ�������жϳ����Ƿ�Ϊ0;
	  2.3 �ַ����Ƿ���ָ�����ݿ�ͷ�� boolean startsWith(str);  
	  2.4 �ַ����Ƿ���ָ�����ݽ�β:  boolean endsWith(str);
	  2.5 �ַ��������Ƿ���ͬ��       boolean equals(str);
	                                 boolean equalsIgnoreCase(str); (���Դ�Сд��
**/
class  StringDemo
{
	public static void judge()
	{
		String str = "StephenCurry";

		//�ж��Ƿ����ĳһ���ַ�
		sop(str.contains("Curry"));
		//�ж��Ƿ���ĳ���ַ���ͷ
		sop(str.startsWith("S"));
		//�ж��Ƿ���ĳ���ַ���β
		sop(str.endsWith("y"));
		//�ж��ַ����Ƿ��ǿյ�
		sop(str.isEmpty());
	}

	public static void method_get()
	{
		String str = "abcdefgfedcdba";
		//��ȡ����
		sop(str.length());
		//����������ȡ�ַ�
        sop(str.charAt(4));
		//�����ַ���ȡ���� ����ǰ������
        sop(str.indexOf('e'));
		//��������һ���ַ����ֵ�λ�� ���Ӻ���ǰ��
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