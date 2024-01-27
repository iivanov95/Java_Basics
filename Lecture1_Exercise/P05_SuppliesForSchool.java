package Lecture1_Exercise;

import java.util.Scanner;

public class P05_SuppliesForSchool {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

       /* •	Пакет химикали - 5.80 лв.
           Пакет маркери - 7.20 лв.
           Препарат - 1.20 лв (за литър)

           1. Прочитаме потр. вход
           2. Пресмятаме цената за материалте
           3. Пресмятаме общата сума за всички материали
           4. Пресмятаме отстъпката
           5. Общата сума след отстъпката
           6. Принитираме резултат

           */

        int penPackages = Integer.parseInt(scanner.nextLine());
        int highlighterPackages = Integer.parseInt(scanner.nextLine());
        int cleaningAgent = Integer.parseInt(scanner.nextLine());
        int percentDiscount = Integer.parseInt(scanner.nextLine());

        double priceForPenPackages = penPackages * 5.80;
        double priceForHighlighters = highlighterPackages * 7.20;
        double priceForCleaningAgent = cleaningAgent * 1.20;

        double sumWithoutDiscount = priceForHighlighters + priceForPenPackages + priceForCleaningAgent;

        double discount = sumWithoutDiscount * (percentDiscount / 100.0);

        double finalSum = sumWithoutDiscount - discount;

        System.out.println(finalSum);

    }
}
