package OnlineRetakeExamMay2019;

import java.util.Scanner;

public class Safari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fuelPrice = 2.10;
        int tourGuidePrice = 100;
        double budget = Double.parseDouble(scanner.nextLine());
        double fuelNeeded = Double.parseDouble(scanner.nextLine());
        String day = scanner.nextLine();
        double amountNeeded = 0;
        double diff = 0;
        switch (day) {
            case "Saturday":
                amountNeeded = 0.9 * (fuelNeeded * fuelPrice + tourGuidePrice);
                diff = amountNeeded - budget;
                if (amountNeeded <= budget) {
                    System.out.printf("Safari time! Money left: %.2f lv.", Math.abs(diff));
                } else {
                    System.out.printf("Not enough money! Money needed: %.2f lv.", Math.abs(diff));
                }
                break;
            case "Sunday":
                amountNeeded = 0.8 * (fuelNeeded * fuelPrice + tourGuidePrice);
                diff = amountNeeded - budget;
                if (amountNeeded <= budget) {
                    System.out.printf("Safari time! Money left: %.2f lv.", Math.abs(diff));
                } else {
                    System.out.printf("Not enough money! Money needed: %.2f lv.", Math.abs(diff));
                }
                break;
        }
    }
}
