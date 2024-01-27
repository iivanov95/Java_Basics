package Lecture3_ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class P06_OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. Прочитаме от конзолата
        //2. Един switch по оператора
        //2.1. При + - *, правим проверка дали е четен или нечетен
        //2.2. При делене / или %, правим проверка дали делим на 0

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        switch (operator) {
            case "+":
                int sum = num1 + num2;
                if (sum % 2 == 0) {
                    System.out.printf("%d %s %d = %d - even", num1, operator, num2, sum);
                } else {
                    System.out.printf("%d %s %d = %d - odd", num1, operator, num2, sum);
                }
                break;
            case "-":
                int diff = num1 - num2;
                if (diff % 2 == 0) {
                    System.out.printf("%d %s %d = %d - even", num1, operator, num2, diff);
                } else {
                    System.out.printf("%d %s %d = %d - odd", num1, operator, num2, diff);
                }
                break;
            case "*":
                int result = num1 * num2;
                if (result % 2 == 0) {
                    System.out.printf("%d %s %d = %d - even", num1, operator, num2, result);
                } else {
                    System.out.printf("%d %s %d = %d - odd", num1, operator, num2, result);
                }
                break;
            case "/":
                if (num2 == 0) {
                    System.out.printf("Cannot divide %d by zero", num2);
                } else {
                    double division = num1 * 1.0 / num2;
                    System.out.printf("%d / %d = %.2f" , num1, num2, division);
                }
                break;
            case "%":
                if (num2 == 0) {
                    System.out.printf("Cannot divide %d by zero", num2);
                } else {
                    int leftover = num1 % num2;
                    System.out.printf("%d %% %d = %d", num1, num2, leftover );
                }
                break;
        }
    }
}
