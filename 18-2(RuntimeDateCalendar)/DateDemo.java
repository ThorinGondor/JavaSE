/***
   ����Date��:����Ǿ�̬����������ֱ�Ӵ���(newһ��)�¶���
   (֮ǰ��Properties���Runtime���Ǿ�̬�������������ָ�������������¶���)��
   
   ֱ�Ӵ�ӡ����Date��Ķ���date��ʽ���Ӳ��׶���
   ��˿���ʹ��SimpleDateFormat�࣬newһ������Ķ���sdf����ʹ�øö���sdf��format()���ܣ�sdf.format(date);���Զ�date�ĸ��Ӹ�ʽ���м�ģʽ����
***/

import java.util.*;
import java.text.*;  //ʹ��DateFormat����뵼�����
class DateDemo
{
	public static void main(String[] args)
	{
		Date date = new Date();
        sop(date);  //��������� �·� ���� ʱ���� ���
		

		//��ģʽ��װ��SimpleDateFormat�Ķ�����.ͨ��˵�����ǽ���һ��ʱ��ģʽ�Ķ���ʹ�ø�ģʽ����Ĺ��ܿ��Խ��������ӵ�ʱ���ʽ��ʽ��
		DateFormat SDF = new SimpleDateFormat("yyyy��MM��dd��E");
		//����format������ģʽ��ָ��Date������и�ʽ��:
		String time = SDF.format(date);
		sop(time); //�����2017��08��15�����ڶ�
	}

	public static void sop(Object o)
	{
		System.out.println(o);
	}
}