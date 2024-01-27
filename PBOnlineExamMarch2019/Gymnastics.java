package PBOnlineExamMarch2019;

import java.util.Scanner;

public class Gymnastics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine();
        String instrument = scanner.nextLine();
        double totalScore = 0;
        double percent = 0;
        switch (instrument) {
            case "ribbon":
                switch (country) {
                    case "Russia":
                        totalScore = 9.100 + 9.400;
                        percent = 100 - ((totalScore / 20) * 100);
                        System.out.printf("The team of %s get %.3f on %s.%n", country, totalScore, instrument);
                        System.out.printf("%.2f%%", percent);
                        break;
                    case "Bulgaria":
                        totalScore = 9.600 + 9.400;
                        percent = 100 - ((totalScore / 20) * 100);
                        System.out.printf("The team of %s get %.3f on %s.%n", country, totalScore, instrument);
                        System.out.printf("%.2f%%", percent);
                        break;
                    case "Italy":
                        totalScore = 9.200 + 9.500;
                        percent = 100 - ((totalScore / 20) * 100);
                        System.out.printf("The team of %s get %.3f on %s.%n", country, totalScore, instrument);
                        System.out.printf("%.2f%%", percent);
                        break;
                }
                break;

            case "hoop":
                switch (country) {
                    case "Russia":
                        totalScore = 9.300 + 9.800;
                        percent = 100 - ((totalScore / 20) * 100);
                        System.out.printf("The team of %s get %.3f on %s.%n", country, totalScore, instrument);
                        System.out.printf("%.2f%%", percent);
                        break;
                    case "Bulgaria":
                        totalScore = 9.550 + 9.750;
                        percent = 100 - ((totalScore / 20) * 100);
                        System.out.printf("The team of %s get %.3f on %s.%n", country, totalScore, instrument);
                        System.out.printf("%.2f%%", percent);
                        break;
                    case "Italy":
                        totalScore = 9.750 + 9.350;
                        percent = 100 - ((totalScore / 20) * 100);
                        System.out.printf("The team of %s get %.3f on %s.%n", country, totalScore, instrument);
                        System.out.printf("%.2f%%", percent);
                        break;
                }
                break;

            case "rope":
                switch (country) {
                    case "Russia":
                        totalScore = 9.600 + 9.000;
                        percent = 100 - ((totalScore / 20) * 100);
                        System.out.printf("The team of %s get %.3f on %s.%n", country, totalScore, instrument);
                        System.out.printf("%.2f%%", percent);
                        break;
                    case "Bulgaria":
                        totalScore = 9.500 + 9.400;
                        percent = 100 - ((totalScore / 20) * 100);
                        System.out.printf("The team of %s get %.3f on %s.%n", country, totalScore, instrument);
                        System.out.printf("%.2f%%", percent);
                        break;
                    case "Italy":
                        totalScore = 9.700 + 9.150;
                        percent = 100 - ((totalScore / 20) * 100);
                        System.out.printf("The team of %s get %.3f on %s.%n", country, totalScore, instrument);
                        System.out.printf("%.2f%%", percent);
                        break;
                }
                break;
        }
    }
}
