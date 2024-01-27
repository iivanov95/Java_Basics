package PBExamFebruary2023;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numRollsPaper = Integer.parseInt(scanner.nextLine());
        int numRollsCloth = Integer.parseInt(scanner.nextLine());
        double litersGlue = Double.parseDouble(scanner.nextLine());
        int discountPercent = Integer.parseInt(scanner.nextLine());
        double discount = discountPercent * 1.0 /100;
        double rollPaperPrice = 5.80;
        double rollClothPrice = 7.20;
        double gluePricePerLiter = 1.20;

        double subtotal = (numRollsPaper * rollPaperPrice) + (numRollsCloth * rollClothPrice) + (gluePricePerLiter * litersGlue);
        double total = subtotal - (subtotal * discount);

        System.out.printf("%.3f", total);
    }
}
