package hwCH5_110360142;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class gpt1 {

	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new FileReader("gpt1.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}
