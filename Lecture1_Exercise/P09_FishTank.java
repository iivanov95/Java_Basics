package Lecture1_Exercise;

import java.util.Scanner;

public class P09_FishTank {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //1. Прочитаме входа от конзолата
        //2. Пресмятаме обема на аквариума в литри
        //3. Изваждаме от цялото количество процента зает от пясък, растения и т.н.
        //4. Принтиране

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percentFilledSpace = Double.parseDouble(scanner.nextLine());

        double volumeLiters = (length * width * height) * 0.001;

        double neededLiters = volumeLiters * (1 - percentFilledSpace / 100);

        System.out.println(neededLiters);

    }
}
