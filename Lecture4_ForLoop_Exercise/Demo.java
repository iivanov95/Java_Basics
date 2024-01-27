package Lecture4_ForLoop_Exercise;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int a = 5;
//        int b = 10;
//        //Инкрементиране
//        ++a; // увеличаваме стойността преди други действия
//        System.out.println(++a);// увеличаваме стойността преди принтирането
//        System.out.println(a++); // 1. Принтираме преди увеличаване на стойността
//        System.out.println(a); // 2. Принтираме увеличената стойност
//
//        Декрементиране
//        System.out.println(--b); //намаляваме стойността преди други действия
//        System.out.println(b--); // 1. Принтираме преди намаляне на стойността
//        System.out.println(b); // 2. Принтираме намалената стойност
//
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//        }

        String name = "Ivan";
        char firstSymbol = name.charAt(0);

        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
    }
}
