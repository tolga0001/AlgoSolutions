public class HackerrankQuestion {
    public static void main(String[] args) {
        // n is divisible by 4
        System.out.println(getMaxXor(4));
    }

    public static long getMaxXor(long n) {
        long v = n;
        long max_v = n;
        long res_x = n;
        for (long i = n + 1; i < 2 * n; i++) {
            v = v ^ i;
            if (v > max_v) {
                max_v = v;
                res_x = i;
            }

        }


        return res_x;
    }
}
