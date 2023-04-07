
import java.util.Scanner;

public class WordCount {
	private int count;
	
	public WordCount() {
		count = 999;
	}
	public void resetCounter() {
		this.count = 0;
	}
	
	public void increaseCounter() {
		this.count++;
	}
	
	public void decreaseCounter() {
		this.count--;
	}
	
	public boolean equals(WordCount word) {
		if (this.count == word.count)
			return true;
		else
			return false;
	}
	
	public int getCount() {
		return this.count;
	}
	
	public String toString() {
		return Integer.toString(count);
	}
}