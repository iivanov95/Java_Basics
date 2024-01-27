package PBOnlineExamMarch2019;

import java.util.Scanner;

public class FootballResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstMatchResult = scanner.nextLine();
        String secondMatchResult = scanner.nextLine();
        String thirdMatchResult = scanner.nextLine();
        int wins = 0;
        int draws = 0;
        int losses = 0;
        char firstMatchFirstDigit = firstMatchResult.charAt(0);
        char firstMatchSecondDigit = firstMatchResult.charAt(2);
        char secondMatchFirstDigit = secondMatchResult.charAt(0);
        char secondMatchSecondDigit = secondMatchResult.charAt(2);
        char thirdMatchFirstDigit = thirdMatchResult.charAt(0);
        char thirdMatchSecondDigit = thirdMatchResult.charAt(2);
        if (firstMatchFirstDigit < firstMatchSecondDigit) {
            losses++;
        } else if (firstMatchFirstDigit == firstMatchSecondDigit) {
            draws++;
        } else {
            wins++;
        }
        if (secondMatchFirstDigit < secondMatchSecondDigit) {
            losses++;
        } else if (secondMatchFirstDigit == secondMatchSecondDigit) {
            draws++;
        } else {
            wins++;
        }
        if (thirdMatchFirstDigit < thirdMatchSecondDigit) {
            losses++;
        } else if (thirdMatchFirstDigit == thirdMatchSecondDigit) {
            draws++;
        } else {
            wins++;
        }
        System.out.printf("Team won %d games.%n", wins);
        System.out.printf("Team lost %d games.%n", losses);
        System.out.printf("Drawn games: %d", draws);
    }
}
