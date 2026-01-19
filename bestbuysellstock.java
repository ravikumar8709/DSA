
import java.util.Scanner;

public class bestbuysellstock {

    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        int bestbuy = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > bestbuy) {
                maxprofit = Math.max(maxprofit, prices[i] - bestbuy);

            }
            bestbuy = Math.min(bestbuy, prices[i]);
        }
        return maxprofit;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int prices[] = new int[s];
        for (int i = 0; i < s; i++) {
            prices[i] = sc.nextInt();

        }
        bestbuysellstock obj = new bestbuysellstock();
        System.out.println(obj.maxProfit(prices));

    }
}
