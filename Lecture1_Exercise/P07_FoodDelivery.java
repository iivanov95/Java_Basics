package Lecture1_Exercise;

import java.util.Scanner;

public class P07_FoodDelivery {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       /* •	Пилешко меню –  10.35 лв.
•	Меню с риба – 12.40 лв.
•	Вегетарианско меню  – 8.15 лв.*/

        //1. Прочитаме потр. вход
        //2. Изчисляваме ценита на трите менюта
        //3. Изчисляваме общата сметка
        //4. Изчисляваме цената на десерта - 20 % от общата сметка
        //5. Изчисляваме крайната стойност като добавяме 2,50 лв. за доставка
        //6. Принтираме

        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int vegetarianMenu = Integer.parseInt(scanner.nextLine());

        double priceChicken = chickenMenu * 10.35;
        double priceFish = fishMenu * 12.40;
        double priceVegetarian = vegetarianMenu * 8.15;

        double dessertPrice = (priceChicken + priceFish + priceVegetarian) * 0.2;

        double totalSum = 2.50 + priceChicken + dessertPrice + priceFish + priceVegetarian;

        System.out.println(totalSum);

    }
}
