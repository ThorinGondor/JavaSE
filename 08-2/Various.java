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
		Animal A1 = new Cat();  //��������������ת��
		A1.Eat();
		Cat C = (Cat)A1;  //�����Ҫ����è�����з���(ץ����)��������������������ǿ��ת��
        C.CatchMouse();    //��ʱ���Ե������з���
		//��̬������ʼ���ն�������Cat�����任
        /*��ͬ*/
		Animal A2 = new Dog();
		A2.Eat();
		Dog D = (Dog)A2;
		D.Hunt();
        /*�����Ż�*/
		Function(new Pig());
		Function(new Cat());
	}
	public static void Function(Animal M)
	{
		M.Eat();
		if(M instanceof Pig)
		{
			Pig P = (Pig)M;
		    P.Sleep();
		}
		else if(M instanceof Cat)
		{
			Cat C = (Cat)M;
			C.CatchMouse();
		}
	}
}