package PBExamFebruary2023;

import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numDancers = Integer.parseInt(scanner.nextLine());
        double numPoints = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String place = scanner.nextLine();

        double prizeMoneySubtotal = 0;
        double prizeMoneyTotal = 0;

        switch (season) {
            case "summer":
                switch (place) {
                    case "Bulgaria":
                        prizeMoneySubtotal = numDancers * numPoints;
                        prizeMoneyTotal = prizeMoneySubtotal * 0.95;
                        break;
                    case "Abroad":
                        prizeMoneySubtotal = (numDancers * numPoints) * 1.5;
                        prizeMoneyTotal = prizeMoneySubtotal * 0.9;
                        break;
                }
                break;
            case "winter":
                switch (place) {
                    case "Bulgaria":
                        prizeMoneySubtotal = numDancers * numPoints;
                        prizeMoneyTotal = prizeMoneySubtotal * 0.92;
                        break;
                    case "Abroad":
                        prizeMoneySubtotal = (numDancers * numPoints) * 1.5;
                        prizeMoneyTotal = prizeMoneySubtotal * 0.85;
                        break;
                }
                break;
        }
        double charityMoney = prizeMoneyTotal * 0.75;
        double moneyPerDancer = (prizeMoneyTotal * 0.25) / numDancers;
        System.out.printf("Charity - %.2f%n", charityMoney);
        System.out.printf("Money per dancer - %.2f%n", moneyPerDancer);
    }
}
