package Lecture6_NestedLoopsMoreExercises;

import java.util.Scanner;

public class P01UniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int upperLimitFirstNum = Integer.parseInt(scanner.nextLine());
        int upperLimitSecondNum = Integer.parseInt(scanner.nextLine());
        int upperLimitThirdNum = Integer.parseInt(scanner.nextLine());

        for (int firstDigit = 1; firstDigit <= upperLimitFirstNum; firstDigit++) {
            if (firstDigit % 2 == 0) {
                for (int secondDigit = 2; secondDigit <= upperLimitSecondNum; secondDigit++) {
                    if (secondDigit != 4 && secondDigit != 6) {
                        for (int thirdDigit = 1; thirdDigit <= upperLimitThirdNum; thirdDigit++) {
                            if (thirdDigit % 2 == 0) {
                                System.out.printf("%d %d %d%n", firstDigit, secondDigit, thirdDigit);
                            }
                        }
                    }
                }
            }
        }
    }
}
