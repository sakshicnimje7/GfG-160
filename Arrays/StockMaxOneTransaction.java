import java.util.ArrayList;
import java.util.List;

class Solution8 {
    static int maximumProfit(int prices[]) {
         int minSoFar = prices[0];
         int res = 0;
         
         for(int i = 1; i < prices.length; i++) {
             minSoFar = Math.min(minSoFar, prices[i]);
             
             res = Math.max(res, prices[i] - minSoFar);
         }
         
         return res;
    }
    public static void main(String[] args) {
        int prices[] = {7, 10, 1, 3, 6, 9, 2};
        System.out.println(maximumProfit(prices));
    }
}