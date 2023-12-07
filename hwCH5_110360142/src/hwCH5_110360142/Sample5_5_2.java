package hwCH5_110360142;

public class Sample5_5_2 {

	public static void main(String[] args) throws CarException { 
		Car32 car1 = new Car32();
		
		car1.setCar30(1234, -10.0);
		car1.show();

	}

}

class CarException extends Exception
{
}

class Car32
{
	private int num;
	private double gas;
	
	public Car32()
	{
		num = 0;
		gas = 0.0;
		System.out.println("已生產了汽車");
	}
	
	public void setCar30(int n, double g)throws CarException
	{
		if(g<0)
		{
			CarException e = new CarException();
			throw e;
		}else 
		{
			num = n;
			gas = g;
			System.out.println("已將車號設為"+num+"。汽油量設為"+gas);
		}
	}
	
	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}