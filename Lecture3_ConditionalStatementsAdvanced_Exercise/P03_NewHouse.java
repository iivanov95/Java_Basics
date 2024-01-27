package Lecture3_ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class P03_NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. Прочитаме от конзолата
        //2. Правим един switch за всяко цвете
        //2.1. Пресмятаме цената за общо цветята
        //2.2 Вложена проверка за отстъпките
        //3. Проверяваме дали бюджета ще стигне

        String flowerType = scanner.nextLine();
        int flowerQuantity = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double price = 0.0;

        switch (flowerType) {
            case "Roses":
                price = 5 * flowerQuantity;
                if (flowerQuantity > 80) {
                    price =  price * 0.9;
                }
                break;
            case "Dahlias":
                price = 3.80 * flowerQuantity;
                if (flowerQuantity > 90) {
                    price =  price * 0.85;
                }
                break;
            case "Tulips":
                price = 2.80 * flowerQuantity;
                if (flowerQuantity > 80) {
                    price =  price * 0.85;
                }
                break;
            case "Narcissus":
                price = 3 * flowerQuantity;
                if (flowerQuantity < 120) {
                    price =  price * 1.15;
                }
                break;
            case "Gladiolus":
                price = 2.50 * flowerQuantity;
                if (flowerQuantity < 80) {
                    price =  price * 1.20;
                }
                break;
        }

        double difference = Math.abs(budget - price);

        if (budget >= price) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerQuantity, flowerType, difference);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", difference);
        }
    }
}
