package Lecture5_WhileLoopExercise;

import java.util.Scanner;

public class P01_OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bookName = scanner.nextLine();
        int booksChecked = 0;
        boolean isFound = false;
        String input = scanner.nextLine();
        while (!input.equals("No More Books")) {
           if (input.equals(bookName)) {
               break;
           }
           booksChecked++;
           input = scanner.nextLine();
        }
        if (input.equals(bookName)) {
            System.out.printf("You checked %d books and found it.", booksChecked);
        } else {
            System.out.printf("The book you search is not here!%nYou checked %d books.", booksChecked);
        }
    }
}
