package Lecture5_WhileLoopExercise;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isValid = true;
        while (isValid) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            if (currentNum <= 0) {
                isValid = false;
            }
        }
    }
}
