package Lecture2_Exercise;

import java.util.Scanner;

public class P08_LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int episodeTime = Integer.parseInt(scanner.nextLine());
        int breakTime = Integer.parseInt(scanner.nextLine());

        double lunchTime = breakTime / 8.0;
        double restTime = breakTime / 4.0;

        double remainingTime = breakTime - restTime - lunchTime;
        double timeLeft = Math.ceil(remainingTime - episodeTime);

        if (remainingTime >= episodeTime){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", name, timeLeft);
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", name, Math.ceil(episodeTime - remainingTime));
        }
    }
}
