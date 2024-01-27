package Lecture3_ConditionalStatementsAdvanced;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        if (num > 5 && num < 10 && num % 2 ==0) {
            System.out.println("Valid!");
        }
        //МОЖЕ И ТАКА
        if (num > 5) {
            if (num < 10) {
                if (num % 2 == 0){
                    System.out.println("Valid!");
                }
            }
        }




    }
}
