package Lecture2_AdditionalExercises;

import java.util.Scanner;

public class P08_FuelTank2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuelType = scanner.nextLine();
        double fuelQuantity = Double.parseDouble(scanner.nextLine());
        String cardAvailable = scanner.nextLine();
        double fuelPrice = 0;
        double totalSum = 0;

        switch (fuelType) {
            case "Gas":
                fuelPrice = 0.93;
                if (cardAvailable.equals("Yes")) {
                    fuelPrice = fuelPrice - 0.08;
                    if (fuelQuantity > 20 && fuelQuantity <= 25) {
                        fuelPrice = fuelPrice * 0.92;
                    } else if (fuelQuantity > 25) {
                        fuelPrice = fuelPrice * 0.9;
                    }
                    totalSum = fuelPrice * fuelQuantity;
                    System.out.printf("%.2f lv.", totalSum);
                } else if (cardAvailable.equals("No")) {
                    if (fuelQuantity > 20 && fuelQuantity <= 25) {
                        fuelPrice = fuelPrice * 0.92;
                    } else if (fuelQuantity > 25) {
                        fuelPrice = fuelPrice * 0.9;
                    }
                    totalSum = fuelPrice * fuelQuantity;
                    System.out.printf("%.2f lv.", totalSum);
                }
                break;

            case "Gasoline":
                fuelPrice = 2.22;
                if (cardAvailable.equals("Yes")) {
                    fuelPrice = fuelPrice - 0.18;
                    if (fuelQuantity > 20 && fuelQuantity <= 25) {
                        fuelPrice = fuelPrice * 0.92;
                    } else if (fuelQuantity > 25) {
                        fuelPrice = fuelPrice * 0.9;
                    }
                    totalSum = fuelPrice * fuelQuantity;
                    System.out.printf("%.2f lv.", totalSum);
                } else if (cardAvailable.equals("No")) {
                    if (fuelQuantity > 20 && fuelQuantity <= 25) {
                        fuelPrice = fuelPrice * 0.92;
                    } else if (fuelQuantity > 25) {
                        fuelPrice = fuelPrice * 0.9;
                    }
                    totalSum = fuelPrice * fuelQuantity;
                    System.out.printf("%.2f lv.", totalSum);
                }
                break;

            case "Diesel":
                fuelPrice = 2.33;
                if (cardAvailable.equals("Yes")) {
                    fuelPrice = fuelPrice - 0.12;
                    if (fuelQuantity > 20 && fuelQuantity <= 25) {
                        fuelPrice = fuelPrice * 0.92;
                    } else if (fuelQuantity > 25) {
                        fuelPrice = fuelPrice * 0.9;
                    }
                    totalSum = fuelPrice * fuelQuantity;
                    System.out.printf("%.2f lv.", totalSum);
                } else if (cardAvailable.equals("No")) {
                    if (fuelQuantity > 20 && fuelQuantity <= 25) {
                        fuelPrice = fuelPrice * 0.92;
                    } else if (fuelQuantity > 25) {
                        fuelPrice = fuelPrice * 0.9;
                    }
                    totalSum = fuelPrice * fuelQuantity;
                    System.out.printf("%.2f lv.", totalSum);
                }
                break;
        }
    }
}
