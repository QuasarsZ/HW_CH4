package homework_ch4;

public class P6 
{

	public static void main (String[] args)
	{
		RacingCar6 rccar1 =new RacingCar6(1234,20.5,5);


	}
	
}
class Car6
{
	private int num;
	private double gas;
	
	public Car6()
	{
		num = 0;
		gas=0;
		System.out.println("�Ͳ��F���l");
	}
	
	public Car6(int n ,double g)
	{
		num = n;
		gas=g;
		System.out.println("�Ͳ��F������"+num+"�T�o�q��"+gas+"�����l");
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

class RacingCar6 extends Car6
{
	private int course;
	
	public RacingCar6()
	{
		course =0;
		System.out.println("�Ͳ��F�ɨ�");
	}
	public RacingCar6(int n,double g ,int c)
	{
		super(n,g);
		course = c;
		System.out.println("�Ͳ��F�s����" +course+ "���ɨ�");
	}
	
	
	public void setCourse(int c)
	{
		course= c;
		System.out.println("�N�ɨ��s���]��"+course);
	}

}