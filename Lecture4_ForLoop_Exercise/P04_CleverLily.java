package Lecture4_ForLoop_Exercise;

import java.util.Scanner;

public class P04_CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        //1. Фор лууп за всяка година
           //1.1 Проверяване дали е четна или нечетна, четна пари, нечетна играчка
        //2. Смятаме колко пари е събрала, броя на играчките по цената плюс събраните пари
        //3. Проверяваме дали парите стигат за пералня

        double sum = 0;
        int toyCount = 0;
        //double  moneyEvenAge = 10
        for (int currentAge = 1; currentAge <= age; currentAge++) {

            if (currentAge % 2 ==0) {
                sum = sum + ((currentAge * 5) - 1);//sum += ((currentAge * 5) - 1)
                //sum += moneyEvenAge
                //moneyEvenAge += 10
                //sum--
            } else {
                toyCount++;
            }

        }

        sum += toyCount * toyPrice;
        double diff = Math.abs(sum - washingMachinePrice);
        if (sum >= washingMachinePrice) {
            System.out.printf("Yes! %.2f", diff);
        } else {
            System.out.printf("No! %.2f", diff);
        }
    }
}
