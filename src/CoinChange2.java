public class CoinChange2 {
    static int total=0;
    public static int change(int amount, int[] coins) {
        findTotalWays(amount, coins);

        return total;
    }

    private static void findTotalWays(int amount, int[] coins) {
        if (amount < 0) return;
        if (amount == 0) {
            total++;
            return;
        }
        for (int coin : coins) {
            findTotalWays(amount - coin, coins);
        }


    }

    public static void main(String[] args) {
        System.out.println(change(5, new int[]{1, 2, 5}));
    }
}
