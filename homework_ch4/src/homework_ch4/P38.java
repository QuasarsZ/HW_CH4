package homework_ch4;

public class P38 
{
	public static void main (String[] args)
	{
		iVehicle [] ivc;
		ivc =new iVehicle[2];
		
		ivc[0]= new Car38(1234,20.5);
		ivc[1]= new Plane38(232);
		
		
		
		for (int i=0;i<ivc.length;i++)
		{
			ivc[i].show();
		}
	}
	
}

interface iVehicle
{
	int weight=1000;
	void show();
}




class Car38 implements iVehicle
{
	private int num;
	private double gas;
	
	public Car38(int n,double g)
	{
		num = n;
		gas=g;
		System.out.println("�Ͳ��F������"+num+"�T�o�q"+gas+"�����l");
	}
	
	public void show()
	{
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);

	}
}

class Plane38 implements iVehicle 
{
	private int flight;
	
	public Plane38(int f)
	{
		flight = f;
		System.out.println("�Ͳ��F"+flight+"�Z��������");
	}
	
	
	
	public void show()
	{

		System.out.println("�������Z���O"+flight);
	}

}

