/*������󣺰�*/
//������ɺ󣬽�class�ļ��ŵ�pack�ļ�����

//���������������Ҳ���ԣ�
/*
  F:\Javaѧϰ\10-2>javac -d . PackageDemo.java

  F:\Javaѧϰ\10-2>java pack.PackageDemo
  Hello Package!
*/

/*����һ���أ����Ҫ��pack�����ڱ��λ�ã�����F���£�
   javac -d F:\MyClass PackageDemo.java
   set classpath=F:\MyClass  
   java pack.PackageDemo
*/
package pack;

class PackageDemo
{
	public static void main(String[] args)
	{
		packA.PackA PA = new packA.PackA();
		PA.Run();

		packB.PackB PB = new packB.PackB();
		PB.Run();
	}
}

/*
�ܽ᣺�����֮��ķ��ʣ���Ҫpublic����
      ��ͬ���е�������Է��ʸ�����public����protected���εĺ���
	  �����֮�����ʹ�õ�Ȩ��ֻ�����֣�public��protected
*/
/*
����Ȩ�ޣ�
            public protected default private
ͬһ������     ok      ok       ok      ok
ͬһ������     ok      ok       ok      No
����           ok      ok       No      No
��ͬ����       ok      No       No      No
*/