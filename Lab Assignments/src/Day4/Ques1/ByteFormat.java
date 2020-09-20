package Day4.Ques1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteFormat {
	public static void main(String[] args) {
		try (FileInputStream file = new FileInputStream(new File("Story.txt"))) {
			StringBuilder s = new StringBuilder();
			System.out.println("Byte Format Output:");
			int d;
			while ((d = file.read()) != -1) {
				System.out.print(d + " ");
				s.append((char) d);
			}
			System.out.println("\nFormatted Output:");
			System.out.println(s.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
