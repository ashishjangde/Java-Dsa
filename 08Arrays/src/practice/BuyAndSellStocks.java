package practice;

public class BuyAndSellStocks {

    public static void main(String[] args) {
        int [] arr = {7,1,5,3,6,4};
        buyAndSellStocks(arr);
    }

    public static  void buyAndSellStocks(int[] arr){
        int n = arr.length;
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int j : arr) {
            if (j < minPrice) {
                minPrice = j;
            } else {
                maxProfit = Math.max(maxProfit, j - minPrice);
            }
        }
        System.out.println("The maximum profit is: " + maxProfit);
    }
}
