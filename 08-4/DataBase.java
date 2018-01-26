/*
��Ŀ�����ݿ�Ĳ���
�������û���Ϣ
1.�����ݿ�����
  LXZ�����ݿ� Tifa�����ݿ�
2.�������ݿ�
  c��create r��read u��update d��delete
3.�ر����ݿ�����
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

interface UserInfoDAO    //�û���Ϣ�����ݽ���� 
{
	public abstract void Add(User User);
	public abstract void Delete(User User);
}

class UserInfoByLXZ implements UserInfoDAO
{
	public void Add(User User)
	{
		1.LXZ�������ݿ�
		2.ʹ��sql�������������
		3.LXZ�ر�����
	}
	public void Delete(User User)
	{
		1.LXZ�������ݿ�
		2.ʹ��sql������ɾ������
		3.LXZ�ر�����
	}
}

class UserInfoByTifa implements UserInfoDAO
{
	public void Add(User User)
	{
		1.Tifa�������ݿ�
		2.ʹ��sql�������������
		3.Tifa�ر�����
	}
	public void Delete(User User)
	{
		1.Tifa�������ݿ�
		2.ʹ��sql������ɾ������
		3.Tifa�ر�����
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
		//�˴��������չ�ԣ������µ��û��Ժ���Ҫ��д�ó���

		MainApp MA = new MainApp();
		MA.BootMainApp(new UserInfoByTifa());
		MA.BootMainApp(new UserInfoByLXZ());
	}
}