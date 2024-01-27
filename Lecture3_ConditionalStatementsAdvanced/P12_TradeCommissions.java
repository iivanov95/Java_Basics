package Lecture3_ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P12_TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double income = Double.parseDouble(scanner.nextLine());
        double commission = 0;

        if (city.equals("Sofia")) {
            if (income >= 0 && income <= 500) {
                commission = 0.05 * income;
            } else if (income > 500 && income <= 1000) {
                commission = 0.07 * income;
            } else if (income > 1000 && income < 10000) {
                commission = 0.08 * income;
            } else if (income > 10000) {
                commission = 0.12 * income;
            } else {
                System.out.println("error");
            }
        } else if (city.equals("Varna")) {
            if (income >= 0 && income <= 500) {
                commission = 0.045 * income;
            } else if (income > 500 && income <= 1000) {
                commission = 0.075 * income;
            } else if (income > 1000 && income < 10000) {
                commission = 0.10 * income;
            } else if (income > 10000) {
                commission = 0.13 * income;
            } else {
                System.out.println("error");
            }
        } else if (city.equals("Plovdiv")) {
            if (income >= 0 && income <= 500) {
                commission = 0.055 * income;
            } else if (income > 500 && income <= 1000) {
                commission = 0.08 * income;
            } else if (income > 1000 && income < 10000) {
                commission = 0.12 * income;
            } else if (income > 10000) {
                commission = 0.145 * income;
            } else {
                System.out.println("error");
            }
        } else {
            System.out.println("error");
        }
        if (commission > 0) {
            System.out.printf("%.2f", commission);
        }
    }
}
