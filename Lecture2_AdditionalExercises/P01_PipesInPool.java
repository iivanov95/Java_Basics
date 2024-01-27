package Lecture2_AdditionalExercises;

import java.util.Scanner;

public class P01_PipesInPool {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int volume = Integer.parseInt(scanner.nextLine());
        int pipe1 = Integer.parseInt(scanner.nextLine());
        int pipe2 = Integer.parseInt(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double pipe1Q = pipe1 * h;
        double pipe2Q = pipe2 * h;

        double totalQ = pipe1Q + pipe2Q;

        double pipe1Percents = (pipe1Q / totalQ) * 100;
        double pipe2Percents = (pipe2Q / totalQ) * 100;

        double totalPercent = (totalQ / volume) * 100;

        if (volume > totalQ){
            System.out.printf("The pool is %.2f full. Pipe 1: %.2f. Pipe 2: %.2f.", totalPercent, pipe1Percents, pipe2Percents);
        } else {
            double overflow = totalQ - volume;
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", h, overflow);
        }
    }
}
