/****
Properties 是 hashtable 的子类
它具备了Map集合的特点，而且它里面存储的键值对都是字符串

该对象的特点：可以用于键值对形式的配置文件

特有方法：getProperty("key"); 该方法可以获取key值对应的value值，String类
****/
import java.io.*;
import java.util.*;

class  PropertiesDemo
{
	public static void main(String[] args) 
	{
		SetAndGet();
	}

    public static void SetAndGet()
	{
		Properties MapProp = new Properties();//左式和原先 System.getProperties()的区别在于这次是创建空的属性Map表，不是获取系统的属性Map表
		
		MapProp.setProperty("J20","J31");
		MapProp.setProperty("GoldenState","Warriors");
		
		/***获取value值***/
		Object obj = MapProp.get("J20");
		System.out.println(obj);

		/****上述获取value的方法比较麻烦，应如下，使用getProperty()***/
		String value = MapProp.getProperty("J20");
		System.out.println(value);
	}
}
