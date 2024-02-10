import java.util.Arrays;

public class replaceElementsQuestion {
    public static int[] replaceElements(int[] arr) {
        int len = arr.length;
        int[] result = new int[len];
        int remainMax;
        int i;
        for (i = 0; i < len - 1; i++) {
            remainMax = getMax(i + 1, arr);
            result[i] = remainMax;
        }
        result[i] = -1;

        return result;
    }

    private static int getMax(int start, int[] arr) {
        int max = Integer.MIN_VALUE;
        int len = arr.length;
        for (int i = start; i < len; i++) {
            max = Math.max(arr[i], max);

        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(replaceElements(new int[]{400})));
    }
}
