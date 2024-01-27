package Lecture1_Exercise;

import java.util.Scanner;

public class P02_RadiansToDegrees {

    public static void main(String[] args) {

        //1. Четем потр. вход
        //2. Преобразуваме от радиани в градуси - градус = радиан * 180 / π
        //3. Принтираме на конзолата

        Scanner scanner = new Scanner(System.in);

        double radians = Double.parseDouble(scanner.nextLine());

        double degrees = radians * 180 / Math.PI;

        System.out.println(degrees);

    }
}
