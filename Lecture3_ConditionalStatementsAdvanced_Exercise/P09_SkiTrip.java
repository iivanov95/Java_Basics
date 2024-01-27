package Lecture3_ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class P09_SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. Входни данни
        //2. Пресмятаме нощувките = дните - 1
        //3. Switch в зависимост от типа стая пресмятаме цената
           //3.1 Проверка дали ще има отстъпка
           //3.2 Пресмятаме отстъпката
        //4. Проверяваме оценката
        //5. Финалната цена спрямо оценката
        //6. Принтираме крайната сума до втория знак

        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String assessment = scanner.nextLine();

        int nights = days - 1;
        double price = 0;

        switch (roomType) {
            case "room for one person":
                price = nights * 18;
                break;

            case "apartment":
                price = nights * 25;
                if (nights < 10) {
                    price = price * 0.7;
                } else if (nights <= 15) {
                    price = price * 0.65;
                } else {
                    price = price * 0.5;
                }
                break;

            case "president apartment":
                price = nights * 35;
                if (nights < 10) {
                    price = price * 0.9;
                } else if (nights <= 15) {
                    price = price * 0.85;
                } else {
                    price = price * 0.8;
                }
                break;
        }

        if (assessment.equals("positive")) {
            price = price * 1.25;
        } else if (assessment.equals("negative")) {
            price = price * 0.9;
        }

        System.out.printf("%.2f", price);

    }
}
