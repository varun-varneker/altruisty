import java.util.Scanner;

public class StockProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfDays = scanner.nextInt();

        int[] stockPrices = new int[numberOfDays];
        for (int day = 0; day < numberOfDays; day++) {
            stockPrices[day] = scanner.nextInt();
        }

        
        int minimumPriceSoFar = Integer.MAX_VALUE;
        int maximumProfitSoFar = 0;

        for (int currentDayPrice : stockPrices) {
            if (currentDayPrice < minimumPriceSoFar) {
                minimumPriceSoFar = currentDayPrice;
            }

            int profitIfSoldToday = currentDayPrice - minimumPriceSoFar;

            
            if (profitIfSoldToday > maximumProfitSoFar) {
                maximumProfitSoFar = profitIfSoldToday; 
            }
        }

        System.out.println(maximumProfitSoFar);
    }
}