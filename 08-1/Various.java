/*
��̬�ĸ�����⣺
��̬���������Ϊ������ڵĶ���������̬
eg���ˣ����ˡ�Ů�ˡ�С�������˵�
eg�����è���������

������ʾ��
è A = new è������
���� A = new è������

���A�߱�è�Ͷ�����ص�

��̬���Ӧ�ã�
��1����̬�����֣�
     ���������ָ�����Լ����������
	 ���������Ҳ���Խ����Լ����������
��2����̬��ǰ�᣺
     ������������֮���й�ϵ��Ҫô�̳У�extends��Ҫôʵ�֣�implements��
	 ͨ������һ��ǰ�᣺���ڸ��ǡ�
��3����̬�ĺô���
     �������˳������չ�ԡ�
��4����̬�ı׶ˣ�
     ֻ��ʹ�ø�������÷��ʸ����д��ڵĳ�Ա��Eat��
*/
/***********************************************************/
//���£����뿪ʼ��
/***********************************************************/
abstract class Animal
{
	public abstract void Eat();
}

class Cat extends Animal 
{
	public void Eat()
	{
		System.out.println("������");
	}
	public void CatchMouse()
	{
		System.out.println("ץ����");
	}
}

class Dog extends Animal
{
	public void Eat()
	{
		System.out.println("���Թ�ͷ");
	}
	public void Hunt()
	{
		System.out.println("�����");
	}
}
class Pig extends Animal
{
	public void Eat()
	{
		System.out.println("������ʳ");
	}
	public void Sleep()
	{
		System.out.println("��˯��");
	}
}
/*****************************************/
class Various
{
	public static void main(String[] args)
	{
		//����
		/*Animal C1 = new Cat();   //��̬�ı���:���������ָ�����Լ����������
		Animal C2 = new Cat();
	    Animal D1 = new Dog();
		Animal D2 = new Dog();
		Animal P1 = new Pig();
		
		Function(C1);
		Function(C2);
		Function(D1);
		Function(D2);
		Function(P1);*/
        //��ʾΪ�Ż��Ժ�Ĵ��룺
		Function(new Cat());
		Function(new Dog());
		Function(new Pig());

	}
	public static void Function(Animal M)
	{
		M.Eat();
	}
}