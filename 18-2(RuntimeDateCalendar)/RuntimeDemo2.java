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
class  RuntimeDemo2
{
	public static void main(String[] args) 
	{
		Runtime Rt = Runtime.getRuntime();  //ֻ������getRuntime()����������һ��Runtime����
		try
		{
			Process p0 = Rt.exec("F:\\winmine.exe");  //��ʽ��Runtime����һ��ɨ�׽��̣���ʽ����һ�����̶���p0��������
			Thread.sleep(1000);
			p0.destroy();   //p0.ɱ����ɨ�׽���
            
			/**ͬ�ϣ�Ҳ���Դ�һ�����±�����**/
			Process p1 = Rt.exec("notepad.exe");  //��ʽ����һ�����±����̣���ʽ����һ������p1������������
			Thread.sleep(1000); 
			p1.destroy();   //p1.ɱ�����±�����
		}
		catch (Exception e)
		{
			System.out.println(e.toString());
		}
		
	}
}