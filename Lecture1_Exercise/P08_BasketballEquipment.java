package Lecture1_Exercise;

import java.util.Scanner;

public class P08_BasketballEquipment {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       /* •	Баскетболни кецове – цената им е 40% по-малка от таксата за една година
          •	Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
          •	Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
          •	Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка
          */

        //1. Четем от конзолата
        //2. Смятаме:
           // цената за кецове
           // цената за екип
           // цената за топка
           // цената за аксесоари

        //3. Смятаме общи разходи = такса + кецове + екип + топка + аксесоари
        //4. Принтираме

        int tax = Integer.parseInt(scanner.nextLine());

        double trainersPrice = tax * 0.6;

        double suitPrice = trainersPrice * 0.8;

        double ballPrice = suitPrice * 0.25;

        double accessoriesPrice = ballPrice * 0.2;

        double finalPrice = trainersPrice + suitPrice + ballPrice + accessoriesPrice + tax;

        System.out.println(finalPrice);

    }
}
