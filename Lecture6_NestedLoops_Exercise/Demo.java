package Lecture6_NestedLoops_Exercise;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int lastNum = number % 10;
        System.out.printf("%d", lastNum);
    }
}
