/***
    Runtime����
	�����������������ʹ�ñ������ܺ�win�����������Ӷ���win�������в�������������һЩ����
	exec("����:\\·��\\XXX.exe");

	��Runtime���в�û���ṩ���캯����˵��������newһ�����󣬹ʶ������еķ������Ǿ�̬�ġ�
	���������л��зǾ�̬������˵������϶�����һ���������Ի�ȡ������󣬶��Ҹ÷����Ǿ�̬�ģ����ҷ���ֵ�����Ǳ�������(Runtime����)��
	�÷������ǣ�  static Runtime getRuntime();
	������������ʵ������Ϊ��̬�ģ�����ֱ��newһ�����󣬱���ͨ��ָ���ĺ�����Runtime.getRuntime();����������
***/
import java.util.*;
import java.lang.System.*;
class  RuntimeDemo
{
	public static void main(String[] args) 
	{
		Runtime Rt = Runtime.getRuntime();  //ֻ������getRuntime()����������һ��Runtime����
		try
		{
			Rt.exec("F:\\winmine.exe");   //��ʽ��Runtime����һ���ӽ���
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
	}
}
