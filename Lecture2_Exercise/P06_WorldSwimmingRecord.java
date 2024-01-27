package Lecture2_Exercise;

import java.util.Scanner;

public class P06_WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. Потр. вход
        //2. Пресмятаме забавянето по 12.5 сек за 15 м.
        //3. Резултата, за който Иван преплува разстоянието -> разстоянието * времето за 1м. + забавянето
        //4. Проверка дали е подобрил рекорда

        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeForOneMeter = Double.parseDouble(scanner.nextLine());

        double delay = (Math.floor(distance / 15)) * 12.5;

        double result = distance * timeForOneMeter + delay;

        if (record > result){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", result);
        } else {
            double excessTime = result - record;
            System.out.printf("No, he failed! He was %.2f seconds slower.", excessTime);
        }
    }
}
