package Lecture3_ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class P01_Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        double income = 0;

        int placesToSit = rows * columns;

        if (projection.equals("Premiere")) {
            double pricePerTicket = 12.00;
            income = pricePerTicket * placesToSit;
            System.out.printf("%.2f leva", income);
        } else if (projection.equals("Normal")) {
            double pricePerTicket = 7.50;
            income = pricePerTicket * placesToSit;
            System.out.printf("%.2f leva", income);
        } else if (projection.equals("Discount")) {
            double pricePerTicket = 5.00;
            income = pricePerTicket * placesToSit;
            System.out.printf("%.2f leva", income);
        }
    }
}
