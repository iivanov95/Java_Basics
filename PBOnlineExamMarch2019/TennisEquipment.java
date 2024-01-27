package PBOnlineExamMarch2019;

import java.util.Scanner;

public class TennisEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tennisRacketPrice = Double.parseDouble(scanner.nextLine());
        int numTennisRackets = Integer.parseInt(scanner.nextLine());
        int numSneakers = Integer.parseInt(scanner.nextLine());
        double totalRacketsSum = tennisRacketPrice * numTennisRackets;
        double sneakersPrice = tennisRacketPrice / 6;
        double totalSneakersSum = numSneakers * sneakersPrice;
        double totalOthersSum = (totalSneakersSum + totalRacketsSum) * 0.2;
        double totalFinalSum = totalOthersSum + totalRacketsSum + totalSneakersSum;
        double totalDjokovicSum = totalFinalSum / 8;
        double totalSponsors = totalFinalSum - totalDjokovicSum;
        System.out.printf("Price to be paid by Djokovic %.0f%n", Math.floor(totalDjokovicSum));
        System.out.printf("Price to be paid by sponsors %.0f", Math.ceil(totalSponsors));
    }
}
