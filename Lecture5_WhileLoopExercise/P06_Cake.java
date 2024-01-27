package Lecture5_WhileLoopExercise;

import java.util.Scanner;

public class P06_Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int totalPieces = width * length;

        while (!command.equals("STOP")) {
            int currentPieces = Integer.parseInt(command);
            totalPieces -= currentPieces;
            if (totalPieces <= 0) {
                break;
            }
            command = scanner.nextLine();
        }
        if (totalPieces > 0) {
            System.out.printf("%d pieces are left.", (totalPieces));
        } else {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(totalPieces));
        }
    }
}
