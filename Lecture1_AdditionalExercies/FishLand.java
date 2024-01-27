package Lecture1_AdditionalExercies;

import java.util.Scanner;

public class P06_FishLand {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //1. Вход от конзолата
        //2. Калкулиране цените на паламуд и сафрид
        //3. Събираме всички разходи
        //4. Принтираме общата сума

        double skymriqPrice = Double.parseDouble(scanner.nextLine());
        double cacaPrice = Double.parseDouble(scanner.nextLine());
        double palamudWeight = Double.parseDouble(scanner.nextLine());
        double safridWeight = Double.parseDouble(scanner.nextLine());
        int midiWeight = Integer.parseInt(scanner.nextLine());

        double palamudPrice = skymriqPrice * 1.6;
        double safridPrice = cacaPrice * 1.8;
        double midiTotal = 7.50 * midiWeight;

        double finalSum = midiTotal + (safridPrice * safridWeight) + (palamudPrice * palamudWeight);

        System.out.printf("%.2f", finalSum);

    }
}
