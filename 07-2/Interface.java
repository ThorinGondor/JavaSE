/*�ӿڣ��������⣬������Ϊ��һ������ĳ����࣬���������еķ������ǳ���ģ���ô�������ͨ���ӿڵ���ʽ����ʾ��
Interface���ڶ���ӿ�
class���ڶ�����

�ӿ��еĳ�Ա���й̶����η�
������public static final
������public abstract
�ӿ���ĳ�Ա����public��

�мǣ��ӿ��ǲ����Դ�������ģ���Ϊ�г��󷽷�
��Ҫ������ʵ�֣�����Խӿ��еĳ��󷽷�ȫ�����Ǻ�����ſ���ʵ����
���������ǳ�����
*/
/******************************************************************/

interface USB      //��USB���ӿ�
{
	public static final int num=17;  
	public abstract void Work();
}

class App implements USB   //������֮���Ǽ̳й�ϵextends����ô�ڽӿ���������ִ�С�ʵ�ֹ�ϵimplements
{
	public void Work()
	{
		System.out.println("Work");
	}
}

class Interface
{
	public static void main(String[] args)
	{
		App A1 = new App();
		System.out.println(A1.num);
		System.out.println(USB.num);
		System.out.println(App.num);  //����д��������
		A1.Work();
	}
}