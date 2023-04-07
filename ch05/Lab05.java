import java.util.Scanner;
import java.util.StringTokenizer;

public class Lab05 {
	static void ex1() {
		int menuNum = 999;
		
		do {
		Temperature newTemp = new Temperature();
		System.out.println("<작업 메뉴>");
		System.out.println("1. 섭씨 화씨 변화");
		System.out.println("2. 온도 비교");
		System.out.println("0. 종료");
		System.out.print("작업을 선택하세요 : ");
		
		Scanner keyboard = new Scanner(System.in);
		menuNum = keyboard.nextInt();
		
		if (menuNum == 1) {
			System.out.print("\n온도 1을 입력하세요: ");
			double valueC = keyboard.nextDouble();
			newTemp.setValue(valueC);
			double valueF = newTemp.getTemperatureFaherenheit();
			System.out.println(valueC + "은 화씨로 " + valueF + "입니다.\n");
		}
		else if (menuNum == 2) {
			System.out.print("\n온도 1을 입력하세요: ");
			double value1 = keyboard.nextDouble();
			System.out.print("온도 2를 입력하세요: ");
			double value2 = keyboard.nextDouble();
			
			newTemp.setValue(value1);
			Temperature newTemp2 = new Temperature(value2);
			
			if (newTemp.IsGreaterThan(newTemp2))
				System.out.println(value1 + "은 " + value2 + "보다 높습니다.\n");
			else if (newTemp.equals(newTemp2))
				System.out.println(value1 + "은 " + value2 + "와 같습니다.\n");
			else
				System.out.println(value1 + "은 " + value2 + "보다 낮습니다.\n");
		}
		else if (menuNum != 0)
			System.out.println("잘못된 입력 번호입니다.\n");
		} while (menuNum != 0);
		
	}
	
	static void ex2() {
		Fraction newFrac = new Fraction();
		Fraction newFrac2 = new Fraction();
		String contin = null;
		String delimiters = "/ ";
		
		do {
			Scanner keyboard = new Scanner(System.in);
			System.out.print("\n분수 1을 입력하세요: ");
			String inputLine = keyboard.nextLine();
			StringTokenizer st = new StringTokenizer(inputLine, delimiters);
			
			int numer = Integer.parseInt(st.nextToken());
			newFrac.setNumerator(numer);
			int deno = Integer.parseInt(st.nextToken());
			newFrac.setDenominator(deno);
			
			System.out.print("분수 2를 입력하세요: ");
			inputLine = keyboard.nextLine();
			st = new StringTokenizer(inputLine, delimiters);
			numer = Integer.parseInt(st.nextToken());
			newFrac2.setNumerator(numer);
			deno = Integer.parseInt(st.nextToken());
			newFrac2.setDenominator(deno);
			
			if (newFrac.equals(newFrac2) == true) {
				System.out.print("분수 ");
				newFrac.DisplayFraction();
				System.out.print("은 ");
				newFrac2.DisplayFraction();
				System.out.print("과 같습니다.\n");
			}
			else if (newFrac.equals(newFrac2) == false){
				System.out.print("분수 ");
				newFrac.DisplayFraction();
				System.out.print("은 ");
				newFrac2.DisplayFraction();
				System.out.print("과 다릅니다.\n");
			}
			
			System.out.print("반복 수행할까요? (y or n) ");
			contin = keyboard.next();

		} while (contin.equals("y"));
	}
	
	static void ex3() {
		BicycleShop shop1 = new BicycleShop("Shop01", 0);
		BicycleShop shop2 = new BicycleShop("Shop02", 0);
		BicycleShop shop3 = new BicycleShop("Shop03", 0);
		
		shop1.sold();
		shop1.sold();
		shop1.sold();
		shop2.sold();
		shop2.sold();
		shop3.sold();
		
		System.out.println();
		shop1.trackSaleStatus();
		shop2.trackSaleStatus();
		shop3.trackSaleStatus();
		
		System.out.println("현재까지 판매대수 " + BicycleShop.overallSale());
	}
	
	public static void main(String[] args) {
		ex1();
		ex2();
		ex3();
	}
}