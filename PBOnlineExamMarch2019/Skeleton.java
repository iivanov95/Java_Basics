package PBOnlineExamMarch2019;

import java.util.Scanner;

public class Skeleton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minutes = Integer.parseInt(scanner.nextLine());
        int seconds = Integer.parseInt(scanner.nextLine());
        int timeInSecondsQuota = (minutes * 60) + seconds;
        double pathLength = Double.parseDouble(scanner.nextLine());
        double deductedTimeInSeconds = (pathLength / 120) * 2.5;
        int secondsNeededFor100Meters = Integer.parseInt(scanner.nextLine());
        double timeDone = (pathLength / 100) * secondsNeededFor100Meters - deductedTimeInSeconds;
        if (timeDone <= timeInSecondsQuota) {
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.", timeDone);
        } else {
            double diff = timeDone - timeInSecondsQuota;
            System.out.printf("No, Marin failed! He was %.3f second slower.", diff);
        }
    }
}
