package Lecture2_Exercise;

import java.util.Scanner;

public class P07_Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int GPUs = Integer.parseInt(scanner.nextLine());
        int CPUs = Integer.parseInt(scanner.nextLine());
        int RAMs = Integer.parseInt(scanner.nextLine());

        int GPUPrice = 250;
        double CPUPrice = GPUPrice * GPUs * 0.35;
        double RAMPrice = GPUPrice * GPUs * 0.1;

        double totalCashSpent = GPUs * GPUPrice + RAMPrice * RAMs + CPUPrice * CPUs;

        if (GPUs > CPUs){
            totalCashSpent = totalCashSpent * 0.85;
        }

        double remainingAmount = budget - totalCashSpent;

        if (remainingAmount >= 0) {
            System.out.printf("You have %.2f leva left!", remainingAmount);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", Math.abs(remainingAmount));
        }
    }
}
