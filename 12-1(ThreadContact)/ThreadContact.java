/*
�̼߳�ͨѶ��
��ʵ���Ƕ���߳��ڲ���ͬһ����Դ�����ǲ����Ķ�����ͬ��
������
�߳�һ��Input�������ƺ͹���
�̶߳���Output������ƺ͹���
*/
class Mode
{
	String name="��";
	String factory="��";
}

class Input implements Runnable
{
	private Mode M; //= new Mode();            //������Input������˴�����Output��ֱ𴴽��¶��󣡱���ص��������������������ܱ�ֻ֤��Ψһ����
    Input(Mode M)                             //�˴�Ϊ��̬����飬��M�����˳�ʼ��
	{
		this.M=M;
		System.out.println(M.name+"; "+M.factory); //����ʼ�����������name��factory��Ϊ���ա�
	}
	public void run()
	{
		int x=0;
		while(true)
		{
			synchronized(M)
			{
			  if(x==0)
			  {
				 M.name="GTX780M";
			     M.factory="Nvidia";
			  }
			  else
			  {
			     M.name="HD8970M";
				 M.factory="AMD";
			  }
			}
			x=(x+1)%2;
			
			
		}
	}
}

class Output implements Runnable
{
	private Mode M; //= new Mode();
	Output(Mode M)
	{
		this.M=M;
	}
	public void run()
	{
		
		int i =1000;
		while(true)
		{
			synchronized(M)        //synchronized(M)��ζ����������ͬ������鶼����ָ��Ψһ�Ķ���������֤��������ͬ��������Ϊһ�����ͬ��!
			{
			System.out.println(M.name+"; "+M.factory);
			}
		}
	}
}

class ThreadContact
{
	public static void main(String[] args)
	{
		Mode M = new Mode();   //�����������봴��Mode��ĳ�����󣡲�����֮ΪM������Ҳ������������Ψһ��Mode����
		Input I = new Input(M);    //����Input���¶���Iָ��Mode��M����
		Output O = new Output(M);  //����Output���¶���OҲָ����Mode��M����
		
		Thread T0 = new Thread(I);  //�����������߳�һ���̶߳�
		Thread T1 = new Thread(O);  
		T0.start();
		T1.start();
	}
}