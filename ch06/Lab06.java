import java.util.Scanner;

public class Lab06 {
    static void ex1(String[] args) {
        int size, zeroNum, plusNum;
        size = Integer.parseInt(args[0]);
        zeroNum = Integer.parseInt(args[1]);
        plusNum = Integer.parseInt(args[2]);
        int[] array = new int[size];

        System.out.println(size);
        System.out.println("배열인덱스   값");
        for (int i = 0; i < size; i++) {
            array[i] = zeroNum + (plusNum * i);
            System.out.println("    " + i + "        " + array[i]);
        }
    }

    static void ex2() {
        PartiallyFilledArray array = new PartiallyFilledArray();
        int menuNum = 0;
        Scanner keyboard = new Scanner(System.in);
        String menuSelectPhrase = "\n<작업메뉴>\n" +
                "1. 배열에 데이터 입력\n" +
                "2. 데이터 추가\n" +
                "3. 데이터 위치 반환\n" +
                "4. 배열 데이터 출력\n" +
                "5. 종료\n" +
                "메뉴 선택 : ";

        do {
            System.out.print(menuSelectPhrase);
            menuNum = keyboard.nextInt();

            switch (menuNum) {
                case 1:
                    firstMenu(array);
                    break;
                case 2:
                    secondMenu(array);
                    break;
                case 3:
                    thirdMenu(array);
                    break;
                case 4:
                    fourthMenu(array);
                    break;
            }
        } while (menuNum != 5);
    }

    public static void main(String[] args) {
        //ex1(args);
        ex2();
    }

    static void firstMenu(PartiallyFilledArray array) {
        double data;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("\nint 데이터 5개를 입력하세요 : ");
        for (int i = 0; i < 5; i++) {
            String dataString = keyboard.next();
            array.add(Integer.parseInt(dataString));
        }
        return;
    }

    static void secondMenu(PartiallyFilledArray array) {
        double data;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("\n데이터를 입력하세요 : ");
        data = keyboard.nextDouble();
        array.add(data);
        return;
    }

    static void thirdMenu(PartiallyFilledArray array) {
        double data;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("\n데이터를 입력하세요 : ");
        data = keyboard.nextDouble();
        System.out.print("위치(index) = ");
        array.getIndex(data);
        System.out.println("");
        return;
    }

    static void fourthMenu(PartiallyFilledArray array) {
        System.out.print("\n현재 배열 = ");
        for (int i = 0; i < array.getNumberOfElements(); i++)
            System.out.print((int) array.getElement(i) + " ");
        System.out.print("\n");
        return;
    }
}