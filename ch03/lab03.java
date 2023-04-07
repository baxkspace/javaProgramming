import java.util.Scanner;

public class lab03 {
	public static void main(String[] args) {
		Scanner scannerObject = new Scanner(System.in);
		String input = scannerObject.nextLine();
		
		for (int i = input.length() - 1; i >= 0; i--)
			System.out.print(input.charAt(i));
	}
}