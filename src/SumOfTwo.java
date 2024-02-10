import java.util.Arrays;

public class SumOfTwo {
    public static void main(String[] args) {
        int[] a = {0, 0, -5};  // -5 0 0 5 3012 3052
        int[] b = {-10, 40, -3, 9};  // -10 -3 9 40
        int v =40;
        // -5+-3=-8 true;
        if (isSumFinded(a, b, v)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }

    private static boolean isSumFinded(int[] a, int[] b, int v) {
        // arrayleri sortla
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0, j = b.length - 1;
        while (i < a.length && j >= 0) {
            if (a[i] + b[j] == v) {
                return true;
            }
            if (a[i] + b[j] < v) {
                i++;
            } else {
                j--;
            }

        }
        return false;
    }
}