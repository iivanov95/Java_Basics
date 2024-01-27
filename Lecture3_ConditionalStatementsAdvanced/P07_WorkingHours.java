package Lecture3_ConditionalStatementsAdvanced;

import java.util.Scanner;

public class P07_WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        boolean isWorkDays = day.equals("Monday") ||
                day.equals("Tuesday") ||
                day.equals("Wednesday") ||
                day.equals("Thursday") ||
                day.equals("Friday") ||
                day.equals("Saturday");

        boolean isWorkHours = hour >= 10 && hour <= 18;

        if (isWorkDays && isWorkHours) {
                System.out.println("open");
            } else {
                System.out.println("closed");
            }
        }
    }
