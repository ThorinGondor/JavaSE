/***
Calendar�ࣺ
Calendar cl = Calendar.getInstance();  //��ȡһ������
//��ȡ�ꡢ�¡��յķ���
cl.get(Calendar.YEAR);
cl.get(Calendar.MONTH);
cl.get(Calendar.DAY_OF_MONTH);
***/
/***
     ע������Calendar����󣬲���ֱ��newһ�����󣬶�Date�����ֱ��newһ������.
***/
/***
     �������󣺷ֱ�ͨ��Calendar���Date������ȡ���
***/
import java.util.*;
import java.text.*;
class CalendarDemo 
{
	public static void main(String[] args) 
	{
		/**ʹ��Calendar�࣬�������£�**/
        Calendar cl = Calendar.getInstance();  //Calendar.getInstance();��������ʱ���ͻ�����ȡһ������
        sop(cl.get(Calendar.YEAR)+"��"+cl.get(Calendar.MONTH)+"��"+cl.get(Calendar.DAY_OF_MONTH)+"��");
 
		/**�������Calendar�࣬��������**/
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��"/*MM��dd��E*/);
		sop(date);
		String YEAR = sdf.format(date);
		sop(YEAR);  //ֻ������
	}

	public static void sop(Object o)
	{
		System.out.println(o);
	}
}