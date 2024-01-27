package PBExamFebruary2023;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tshirtPrice = Double.parseDouble(scanner.nextLine());
        double moneyNeeded = Double.parseDouble(scanner.nextLine());

        double shortsPrice = tshirtPrice * 0.75;
        double socksPrice = shortsPrice * 0.2;
        double shoesPrice = 2 * (tshirtPrice + shortsPrice);
        double totalSum = tshirtPrice + shortsPrice + shoesPrice + socksPrice;
        double discount = totalSum * 0.15;
        double finalMoneySpent = totalSum - discount;
        double diff = moneyNeeded - finalMoneySpent;

        if (finalMoneySpent >= moneyNeeded) {
            System.out.println("Yes, he will earn the world-cup replica ball!");
            System.out.printf("His sum is %.2f lv.", finalMoneySpent);
        } else {
            System.out.println("No, he will not earn the world-cup replica ball.");
            System.out.printf("He needs %.2f lv. more.", diff);
        }
    }
}
