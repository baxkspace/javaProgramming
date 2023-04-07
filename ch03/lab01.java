import java.util.Scanner;
import java.util.Random;

public class lab01 {
	public static void main(String[] args) {
		Scanner scannerObject = new Scanner(System.in);
		Random randomGenerator = new Random();
		
		int num = scannerObject.nextInt();
		for (int i = 0; i < 3; i++) {
			int randomNumber = randomGenerator.nextInt(31);
			System.out.print(randomNumber + " ");
		}
	}
}