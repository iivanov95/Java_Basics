package Lecture5_WhileLoop;

import java.util.Scanner;

public class P02_Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String regPass = scanner.nextLine();
        String loginPass = scanner.nextLine();
        while (!loginPass.equals(regPass)) {
            loginPass = scanner.nextLine();
        }
        System.out.printf("Welcome %s!%n", username);
    }
}
