import java.util.Scanner;
import java.util.StringTokenizer;

public class Lab {
	static void ex1() {
		System.out.println("생년월일>");
		Date dateBirth = new Date();
		Date currentDate = new Date();
		dateBirth.readinput();
		System.out.println("\n날짜입력>");
		currentDate.readinput();
		
		double age = dateBirth.getAge(currentDate);
		System.out.print("\n" + (int)age);
		dateBirth.writeOutput();
	}
	
	static void ex2() {
		WordCount wc = new WordCount();
		wc.resetCounter();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("\n문장 입력>");
		String input = keyboard.nextLine();
		
		String delimiters = " ";
		StringTokenizer nameFactory = new StringTokenizer(input, delimiters);
		
		while (nameFactory.hasMoreTokens()) {
			String current = nameFactory.nextToken();
			
			if (current.startsWith("a") || current.startsWith("A"))
				wc.increaseCounter();
			//A phrase is a group of words that expresses a concept and is used as a unit within a sentence
		}
		
		System.out.print("\n단어의 개수(A or a로 시작) : " + wc.getCount() + "개\n");
	}
	
	static void ex3() {
		Scanner keyboard = new Scanner(System.in);
        StudentRecord record = new StudentRecord(0, 0, 0, 0, 0);

        System.out.print("퀴즈1 점수: ");
        record.setQuiz1(record.getQuiz1());
        System.out.print("퀴즈2 점수: ");
        record.setQuiz2(record.getQuiz2());
        System.out.print("퀴즈3 점수: ");
        record.setQuiz3(record.getQuiz3());

        System.out.print("중간시험 점수: ");
        record.setMidterm(record.getMidterm());
        System.out.print("기말시험 점수: ");
        record.setFinal(record.getFinal());

        System.out.println(record.toString());

	}
	
	public static void main(String[] args) {
		ex1();
		ex2();
		ex3();
	}
}