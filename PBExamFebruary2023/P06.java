package PBExamFebruary2023;

import java.util.Scanner;

public class P06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumFirstDigit = Integer.parseInt(scanner.nextLine());
        int firstNumSecondDigit = Integer.parseInt(scanner.nextLine());
        int secondNumFirstDigit = Integer.parseInt(scanner.nextLine());
        int secondNumSecondDigit = Integer.parseInt(scanner.nextLine());
        int counter = 0;

        for (int i = firstNumFirstDigit; i <= 8; i++) {
            if (i % 2 == 0) {
                for (int j = 9; j >= firstNumSecondDigit; j--) {
                    if (j % 2 != 0) {
                        for (int k = secondNumFirstDigit; k <= 8; k++) {
                            if (k % 2 == 0) {
                                for (int l = 9; l >= secondNumSecondDigit; l--) {
                                    if (counter == 6) {
                                        break;
                                    }
                                    if (l % 2 != 0) {
                                        if (i != k && j != l) {
                                            System.out.printf("%d%d - %d%d%n", i, j, k, l);
                                            counter++;

                                        } else if ((i != k && j == l) || (i == k && j != l)) {
                                            System.out.printf("%d%d - %d%d%n", i, j, k, l);
                                            counter++;
                                        } else {
                                            System.out.println("Cannot change the same player.");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}