package Lecture6_NestedLoops_Exercise;

import java.util.Scanner;

public class P04_TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numJudges = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        double totalScoresSum = 0;
        int numPresentations = 0;
        while (!input.equals("Finish")) {
            String presentationName = input;
            double sumScores = 0;
            for (int i = 1; i <= numJudges; i++) {
                double currentScore = Double.parseDouble(scanner.nextLine());
                sumScores += currentScore;
            }
            double averageScore = sumScores / numJudges;
            totalScoresSum += averageScore;
            numPresentations++;

            System.out.printf("%s - %.2f.%n", presentationName, averageScore);
            input = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", (totalScoresSum / numPresentations));
    }
}
