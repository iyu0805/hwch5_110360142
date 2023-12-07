package hwCH5_110360142;

import java.io.BufferedReader;
import java.io.FileReader;

public class Sample5_9 {

	public static void main(String[] args) {
		if(args.length != 1)
		{
			System.out.println("請指定正確的檔案名稱");
			System.exit(1);
		}
		
		try 
		{
			BufferedReader br = new BufferedReader(new FileReader(args[0]));
			
			String str;
			while((str = br.readLine())!=null)
			{
				System.out.println(str);
			}
			
			br.close();
		} 
		catch (Exception e) 
		{
			System.out.println("輸出入錯誤");
		}
	}

}
