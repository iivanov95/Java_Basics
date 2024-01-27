package Lecture3_ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class P04_FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int numberOfPeople = Integer.parseInt(scanner.nextLine());

        double boatPrice = 0;

        switch (season) {
            case "Spring":
                boatPrice = 3000;
                if (numberOfPeople <=6) {
                    boatPrice = boatPrice * 0.9;
                } else if (numberOfPeople <= 11) {
                    boatPrice = boatPrice * 0.85;
                } else {
                    boatPrice = boatPrice * 0.75;
                }

                if (numberOfPeople % 2 == 0) {
                    boatPrice = boatPrice * 0.95;
                }
                break;

            case "Summer":
                boatPrice = 4200;
                if (numberOfPeople <=6) {
                    boatPrice = boatPrice * 0.9;
                } else if (numberOfPeople <= 11) {
                    boatPrice = boatPrice * 0.85;
                } else {
                    boatPrice = boatPrice * 0.75;
                }

                if (numberOfPeople % 2 == 0) {
                    boatPrice = boatPrice * 0.95;
                }
                break;

            case "Autumn":
                boatPrice = 4200;
                if (numberOfPeople <=6) {
                    boatPrice = boatPrice * 0.9;
                } else if (numberOfPeople <= 11) {
                    boatPrice = boatPrice * 0.85;
                } else {
                    boatPrice = boatPrice * 0.75;
                }
                break;

            case "Winter":
                boatPrice = 2600;
                if (numberOfPeople <=6) {
                    boatPrice = boatPrice * 0.9;
                } else if (numberOfPeople <= 11) {
                    boatPrice = boatPrice * 0.85;
                } else {
                    boatPrice = boatPrice * 0.75;
                }

                if (numberOfPeople % 2 == 0) {
                    boatPrice = boatPrice * 0.95;
                }
                break;
        }
        double diff = Math.abs(budget - boatPrice);
        if (budget > boatPrice) {
            System.out.printf("Yes! You have %.2f leva left.", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }
    }
}
