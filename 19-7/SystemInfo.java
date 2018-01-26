/***
Properties有list();函数方法，可以自定义输出系统属性，或者将系统属性写入记事本等目的地。
如下所示：
   |---将系统属性输出：      MapProp.list(System.out);
   |---将系统属性写入文档中：MapProp.list(new PrintStream("SystemInfo.txt"));
***/

import java.util.*;
import java.io.*;

class  SystemInfo
{
	public static void main(String[] args) throws IOException
	{
		Properties MapProp = System.getProperties();
		System.setProperty("J20","J31");  //自定义添加一对映射进入系统属性
		
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
