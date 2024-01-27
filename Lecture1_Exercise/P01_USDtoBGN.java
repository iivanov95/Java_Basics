package Lecture1_Exercise;

import java.util.Scanner;

public class P01_USDtoBGN {
    public static void main(String[] args) {

        //1. Четем потр. вход
        //2. Пресмятане стойността за бълг. лева: 1 USD = 1.79549 BGN
        //3. Принтираме на конзолата

        Scanner scanner = new Scanner(System.in);

        double usd = Double.parseDouble(scanner.nextLine());

        double result = usd * 1.79549;

        System.out.println(result);

    }
}
