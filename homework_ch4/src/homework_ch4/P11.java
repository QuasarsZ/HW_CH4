package homework_ch4;

public class P11
{
	public static void main (String[] args)
	{
		RacingCar11 rccar1;
		rccar1=new RacingCar11();
		
		rccar1.setCar(1234, 20.5);
		rccar1.setCourse(5);
		
		rccar1.show();
	}
	
}
class Car11
{
	protected int num;
	protected double gas;
	
	public Car11()
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

class RacingCar11 extends Car11
{
	private int course;
	
	public RacingCar11()
	{
		course =0;
		System.out.println("�Ͳ��F�ɨ�");
	}
	
	
	public void setCourse(int c)
	{
		course= c;
		System.out.println("�N�ɨ��s���]��"+course);
	}
	public void show()
	{
		System.out.println("�ɨ��������O"+num);
		System.out.println("�T�o�q�O"+gas);
		System.out.println("�ɨ��s���O"+course);

	}
	

}