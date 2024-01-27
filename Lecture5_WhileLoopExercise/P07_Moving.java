package Lecture5_WhileLoopExercise;

import java.util.Scanner;

public class P07_Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int widthFreeSpace = Integer.parseInt(scanner.nextLine());
        int lengthFreeSpace = Integer.parseInt(scanner.nextLine());
        int heightFreeSpace = Integer.parseInt(scanner.nextLine());

        int totalFreeSpace = widthFreeSpace * lengthFreeSpace * heightFreeSpace;

        String command = scanner.nextLine();

        while (!command.equals("Done")) {
            int currentBoxSize = Integer.parseInt(command);
            totalFreeSpace -= currentBoxSize;

            if (totalFreeSpace <= 0) {
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(totalFreeSpace));
                break;
            }
            command = scanner.nextLine();
        }
        if (totalFreeSpace > 0) {
            System.out.printf("%d Cubic meters left.", totalFreeSpace);
        }
    }
}
