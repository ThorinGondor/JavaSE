/***
Properties��list();���������������Զ������ϵͳ���ԣ����߽�ϵͳ����д����±���Ŀ�ĵء�
������ʾ��
   |---��ϵͳ���������      MapProp.list(System.out);
   |---��ϵͳ����д���ĵ��У�MapProp.list(new PrintStream("SystemInfo.txt"));
***/

import java.util.*;
import java.io.*;

class  SystemInfo
{
	public static void main(String[] args) throws IOException
	{
		Properties MapProp = System.getProperties();
		System.setProperty("J20","J31");  //�Զ������һ��ӳ�����ϵͳ����
		
		MapProp.list(System.out);
		MapProp.list(new PrintStream("SystemInfo.txt"));
		
		/***
		System.out.println(MapProp.get("user.country"));
		
		Set<Object> keyset=MapProp.keySet();
		Iterator<Object> it = keyset.iterator();
		while(it.hasNext())
		{
			Object key = it.next();
			Object value = MapProp.get(key);
			System.out.println(key+"----"+value);
		}
		****/
	}
}
