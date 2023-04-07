import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Random;

public class Demo {
	public static void main(String args[]) {
		Random randomGenerator = new Random();
		int counter = 1;
		
		while (counter <= 5) {
			System.out.println("Flip number " + counter + ": ");
			int coinFlip = randomGenerator.nextInt(2);
			if (coinFlip == 1)
				System.out.println("Heads");
			else
				System.out.println("Tails");
			counter++;
		}
	}
}