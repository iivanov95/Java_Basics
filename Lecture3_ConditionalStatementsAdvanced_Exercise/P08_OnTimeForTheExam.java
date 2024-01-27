package Lecture3_ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class P08_OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. Четем от конзолата
        //2. Прехвърляме всичко в минути -> общо минути за изпита, общо минути на пристигане
        //3. Разликата в общите минути на изпита и на пристигане
        //4. Проверяваме дали и закъснял
            //Вложена проверка дали е закъснял повече от час или не

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMin = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMin = Integer.parseInt(scanner.nextLine());

        int examTotalMin = examHour * 60 + examMin;
        int arrivalTotalMin = arrivalHour * 60 + arrivalMin;

        int diff = Math.abs(examTotalMin - arrivalTotalMin);

        if (arrivalTotalMin > examTotalMin) {
            System.out.println("Late");
            if (diff < 60) {
                System.out.printf("%d minutes after the start", diff);
            } else {
                int hour = diff / 60;
                int minutes = diff % 60;
                System.out.printf("%d:%02d hours after the start", hour, minutes);
            }
        } else if (diff <= 30) {
            System.out.println("On time");
            if (examTotalMin != arrivalTotalMin) {
                System.out.printf("%d minutes before the start", diff);
            }
        } else {
            System.out.println("Early");
            if (diff < 60) {
                System.out.printf("%d minutes before the start", diff);
            } else {
                int hour = diff / 60;
                int minutes = diff % 60;
                System.out.printf("%d:%02d hours before the start", hour, minutes);
            }
        }
    }
}
