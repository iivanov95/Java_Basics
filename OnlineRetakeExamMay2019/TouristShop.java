package OnlineRetakeExamMay2019;

import java.util.Scanner;

public class TouristShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();
        double equipmentSum = 0;
        int productCount = 0;
        while (!command.equals("Stop")) {
            double productPrice = Double.parseDouble(scanner.nextLine());
            if (budget < productPrice) {
                double diff = productPrice - budget;
                System.out.println("You don't have enough money!");
                System.out.printf("You need %.2f leva!", diff);
                break;
            }
            productCount++;
            if (productCount % 3 == 0) {
                productPrice = 0.5 * productPrice;
            }
            budget -= productPrice;
            equipmentSum += productPrice;
            command = scanner.nextLine();
        }
        if (command.equals("Stop")) {
            System.out.printf("You bought %d products for %.2f leva.", productCount, equipmentSum);
        }
    }
}