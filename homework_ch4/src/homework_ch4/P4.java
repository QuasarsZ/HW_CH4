package homework_ch4;

public class P4
{
	public static void main (String[] args)
	{
		RacingCar4 rccar1;
		rccar1 = new RacingCar4();
		
		rccar1.setCar(1234,20.5);
		rccar1.setCourse(5);
		
	}
	
}
class Car4
{
	private int num;
	private double gas;
	
	public Car4()
	{
		num = 0;
		gas=0;
		System.out.println("�Ͳ��F���l");
	}
	
	public void setCar(int n,double g)
	{
		num =n;
		gas =g;
		System.out.println("�N�����]��"+num+"�A�T�o�q�]��"+gas);
	}
	
	public void show()
	{
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);

	}
}

class RacingCar4 extends Car4
{
	private int course;
	
	public RacingCar4()
	{
		course =0;
		System.out.println("�Ͳ��F�ɨ�");
	}
	public void setCourse(int c)
	{
		course= c;
		System.out.println("�N�ɨ��s���]��"+course);
	}
}