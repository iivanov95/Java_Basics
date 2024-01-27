package Lecture2_Exercise;

import java.util.Scanner;

public class P02_BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        double bonus = 0;

        if (input <= 100){
            bonus = 5;
        } else if (input > 1000) {
            bonus = input * 0.1;
        } else {
            bonus = input * 0.2;
        }

        if (input % 2 == 0){
            bonus = bonus + 1;
        } else if (input % 10 == 5) {
            bonus = bonus + 2;
        }

        System.out.println(bonus);
        System.out.println(input + bonus);

    }
}
