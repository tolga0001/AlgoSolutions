import java.util.Arrays;

public class CoinChange {
    public static int[] coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp,amount+1);
        dp[0] = 0;
        for (int currentAmount = 1; currentAmount < amount + 1; currentAmount++) {
            for (int coin : coins) {
                if (currentAmount >= coin) {
                    dp[currentAmount] = Math.min(1 + dp[currentAmount - coin], dp[currentAmount]);
                }

            }
          //  dp[currentAmount]=min;


        }

        return dp;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(coinChange(new int[]{3,5}, 12)));

    }
}
