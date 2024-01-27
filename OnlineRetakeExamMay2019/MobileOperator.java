package OnlineRetakeExamMay2019;

import java.util.Scanner;

public class MobileOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dealDuration = scanner.nextLine();
        String typeDeal = scanner.nextLine();
        String addedInt = scanner.nextLine();
        int durationMonths = Integer.parseInt(scanner.nextLine());
        double finalAmount = 0;
        switch (dealDuration) {
            case "one":
                switch (typeDeal) {
                    case "Small":
                        if (addedInt.equals("yes")) {
                            finalAmount = durationMonths * (9.98 + 5.5);
                        } else if (addedInt.equals("no")) {
                            finalAmount = durationMonths * 9.98;
                        }
                        System.out.printf("%.2f lv.", finalAmount);
                        break;
                    case "Middle":
                        if (addedInt.equals("yes")) {
                            finalAmount = durationMonths * (18.99 + 4.35);
                        } else if (addedInt.equals("no")) {
                            finalAmount = durationMonths * 18.99;
                        }
                        System.out.printf("%.2f lv.", finalAmount);
                        break;
                    case "Large":
                        if (addedInt.equals("yes")) {
                            finalAmount = durationMonths * (25.98 + 4.35);
                        } else if (addedInt.equals("no")) {
                            finalAmount = durationMonths * 25.98;
                        }
                        System.out.printf("%.2f lv.", finalAmount);
                        break;
                    case "ExtraLarge":
                        if (addedInt.equals("yes")) {
                            finalAmount = durationMonths * (35.99 + 3.85);
                        } else if (addedInt.equals("no")) {
                            finalAmount = durationMonths * 35.99;
                        }
                        System.out.printf("%.2f lv.", finalAmount);
                        break;
                }
                break;
            case "two":
                switch (typeDeal) {
                    case "Small":
                        if (addedInt.equals("yes")) {
                            finalAmount = (durationMonths * (8.58 + 5.5)) * 0.9625;
                        } else if (addedInt.equals("no")) {
                            finalAmount = (durationMonths * 8.58) * 0.9625;
                        }
                        System.out.printf("%.2f lv.", finalAmount);
                        break;
                    case "Middle":
                        if (addedInt.equals("yes")) {
                            finalAmount = (durationMonths * (17.09 + 4.35)) * 0.9625;
                        } else if (addedInt.equals("no")) {
                            finalAmount = (durationMonths * 17.09) * 0.9625;
                        }
                        System.out.printf("%.2f lv.", finalAmount);
                        break;
                    case "Large":
                        if (addedInt.equals("yes")) {
                            finalAmount = (durationMonths * (23.59 + 4.35)) * 0.9625;
                        } else if (addedInt.equals("no")) {
                            finalAmount = (durationMonths * 23.59) * 0.9625;
                        }
                        System.out.printf("%.2f lv.", finalAmount);
                        break;
                    case "ExtraLarge":
                        if (addedInt.equals("yes")) {
                            finalAmount = (durationMonths * (31.79 + 3.85)) * 0.9625;
                        } else if (addedInt.equals("no")) {
                            finalAmount = (durationMonths * 31.79) * 0.9625;
                        }
                        System.out.printf("%.2f lv.", finalAmount);
                        break;
                }
                break;
        }
    }
}
