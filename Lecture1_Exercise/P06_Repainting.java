package Lecture1_Exercise;

import java.util.Scanner;

public class P06_Repainting {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /*
        •	Предпазен найлон - 1.50 лв. за кв. метър
        •	Боя - 14.50 лв. за литър
        •	Разредител за боя - 5.00 лв. за литър*/

        //1. Четем от конзолата
        //2. Пресмятаме колко струват всички материали
        //3. Пресмятаме колко струва на час работата на майсторите
        //4. Изчисляваме общата сума за ремонта
        //5. Принтираме

        int neededNylon = Integer.parseInt(scanner.nextLine());
        int neededPaint = Integer.parseInt(scanner.nextLine());
        int neededPaintThinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double priceNylon = (neededNylon + 2 ) * 1.50;
        double pricePaint = (neededPaint * 1.1) * 14.50;
        double pricePaintThinner = neededPaintThinner * 5.00;

        double materialsSum = priceNylon + pricePaint + pricePaintThinner + 0.40;

        double priceForBuilders = hours * (materialsSum * 0.30);

        double totalAmount = priceForBuilders + materialsSum;

        System.out.println(totalAmount);

    }
}
