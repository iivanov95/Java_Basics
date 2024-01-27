package Lecture4_ForLoop_Exercise;

import java.util.Scanner;

public class P08_TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countTournaments = Integer.parseInt(scanner.nextLine());
        int startingPoints = Integer.parseInt(scanner.nextLine());

        int countWins = 0;
        int sumAllPoints = 0;
        for (int i = 0; i < countTournaments; i++) {
            String currentStage = scanner.nextLine();
            if (currentStage.equals("W")) {
                countWins++;
                sumAllPoints += 2000;
            } else if (currentStage.equals("F")) {
                sumAllPoints += 1200;
            } else if (currentStage.equals("SF")) {
                sumAllPoints += 720;
            }
        }

        int finalPoints = startingPoints + sumAllPoints;
        int averagePoints = sumAllPoints / countTournaments;
        double percentageWins = (countWins * 1.0 / countTournaments) * 100;

        System.out.printf("Final points: %d%n", finalPoints);
        System.out.printf("Average points: %d%n", averagePoints);
        System.out.printf("%.2f%%", percentageWins);
    }
}
