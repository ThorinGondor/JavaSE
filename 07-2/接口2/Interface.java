/*�ӿڣ�������⣬������Ϊ��һ������ĳ����࣬���������еķ������ǳ���ģ���ô�������ͨ���ӿڵ���ʽ����ʾ��
Interface���ڶ���ӿ�
class���ڶ�����

�ӿ��еĳ�Ա���й̶����η�
������public static final
������public abstract
�ӿ���ĳ�Ա����public��

�мǣ��ӿ��ǲ����Դ�������ģ���Ϊ�г��󷽷�
��Ҫ������ʵ�֣�����Խӿ��еĳ��󷽷�ȫ�����Ǻ�����ſ���ʵ����
���������ǳ�����

֧�ֶ���ӿ����ӵ�һ��ִ�г���
Ҳ���Խӿ���ӿ�֮��Ҳ�й�ϵ
*/
/******************************************************************/

interface USB      //������USB���ӿ�
{
	public static final int num=17;  
	public abstract void Work();
}

interface USART   //���������ڡ��ӿ�
{
	public static final int num=19;
	public abstract void Run();
}
interface IIC extends USART      //������IIC���ӿ�,IIC�̳���USART
{
	public static final String name="IIC";
	public abstract void Do();
}
interface Telemtry extends IIC
{
	public static final String version="Telemtry";
	public abstract void act();
}
/****************************************************************/
class App1 implements USB,USART   //������֮���Ǽ̳й�ϵextends����ô�ڽӿ���������ִ�С�ʵ�ֹ�ϵimplements����class������һ��App���ӵ�USB�ӿ�
{
	public void Work()
	{
		System.out.println("The App1 selected, the Entrance is USB");
	}
	public void Run()
	{
		System.out.println("The App1 selected, the Entrance is USART");
	}
}

class App2 implements IIC   //App2���ӵ���IIC�ӿڣ���IIC�̳�USART�������ԣ�App2ʵ�֣����ӵ�����IIC��USART���Եĺ�������
{
	public void Run()
	{
		System.out.println("The App2 selected, the Entrance is USART");
	}
	public void Do()
	{
		System.out.println("App2 selected, the Entrance is IIC, and the name is "+name);
	}
}
class App3 implements Telemtry
{
	public void Run(){};
	public void Do(){};
	public void act()
	{
		System.out.println("App3 selected, the entrance is Telemtry,and the version is "+version);
	}
}
/*************************************************************/
class Interface  //������
{
	public static void main(String[] args)
	{
		App1 A1 = new App1();
		System.out.println("App1 test "+USB.num);  
		System.out.println("App1 test "+USART.num);
		A1.Work();
		A1.Run();

		App2 A2 = new App2();
		System.out.println("App2 test "+IIC.name);
		A2.Do();

		App3 A3 = new App3();
		System.out.println("App3 test "+Telemtry.version);
		A3.act();
	}
}