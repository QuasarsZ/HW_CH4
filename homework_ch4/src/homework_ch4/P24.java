package homework_ch4;

public class P24
{
	public static void main (String[] args)
	{
		Car24 car1;
		car1 = new Car24();
		
		car1.setCar(1234, 20.5);
		System.out.println(car1);
	}
	
}
class Car24
{
	protected int num;
	protected double gas;
	
	public Car24()
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
	
	public String toString()
	{
		String str = "����" +num+ "�T���q" +gas;
		return str;
	}
	
	public void show()
	{
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);

	}
}


