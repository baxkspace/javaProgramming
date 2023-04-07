import java.util.Scanner;

public class Date {
	private int month;
	private int day;
	private int year;
	
	public void setMonth(int monthNumber) {
		if ((monthNumber <= 0) || (monthNumber > 12))
        {
            System.out.println("Fatal Error");
            System.exit(0);
        }
        else
            this.month = monthNumber;
	}
	
	public void setDay(int dayNumber) {
		if ((dayNumber <= 0) || (dayNumber > 31))
        {
            System.out.println("Fatal Error");
            System.exit(0);
        }
        else
            this.day = dayNumber;
	}
	
	public void setYear(int yearNumber) {
		this.year = yearNumber;
	}
	
	public void readinput() {
		Scanner keyboard = new Scanner(System.in);
		int yearInput = keyboard.nextInt( );
		int monthInput = keyboard.nextInt();
		int dayInput = keyboard.nextInt();
		
		setYear(yearInput);
		setMonth(monthInput);
		setDay(dayInput);
	}
	
	public double getAge(Date otherDate) {
		double age = otherDate.year - this.year;
		return age;
	}
	
	public void writeOutput() {
		System.out.println("세\n");
	}
	
}