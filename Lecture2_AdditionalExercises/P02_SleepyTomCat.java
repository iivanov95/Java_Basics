package Lecture2_AdditionalExercises;

import java.util.Scanner;

public class P02_SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int restDays = Integer.parseInt(scanner.nextLine());
        int workDays = 365 - restDays;
        int restDaysPlay = restDays * 127;
        int workDaysPlay = workDays * 63;
        int playTimeNorm = 30000;
        int totalPlayTime = restDaysPlay + workDaysPlay;



        if (totalPlayTime > playTimeNorm) {
            double moreHours = Math.floor((totalPlayTime - playTimeNorm) / 60.0);
            double moreMinutes = (totalPlayTime - playTimeNorm) % 60.0;
            System.out.println("Tom will run away");
            System.out.printf("%.0f hours and %.0f minutes more for play", moreHours, moreMinutes);
        } else {
            double lessHours = Math.floor((playTimeNorm - totalPlayTime) / 60.0);
            double lessMinutes = (playTimeNorm - totalPlayTime) % 60.0;
            System.out.println("Tom sleeps well");
            System.out.printf("%.0f hours and %.0f minutes less for play", lessHours, lessMinutes );
        }
    }
}
