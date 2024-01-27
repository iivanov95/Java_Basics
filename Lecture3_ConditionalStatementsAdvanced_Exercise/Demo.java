package Lecture3_ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        if (num == 2 || num % 2 == 0) {
            System.out.printf("Number is even%n");
        } else if (num == 2) {
            if (num % 2 ==0) {
                System.out.printf("Number is even%n");
            }
            System.out.println("Number is " + 2);
        }
    }
}
