package Lecture4_ForLoop_Exercise;

import java.util.Scanner;

public class P03_Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int countP1 = 0;
        int countP2 = 0;
        int countP3 = 0;
        int countP4 = 0;
        int countP5 = 0;
        
        //1. Потр. вход - n на брой числа
            //1.1 Трябва да проверим числото в кой диапазон влиза
            //1.2 Правим Фор цикъл с N на брой повторения 
        //2. Прочитаме число
        //3. Проверяваме в кой диапазон е числото
        //4. Пресмятаме процентите за всеки диапазон
        //5. Принтираме процентите
        for (int i = 1; i <= n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            if (currentNum < 200) {
                countP1++; // countP1 = countP1 + 1;
            } else if (currentNum <= 399) {
                countP2++;
            } else if (currentNum <= 599) {
                countP3++;
            } else if (currentNum <= 799) {
                countP4++;
            } else {
                countP5++;
            }
        }

        double p1Percent = (countP1 * 1.0 / n) * 100;
        double p2Percent = (countP2 * 1.0 / n) * 100;
        double p3Percent = (countP3 * 1.0 / n) * 100;
        double p4Percent = (countP4 * 1.0 / n) * 100;
        double p5Percent = (countP5 * 1.0 / n) * 100;

        System.out.printf("%.2f%%%n", p1Percent);
        System.out.printf("%.2f%%%n", p2Percent);
        System.out.printf("%.2f%%%n", p3Percent);
        System.out.printf("%.2f%%%n", p4Percent);
        System.out.printf("%.2f%%%n", p5Percent);
    }
}
