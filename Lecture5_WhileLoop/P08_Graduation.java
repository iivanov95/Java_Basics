package Lecture5_WhileLoop;

import java.util.Scanner;

public class P08_Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int year = 1;
        int poorScoreCount = 0;
        double sumScores = 0;
        while (year <= 12) {
            if (poorScoreCount > 1) {
                break;
            }
            double currentScore = Double.parseDouble(scanner.nextLine());
            if (currentScore < 4) {
                poorScoreCount++;
                continue;
            }
            sumScores += currentScore; // чрез continue се прескача този ред
            year++; // чрез continue се прескача и този ред

        }
        if (poorScoreCount > 1) {
            System.out.printf("%s has been excluded at %d grade", name, year);
        } else {
            double averageScore = sumScores / 12;
            System.out.printf("%s graduated. Average grade: %.2f", name, averageScore);
        }
    }
}
