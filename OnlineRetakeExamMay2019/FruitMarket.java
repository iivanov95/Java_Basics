package OnlineRetakeExamMay2019;

import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double strawberryPrice = Double.parseDouble(scanner.nextLine());
        double quantityBananas = Double.parseDouble(scanner.nextLine());
        double quantityOranges = Double.parseDouble(scanner.nextLine());
        double quantityRaspberries = Double.parseDouble(scanner.nextLine());
        double quantityStrawberries = Double.parseDouble(scanner.nextLine());
        double raspberriesPrice = 0.5 * strawberryPrice;
        double orangesPrice = 0.6 * raspberriesPrice;
        double bananasPrice = 0.2 * raspberriesPrice;

        double totalSum = strawberryPrice * quantityStrawberries + bananasPrice * quantityBananas + orangesPrice * quantityOranges + raspberriesPrice * quantityRaspberries;

        System.out.printf("%.2f", totalSum);
    }
}
