package Lecture1_AdditionalExercies;

import java.util.Scanner;

public class P09_WeatherForecast {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String weatherOutside = scanner.nextLine();

        if (weatherOutside.equals("sunny")) {
            System.out.println("It's warm outside!");
        } else {
            System.out.println("It's cold outside!");
        }
    }
}
