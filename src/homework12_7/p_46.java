package homework12_7;

public class p_46 {
	public static void main(String[] args)
	{
		Car46 carl = new Car46("1號車");
		carl.start();
	
		for(int i=0; i<5; i++)
		{
			System.out.println("正在進行main()的處理工作");
		}
	}
}

class Car46 extends Thread
{
	private String name;
	
	public Car46(String nm)
	{
	name = nm;
	}

	public void run()
	{
		for(int i=0; i<5; i++)
		{
			try
			{
				sleep(1000);
				System.out.println("正在進行"+name+"的處理工作");		
			}
			catch(InterruptedException e)
			{
			}
		}
	}
}