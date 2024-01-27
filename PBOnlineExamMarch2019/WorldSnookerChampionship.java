package PBOnlineExamMarch2019;

import java.util.Scanner;

public class WorldSnookerChampionship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tournamentStage = scanner.nextLine();
        String ticketType = scanner.nextLine();
        int numTickets = Integer.parseInt(scanner.nextLine());
        String trophyPic = scanner.nextLine();
        double totalSum = 0;
        switch (tournamentStage) {
            case "Quarter final":
                switch (ticketType) {
                    case "Standard":
                        totalSum = 55.5 * numTickets;
                        if (totalSum > 2500 && totalSum <= 4000) {
                            totalSum = totalSum * 0.9;
                            if (trophyPic.equals("Y")) {
                                totalSum += numTickets * 40;
                            }
                        } else if (totalSum > 4000) {
                            totalSum = totalSum * 0.75;
                        }
                        System.out.printf("%.2f", totalSum);
                        break;
                    case "Premium":
                        totalSum = 105.2 * numTickets;
                        if (totalSum > 2500 && totalSum <= 4000) {
                            totalSum = totalSum * 0.9;
                            if (trophyPic.equals("Y")) {
                                totalSum += numTickets * 40;
                            }
                        } else if (totalSum > 4000) {
                            totalSum = totalSum * 0.75;
                        }
                        System.out.printf("%.2f", totalSum);
                        break;
                    case "VIP":
                        totalSum = 118.9 * numTickets;
                        if (totalSum > 2500 && totalSum <= 4000) {
                            totalSum = totalSum * 0.9;
                            if (trophyPic.equals("Y")) {
                                totalSum += numTickets * 40;
                            }
                        } else if (totalSum > 4000) {
                            totalSum = totalSum * 0.75;
                        }
                        System.out.printf("%.2f", totalSum);
                        break;
                }
                break;
            case "Semi final":
                switch (ticketType) {
                    case "Standard":
                        totalSum = 75.88 * numTickets;
                        if (totalSum > 2500 && totalSum <= 4000) {
                            totalSum = totalSum * 0.9;
                            if (trophyPic.equals("Y")) {
                                totalSum += numTickets * 40;
                            }
                        } else if (totalSum > 4000) {
                            totalSum = totalSum * 0.75;
                        }
                        System.out.printf("%.2f", totalSum);
                        break;
                    case "Premium":
                        totalSum = 125.22 * numTickets;
                        if (totalSum > 2500 && totalSum <= 4000) {
                            totalSum = totalSum * 0.9;
                            if (trophyPic.equals("Y")) {
                                totalSum += numTickets * 40;
                            }
                        } else if (totalSum > 4000) {
                            totalSum = totalSum * 0.75;
                        }
                        System.out.printf("%.2f", totalSum);
                        break;
                    case "VIP":
                        totalSum = 300.4 * numTickets;
                        if (totalSum > 2500 && totalSum <= 4000) {
                            totalSum = totalSum * 0.9;
                            if (trophyPic.equals("Y")) {
                                totalSum += numTickets * 40;
                            }
                        } else if (totalSum > 4000) {
                            totalSum = totalSum * 0.75;
                        }
                        System.out.printf("%.2f", totalSum);
                        break;
                }
                break;

            case "Final":
                switch (ticketType) {
                    case "Standard":
                        totalSum = 110.1 * numTickets;
                        if (totalSum > 2500 && totalSum <= 4000) {
                            totalSum = totalSum * 0.9;
                            if (trophyPic.equals("Y")) {
                                totalSum += numTickets * 40;
                            }
                        } else if (totalSum > 4000) {
                            totalSum = totalSum * 0.75;
                        }
                        System.out.printf("%.2f", totalSum);
                        break;
                    case "Premium":
                        totalSum = 160.66 * numTickets;
                        if (totalSum > 2500 && totalSum <= 4000) {
                            totalSum = totalSum * 0.9;
                            if (trophyPic.equals("Y")) {
                                totalSum += numTickets * 40;
                            }
                        } else if (totalSum > 4000) {
                            totalSum = totalSum * 0.75;
                        }
                        System.out.printf("%.2f", totalSum);
                        break;
                    case "VIP":
                        totalSum = 400 * numTickets;
                        if (totalSum > 2500 && totalSum <= 4000) {
                            totalSum = totalSum * 0.9;
                            if (trophyPic.equals("Y")) {
                                totalSum += numTickets * 40;
                            }
                        } else if (totalSum > 4000) {
                            totalSum = totalSum * 0.75;
                        }
                        System.out.printf("%.2f", totalSum);
                        break;
                }
                break;
        }
    }
}
