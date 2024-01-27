package Lecture4_ForLoop_Exercise;

import java.util.Scanner;

public class P07_TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberGroups = Integer.parseInt(scanner.nextLine());
        int musalaCount = 0;
        int monblanCount = 0;
        int kilimandjaroCount = 0;
        int k2Count = 0;
        int everestCount = 0;
        int totalPeopleCount = 0;

        for (int i = 1; i <= numberGroups; i++) {
            int numberPeople = Integer.parseInt(scanner.nextLine());
            if (numberPeople <= 5) {
                musalaCount += numberPeople;
                totalPeopleCount += numberPeople;
            } else if (numberPeople <= 12) {
                monblanCount += numberPeople;
                totalPeopleCount += numberPeople;
            } else if (numberPeople <= 25) {
                kilimandjaroCount += numberPeople;
                totalPeopleCount += numberPeople;
            } else if (numberPeople <= 40) {
                k2Count += numberPeople;
                totalPeopleCount += numberPeople;
            } else {
                everestCount += numberPeople;
                totalPeopleCount += numberPeople;
            }

        }

        double musalaPercent = (musalaCount * 1.0 / totalPeopleCount) * 100;
        double monblanPercent = (monblanCount * 1.0 / totalPeopleCount) * 100;
        double kilimandjaroPercent = (kilimandjaroCount * 1.0 / totalPeopleCount) * 100;
        double k2Percent = (k2Count * 1.0 / totalPeopleCount) * 100;
        double everestPercent = (everestCount * 1.0 / totalPeopleCount) * 100;

        System.out.printf("%.2f%%%n", musalaPercent);
        System.out.printf("%.2f%%%n", monblanPercent);
        System.out.printf("%.2f%%%n", kilimandjaroPercent);
        System.out.printf("%.2f%%%n", k2Percent);
        System.out.printf("%.2f%%%n", everestPercent);

    }
}
