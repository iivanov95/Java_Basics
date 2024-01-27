package Lecture6_NestedLoops_Exercise;

import java.util.Scanner;

public class P05_SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int number = Integer.parseInt(scanner.nextLine());
//
//        for (int currentNum = 1111; currentNum <= 9999; currentNum++) {
//            int firstDigit = currentNum / 1000;
//            int secondDigit = currentNum / 100 % 10;
//            int thirdDigit = currentNum / 10 % 10;
//            int fourthDigit = currentNum % 10;
//
//            boolean checkFirstDigit = number % firstDigit == 0;
//            boolean checkSecondDigit = secondDigit != 0 && number % secondDigit == 0;
//            boolean checkThirdDigit = thirdDigit != 0 &&  number % thirdDigit == 0;
//            boolean checkFourthDigit = fourthDigit != 0 &&  number % fourthDigit == 0;
//
//            if (checkFirstDigit && checkSecondDigit && checkThirdDigit && checkFourthDigit) {
//                System.out.printf("%d ", currentNum);
//            }
//       }

//      ТУК Е ВТОРИЯ НАЧИН ЗА РЕШАВАНЕ НА ЗАДАЧАТА !!!

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {

                        if (number % i == 0 && number % j == 0 && number % k == 0 && number % l == 0) {
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }
                }
            }
        }
    }
}
