class  StringDemo
{
	public static void main(String[] args) 
	{
		String s0 = "Klay";               //s0��һ�����ͱ�����������Klay��������һ������
		String s1 = new String("Klay");   //s1����������
		System.out.println(s0==s1);        //�ʶ�����Ľ���ǲ���ͬ
		System.out.println(s0.equals(s1)); //String�ิд��Object���е�equals�������÷��������ж��ַ����Ƿ���ͬ
	}
}
