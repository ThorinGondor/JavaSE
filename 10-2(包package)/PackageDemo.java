/*面向对象：包*/
//编译完成后，将class文件放到pack文件夹中

//或者如下命令符，也可以：
/*
  F:\Java学习\10-2>javac -d . PackageDemo.java

  F:\Java学习\10-2>java pack.PackageDemo
  Hello Package!
*/

/*更进一步地：如果要把pack包放在别的位置，例如F盘下：
   javac -d F:\MyClass PackageDemo.java
   set classpath=F:\MyClass  
   java pack.PackageDemo
*/
package pack;

class PackageDemo
{
	public static void main(String[] args)
	{
		packA.PackA PA = new packA.PackA();
		PA.Run();

		packB.PackB PB = new packB.PackB();
		PB.Run();
	}
}

/*
总结：包与包之间的访问，需要public修饰
      不同包中的子类可以访问父类中public、被protected修饰的函数
	  包与包之间可以使用的权限只有两种：public和protected
*/
/*
访问权限：
            public protected default private
同一个类中     ok      ok       ok      ok
同一个包中     ok      ok       ok      No
子类           ok      ok       No      No
不同包中       ok      No       No      No
*/