public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction() {
		numerator = 1;
		denominator = 1;
	}
	public Fraction(int numer, int deno) {
		numerator = numer;
		denominator = deno;
	}
	
	public void setNumerator(int numer) {
		numerator = numer;
	}
	
	public void setDenominator(int deno) {
		denominator = deno;
	}
	
	public double getDouble() {
		return (numerator / denominator);
	}
	
	public void DisplayFraction() {
		System.out.print(numerator + " / " + denominator);
	}
	
	public boolean equals(Fraction newFrac) {
		if ((double)numerator / denominator == (double)newFrac.numerator / newFrac.denominator)
			return true;
		else return false;
	}
}