package Lecture3_ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P11_FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0.0;

        boolean workDay = day.equals("Monday") ||
                day.equals("Tuesday") ||
                day.equals("Wednesday") ||
                day.equals("Thursday") ||
                day.equals("Friday");

        boolean weekend = day.equals("Saturday") || day.equals("Sunday");

        if (workDay) {
            if (fruit.equals("banana")) {
                price = 2.50;
                System.out.printf("%.2f", price * quantity);
            } else if (fruit.equals("apple")) {
                price = 1.20;
                System.out.printf("%.2f", price * quantity);
            } else if (fruit.equals("orange")) {
                price = 0.85;
                System.out.printf("%.2f", price * quantity);
            } else if (fruit.equals("grapefruit")) {
                price = 1.45;
                System.out.printf("%.2f", price * quantity);
            } else if (fruit.equals("kiwi")) {
                price = 2.70;
                System.out.printf("%.2f", price * quantity);
            } else if (fruit.equals("pineapple")) {
                price = 5.50;
                System.out.printf("%.2f", price * quantity);
            } else if (fruit.equals("grapes")) {
                price = 3.85;
                System.out.printf("%.2f", price * quantity);
            } else {
                System.out.println("error");
            }

        } else if (weekend) {
            if (fruit.equals("banana")) {
                price = 2.70;
                System.out.printf("%.2f", price * quantity);
            } else if (fruit.equals("apple")) {
                price = 1.25;
                System.out.printf("%.2f", price * quantity);
            } else if (fruit.equals("orange")) {
                price = 0.90;
                System.out.printf("%.2f", price * quantity);
            } else if (fruit.equals("grapefruit")) {
                price = 1.60;
                System.out.printf("%.2f", price * quantity);
            } else if (fruit.equals("kiwi")) {
                price = 3.00;
                System.out.printf("%.2f", price * quantity);
            } else if (fruit.equals("pineapple")) {
                price = 5.60;
                System.out.printf("%.2f", price * quantity);
            } else if (fruit.equals("grapes")) {
                price = 4.20;
                System.out.printf("%.2f", price * quantity);
            } else {
                System.out.println("error");
            }
        } else {
            System.out.println("error");
        }
    }
}
