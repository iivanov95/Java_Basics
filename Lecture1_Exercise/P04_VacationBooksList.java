package Lecture1_Exercise;

import java.util.Scanner;

public class P04_VacationBooksList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int currentPages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int numberDays = Integer.parseInt(scanner.nextLine());

        int neededTime = currentPages / pagesPerHour;
        int hoursPerDay = neededTime / numberDays;

        System.out.println(hoursPerDay);

    }
}
