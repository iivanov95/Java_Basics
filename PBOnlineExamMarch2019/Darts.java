package PBOnlineExamMarch2019;

import java.util.Scanner;

public class Darts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.nextLine();
        int playerPoints = 301;
        int successfulShotsNum = 0;
        int unsuccessfulShotsNum = 0;
        String command = scanner.nextLine();
        while (!command.equals("Retire")) {
            String boardSpot = command;
            switch (boardSpot) {
                case "Single":
                    int currentNum = Integer.parseInt(scanner.nextLine());
                    if (currentNum < playerPoints) {
                        playerPoints -= currentNum;
                        successfulShotsNum++;
                        if (playerPoints == 0) {
                            System.out.printf("%s won the leg with %d shots.", playerName, successfulShotsNum);
                            break;
                        }
                    } else if (currentNum == playerPoints) {
                        successfulShotsNum++;
                        playerPoints -= currentNum;
                        System.out.printf("%s won the leg with %d shots.", playerName, successfulShotsNum);
                        break;
                    } else {
                        unsuccessfulShotsNum++;
                    }
                    break;
                case "Double":
                    currentNum = Integer.parseInt(scanner.nextLine());
                    if (currentNum < playerPoints) {
                        playerPoints -= currentNum *2;
                        successfulShotsNum++;
                        if (playerPoints == 0) {
                            System.out.printf("%s won the leg with %d shots.", playerName, successfulShotsNum);
                            break;
                        }
                    } else if (currentNum * 2 == playerPoints) {
                        successfulShotsNum++;
                        playerPoints -= currentNum;
                        System.out.printf("%s won the leg with %d shots.", playerName, successfulShotsNum);
                        break;
                    } else {
                        unsuccessfulShotsNum++;
                    }
                    break;
                case "Triple":
                    currentNum = Integer.parseInt(scanner.nextLine());
                    if (currentNum < playerPoints) {
                        playerPoints -= currentNum * 3;
                        successfulShotsNum++;
                        if (playerPoints == 0) {
                            System.out.printf("%s won the leg with %d shots.", playerName, successfulShotsNum);
                            break;
                        }
                    } else if (currentNum * 3 == playerPoints) {
                        successfulShotsNum++;
                        playerPoints -= currentNum;
                        System.out.printf("%s won the leg with %d shots.", playerName, successfulShotsNum);
                        break;
                    } else {
                        unsuccessfulShotsNum++;
                    }
                    break;
            }
            if (playerPoints == 0) {
                break;
            }
            command = scanner.nextLine();
            if (command.equals("Retire")) {
                System.out.printf("%s retired after %d unsuccessful shots.", playerName, unsuccessfulShotsNum);
            }
        }
    }
}
