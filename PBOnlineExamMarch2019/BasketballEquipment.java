package PBOnlineExamMarch2019;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yearlyFee = Integer.parseInt(scanner.nextLine());
        double sneakers = yearlyFee * 0.6;
        double suit = sneakers * 0.8;
        double ball = suit * 0.25;
        double accessories = ball * 0.2;
        double totalSum = yearlyFee + sneakers + ball + suit + accessories;
        System.out.printf("%.2f", totalSum);
    }
}
