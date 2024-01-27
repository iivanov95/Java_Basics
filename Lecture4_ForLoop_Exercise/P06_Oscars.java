package Lecture4_ForLoop_Exercise;

import java.util.Scanner;

public class P06_Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int numJudges = Integer.parseInt(scanner.nextLine());
        double sumPointsTotal = academyPoints;

        for (int i = 1; i <= numJudges; i++) {
            String judgeName = scanner.nextLine();
            double judgesPoints = Double.parseDouble(scanner.nextLine());

            sumPointsTotal += ((judgesPoints * judgeName.length()) / 2);

            if (sumPointsTotal >= 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", name, sumPointsTotal);
                break;
            }
        }
        if (sumPointsTotal < 1250.5) {
            System.out.printf("Sorry, %s you need %.1f more!", name, Math.abs(1250.5 - sumPointsTotal));
        }
    }
}
