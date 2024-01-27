package PBOnlineExamMarch2019;

import java.util.Scanner;

public class GameNumberWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playerOne = scanner.nextLine();
        String playerTwo = scanner.nextLine();
        String command = scanner.nextLine();
        int totalPointsPlayerOne = 0;
        int totalPointsPlayerTwo = 0;
        while (!command.equals("End of game")) {
            int cardPlayerOne = Integer.parseInt(command);
            int cardPlayerTwo = Integer.parseInt(scanner.nextLine());
            if (cardPlayerOne > cardPlayerTwo) {
                totalPointsPlayerOne += cardPlayerOne - cardPlayerTwo;
            } else if (cardPlayerTwo > cardPlayerOne) {
                totalPointsPlayerTwo += cardPlayerTwo - cardPlayerOne;
            } else {
                int addCardPlayerOne = Integer.parseInt(scanner.nextLine());
                int addCardPlayerTwo = Integer.parseInt(scanner.nextLine());
                if (addCardPlayerOne > addCardPlayerTwo) {
                    System.out.println("Number wars!");
                    System.out.printf("%s is winner with %d points", playerOne, totalPointsPlayerOne);
                    break;
                } else if (addCardPlayerTwo > addCardPlayerOne){
                    System.out.println("Number wars!");
                    System.out.printf("%s is winner with %d points", playerTwo, totalPointsPlayerTwo);
                    break;
                }
            }
            command = scanner.nextLine();
            if (command.equals("End of game")) {
                System.out.printf("%s has %d points%n", playerOne, totalPointsPlayerOne);
                System.out.printf("%s has %d points", playerTwo, totalPointsPlayerTwo);
            }
        }
    }
}
