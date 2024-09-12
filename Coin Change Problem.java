/*
You are given an array of integers coins representing coins of different denominations and an integer amount representing a total amount of money.

Return the fewest number of coins needed to make up that amount.
If that amount of money cannot be made up by any combination of the coins, return -1.
You have an infinite number of each kind of coin.

Example:
For coins = {1, 2, 5} and amount = 11:

Using one 5 coin, we are left with amount = 6.
Using one more 5 coin, we are left with amount = 1.
Using one 1 coin, the amount becomes 0, and we have used 3 coins in total.
Thus, the output will be 3.

*/


public class CoinChange {

    // Recursive function to find the minimum coins required for the given amount
    public static int coinChangeRecursive(int[] coins, int amount) {
        // If the amount is zero, no coins are needed
        if (amount == 0) {
            return 0;
        }
        // If the amount is less than zero, it's not possible to make this amount
        if (amount < 0) {
            return -1;
        }
        
        int minCoins = Integer.MAX_VALUE;
        
        // Try every coin in the array
        for (int coin : coins) {
            // Try to find the minimum coins required for the remaining amount (amount - coin)
            int res = coinChangeRecursive(coins, amount - coin);
            
            // If it's possible to make the remaining amount, calculate the total coins
            if (res >= 0 && res < minCoins) {
                minCoins = res + 1;
            }
        }
        
        // If no solution is found, return -1; otherwise return the minimum coins found
        return minCoins == Integer.MAX_VALUE ? -1 : minCoins;
    }

    public static void main(String[] args) {
        // Example input
        int[] coins = {1, 2, 5};
        int amount = 11;
        
        // Output the result of the coin change problem
        int result = coinChangeRecursive(coins, amount);
        System.out.println("Minimum coins required: " + result);
    }
}
