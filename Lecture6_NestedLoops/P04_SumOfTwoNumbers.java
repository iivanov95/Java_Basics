package Lecture6_NestedLoops;

import java.util.Scanner;

public class P04_SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int lastNUm = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());
        int countComb = 0;
        boolean isValid = false;

        for (int i = firstNum; i <= lastNUm; i++) {
            for (int j = firstNum; j <= lastNUm; j++) {
                countComb++;
                int sum = i + j;
                if (sum == magicNum) {
                    isValid = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)%n", countComb, i, j, sum);
                    break;
                }
            }
            if (isValid) {
                break;
            }
        }
        if (!isValid) {
            System.out.printf("%d combinations - neither equals %d%n", countComb, magicNum);
        }
    }
}
