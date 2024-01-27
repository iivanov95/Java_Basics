package Lecture2_Lab;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double num = Double.parseDouble(scanner.nextLine());

        double roundNum = Math.floor(num);

        System.out.println(roundNum);


    }
}
