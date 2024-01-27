package Lecture6_NestedLoops;

import java.util.Scanner;

public class P05_Trip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String destination = input;
            double budget = Double.parseDouble(scanner.nextLine());
            double currentSum = 0;
            while (currentSum < budget) {
                double amount = Double.parseDouble(scanner.nextLine());
                currentSum += amount;
            }
            System.out.printf("Going to %s!%n", destination);
            input = scanner.nextLine();
        }
    }
}
