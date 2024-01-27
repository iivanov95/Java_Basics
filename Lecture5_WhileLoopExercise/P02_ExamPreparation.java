package Lecture5_WhileLoopExercise;

import java.util.Scanner;

public class P02_ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalBadGrades = Integer.parseInt(scanner.nextLine());
        int numBadGrades = 0;
        int totalScore = 0;
        int numProblems = 0;
        String lastProblem = "";

        while (numBadGrades < totalBadGrades) {
            String currentProblem = scanner.nextLine();
            if (currentProblem.equals("Enough")) {
                break;
            }
            int currentGrade = Integer.parseInt(scanner.nextLine());
            if (currentGrade <= 4) {
                numBadGrades++;
            }
            totalScore += currentGrade;
            numProblems++;
            lastProblem = currentProblem;
        }
        double averageScore = totalScore * 1.0/ numProblems;
        if (numBadGrades >= totalBadGrades) {
            System.out.printf("You need a break, %d poor grades.", numBadGrades);
        } else {
            System.out.printf("Average score: %.2f%n", averageScore);
            System.out.printf("Number of problems: %d%n", numProblems);
            System.out.printf("Last problem: %s", lastProblem);
        }
    }
}
