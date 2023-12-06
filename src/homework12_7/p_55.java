package homework12_7;

public class p_55 {
	public static void main(String[] args)
	{
		Company55 cmp = new Company55();
		
		Driver55 drv1 = new Driver55(cmp);
		drv1.start();
		
		Driver55 drv2 = new Driver55(cmp);
		drv2.start();
	}
}

class Company55
{
	private int sum = 0;
	public synchronized void add(int a) 
	{
		int tmp = sum;
		System.out.println("目前的合計金額是"+tmp+"元");
		System.out.println("賺到了"+a+"元");
		tmp = tmp +a;
		System.out.println("合計金額是"+tmp+"元");
		sum = tmp;	
	}
}

class Driver55 extends Thread 
{
	private Company55 comp;
	
	public Driver55(Company55 c) 
	{
		comp = c;
	}

	public void run() 
	{
		for(int i=0;i<3;i++) 
		{
			comp.add(50);
		}
	}
}