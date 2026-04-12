public class MaxProfitStock {

    // Function to calculate maximum profit from stock prices
    public static int maxProfit(int price[]) {

        // minimumPrice will store the lowest price seen so far
        int minimumPrice = Integer.MAX_VALUE;

        // maxProfit will store the highest profit found
        int maxProfit = 0;

        // loop through each day's price
        for (int i = 0; i < price.length; i++) {

            // If current price is lower than the minimum seen so far
            // update minimumPrice
            if (price[i] < minimumPrice) {
                minimumPrice = price[i];
            }

            // If current price is greater than minimum price
            // calculate profit if we sell today
            else if (price[i] > minimumPrice) {

                // profit = selling price - buying price
                int profit = price[i] - minimumPrice;

                // update maxProfit if this profit is larger
                maxProfit = Math.max(maxProfit, profit);
            }
        }

        // return the best profit possible
        return maxProfit;
    }

    public static void main(String[] args) {

        // stock prices for each day
        int price[] = {7, 1, 5, 3, 6, 4};

        // call function and print result
        System.out.println("Maximum Profit = " + maxProfit(price));
    }
}