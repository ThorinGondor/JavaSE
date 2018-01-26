/*
题目：数据库的操作
数据是用户信息
1.打开数据库连接
  LXZ的数据库 Tifa的数据库
2.操作数据库
  c：create r：read u：update d：delete
3.关闭数据库连接
*/
class MainApp
{
	public void BootMainApp(UserInfoDAO U)
	{
		if(M!=null)
		{
			U.Add();
			U.Delete();
		}
	}
}

interface UserInfoDAO    //用户信息的数据接入口 
{
	public abstract void Add(User User);
	public abstract void Delete(User User);
}

class UserInfoByLXZ implements UserInfoDAO
{
	public void Add(User User)
	{
		1.LXZ连接数据库
		2.使用sql添加语句添加数据
		3.LXZ关闭连接
	}
	public void Delete(User User)
	{
		1.LXZ连接数据库
		2.使用sql添加语句删除数据
		3.LXZ关闭连接
	}
}

class UserInfoByTifa implements UserInfoDAO
{
	public void Add(User User)
	{
		1.Tifa连接数据库
		2.使用sql添加语句添加数据
		3.Tifa关闭连接
	}
	public void Delete(User User)
	{
		1.Tifa连接数据库
		2.使用sql添加语句删除数据
		3.Tifa关闭连接
	}
}
/************************************************/
class DataBase
{
	public static void main(String[] args)
	{
		/*
		UserInfoByLXZ UI = new UserInfoByLXZ();
		UserInfoByLXZ.Add(User);
		UserInfoByLXZ.Delete(User);
		*/
		//此代码毫无扩展性！出现新的用户以后需要重写该程序！

		MainApp MA = new MainApp();
		MA.BootMainApp(new UserInfoByTifa());
		MA.BootMainApp(new UserInfoByLXZ());
	}
}