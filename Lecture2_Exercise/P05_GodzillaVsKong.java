package Lecture2_Exercise;

import java.util.Scanner;

public class P05_GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Декорът е 10% от бюджета.
        При повече от 150 статиста, 10% отстъпка от облеклото
        Бюджет - double
        Брой статисти - int
        Цена за облекло на 1 статист - double
         */

        //1. Потр. вход
        //2. Смятаме цената за декора
        //3. Смятаме цената за облеклото
        //4. Проверяваме дали статистите са повече от 150
        //5. Смятаме финалната сума = цена за декор + сумата за облекло
        //6. Проверяваме дали бюджета е достатъчен
           // ако да, "Action!" "Wingard starts filming with {останалите пари} leva left."
           // ако не,"Not enough money!" "Wingard needs {парите недостигащи за филма} leva more."

        double budget = Double.parseDouble(scanner.nextLine());
        int countExtras = Integer.parseInt(scanner.nextLine());
        double priceForOnePerson = Double.parseDouble(scanner.nextLine());

        double decorPrice = budget * 0.1;
        double clothesPrice = countExtras * priceForOnePerson;

        if (countExtras > 150) {
            clothesPrice = clothesPrice * 0.9;
        }

        double finalSum = decorPrice + clothesPrice;
        double difference = Math.abs(finalSum - budget);

        if (finalSum > budget) {
            System.out.println("Not enough money!");
                        System.out.printf("Wingard needs %.2f leva more.", difference);
        } else {
            System.out.println("Action!");
                        System.out.printf("Wingard starts filming with %.2f leva left.", difference);
        }
    }
}
