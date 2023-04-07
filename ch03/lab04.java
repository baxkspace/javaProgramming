import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class lab04 {
	public static void main(String[] args) {
		Scanner fileIn = null;
		try {
			fileIn = new Scanner(new FileInputStream("src/lab04file.txt"));
		}
		catch (FileNotFoundException e) {
			System.out.println("File not found");
			System.exit(0);
		}
		
		String start;
		Scanner startScanner = new Scanner(System.in);
		do {
		System.out.print("input: ");
		start = startScanner.next();
		} while (!(start.equals("a") || start.equals("e") || start.equals("o")
				|| start.equals("u") || start.equals("i")));
		
		
		
		fileIn.useDelimiter(" ");
		do {
			String word = fileIn.next();
			if (word.startsWith(start))
				System.out.print(word + " ");
		} while (fileIn.hasNextLine());
	}
}