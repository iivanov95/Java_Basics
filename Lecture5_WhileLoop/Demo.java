package Lecture5_WhileLoop;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int a = Integer.parseInt(scanner.nextLine());
//        while (true) {
//            if (a > 10) {
//                break;
//            }
//            System.out.println("a = " +a);
//            a++;
//        }
        int a = 5;
        while (a <= 10) {
            System.out.println("a = " +a);
            a++;
        }
        // пример със Стринг
        String input = scanner.nextLine(); // изискай Инпут от скенера
        while (!input.equals("Stop")) { // докато Инпут е различно от СТОП
            System.out.println(input); // принтирай Инпут
            input = scanner.nextLine(); // и отново изискай нов Инпут
        }
    }
}
