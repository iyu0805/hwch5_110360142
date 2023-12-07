package hwCH5_110360142;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class gpt2 {

	public static void main(String[] args) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("gpt2.txt"))) {
            writer.write("Hello, this is a sample text.\n");
            writer.write("This is another line of text.");
            System.out.println("輸入完成");
        } catch (IOException e) {
            e.printStackTrace();
        }

	}

}
