import java.util.*;
import java.io.*;
class Person implements Serializable//�̳�Serializable����ʹ���༰�������Ա�ObjectInputStream��������ȡ��
{
	public static final long serialVersionUID = 42L; //���л��Ժ󣬸�������ݲ�����private����public�����Ա�ObjectInputStream�������
	String name;
	int num;
	Person(String name,int num)
	{
		this.name=name;
		this.num=num;
	}
	public String toString() //����ת��ΪString����ʱ���������
	{
		return name+":"+num;
	}
}