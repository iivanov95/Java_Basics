package PBExamFebruary2023;

import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numDaysTraining = Integer.parseInt(scanner.nextLine());
        double numKmsFirstDay = Double.parseDouble(scanner.nextLine());
        double KmsRan = numKmsFirstDay;
        double total = numKmsFirstDay;
        for (int i = 1; i <= numDaysTraining; i++) {
            int percentIncreaseNorm = Integer.parseInt(scanner.nextLine());
            double normIncrease = percentIncreaseNorm * 1.0 / 100;
            KmsRan += KmsRan * normIncrease;
            total += KmsRan;
        }
        if (total >= 1000) {
            System.out.printf("You've done a great job running %.0f more kilometers!", Math.ceil(total - 1000));
        } else {
            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers", Math.ceil(1000 - total));
        }
    }
}
