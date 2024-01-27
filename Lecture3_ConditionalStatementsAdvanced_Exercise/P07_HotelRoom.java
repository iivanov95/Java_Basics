package Lecture3_ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class P07_HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double priceApartment = 0;
        double priceStudio = 0;

        switch (month) {
            case "May":
            case "October":
                priceApartment = 65 * nights;
                priceStudio = nights * 50;
                if (nights > 14) {
                    priceApartment = priceApartment * 0.9;
                    priceStudio = priceStudio * 0.7;
                } else if (nights > 7) {
                    priceStudio = priceStudio * 0.95;
                }
                break;

            case "June":
            case "September":
                priceApartment = 68.7 * nights;
                priceStudio = nights * 75.2;
                if (nights > 14) {
                    priceApartment = priceApartment * 0.9;
                    priceStudio = priceStudio * 0.8;
                }

                break;
            case "July":
            case "August":
                priceApartment = 77 * nights;
                priceStudio = nights * 76;
                if (nights > 14) {
                    priceApartment = priceApartment * 0.9;
                }

                break;

        }

        System.out.printf("Apartment: %.2f lv.%n", priceApartment);
        System.out.printf("Studio: %.2f lv.", priceStudio);
    }
}
