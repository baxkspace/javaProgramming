import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class lab02 {
	public static void main(String[] args) {
		Scanner fileIn = null;
		try {
			fileIn = new Scanner(new FileInputStream("src/lab02file.txt"));
		}
		catch (FileNotFoundException e) {
			System.out.println("File not found. ");
			System.exit(0);
		}
		
		String input = fileIn.nextLine();
		fileIn.close();
		input = input.replace("hate", "love");
		
		System.out.println(input);
	}
}