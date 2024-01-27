package Lecture1_Exercise;

import java.util.Scanner;

public class P03_DepositCalculator {

    public static void main(String[] args) {

        /* 1. Прочитаме от конзолата депозирана сума, срок, лихв. процент
         - депозирана сума - double
         - срок - int
         - лихв. процент - double
         2. Изчисляваме натрупаната лихва за 1 месец
         3. Изчислявме лихвата за всички месеци
         4. Пресмятаме общата сума - депозирана сума + лихв. процент
         5. Принтираме

         сума = депозирана сума  + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)

         */

        Scanner scanner = new Scanner(System.in);

        double deposit = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double percentPerYear = Double.parseDouble(scanner.nextLine());

        double amountPerMonth = (deposit * (percentPerYear / 100)) / 12;

        double totalSum = deposit + amountPerMonth * months;

        System.out.println(totalSum);

    }
}
