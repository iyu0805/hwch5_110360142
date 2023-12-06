package homework12_7;

public class p_6 {
	public static void main(String[] args)
	{
		Car car1;
		car1 = new Car();
		car1.show();
	}

}

class Car 
{
	private int num;
	private double gas;
	
	public Car()
	{
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	
	public void setCar(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為"+num+"，汽油量設為"+gas);
	}
	
	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量為"+num);
	}
}
