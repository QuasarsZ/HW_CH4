package homework_ch4;

public class P32 
{
	public static void main (String[] args)
	{
		Vehicle [] vc;
		vc =new Vehicle[2];
		
		vc[0]= new Car32(1234,20.5);
		vc[1]= new Plane32(232);
		
		
		
		for (int i=0;i<vc.length;i++)
		{
			if(vc[i] instanceof Car32)
			{
				System.out.println("��"+(i+1)+"����OCar���O");
			}
			else
			{
				System.out.println("��"+(i+1)+"���󤣬OCar���O");
			}

		}
	}
	
}

abstract class Vehical32
{
	protected int speed;
	
	public void setSpeed(int s)
	{
		speed = s;
		System.out.println("�N�t�׳]��"+speed +"�F");
	}

	abstract void show();
}




class Car32 extends Vehicle
{
	private int num;
	private double gas;
	
	public Car32(int n,double g)
	{
		num = n;
		gas=g;
		System.out.println("�Ͳ��F������"+num+"�T�o�q"+gas+"�����l");
	}
	
	public void show()
	{
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
		System.out.println("�t�׬O"+speed);
	}
}

class Plane32 extends Vehicle
{
	private int flight;
	
	public Plane32(int f)
	{
		flight = f;
		System.out.println("�Ͳ��F"+flight+"�Z��������");
	}
	
	
	
	public void show()
	{

		System.out.println("�������Z���O"+flight);
		System.out.println("�t�׬O"+speed);
	}

}

