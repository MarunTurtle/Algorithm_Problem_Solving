import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            int N = sc.nextInt();
            int[] prices = new int[N];

            for (int i = 0; i < N; i++) {
                prices[i] = sc.nextInt();
            }

            long maxProfit = calculateMaxProfit(prices);
            System.out.println("#" + t + " " + maxProfit);
        }
        sc.close();
    }

    public static long calculateMaxProfit(int[] prices) {
        int n = prices.length;
        int maxPrice = prices[n - 1];
        long profit = 0;

        for (int i = n - 2; i >= 0; i--) {
            if (prices[i] > maxPrice) {
                maxPrice = prices[i];
            } else {
                profit += maxPrice - prices[i];
            }
        }

        return profit;
    }
}
