public class medianOfTwoSortedList {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        double firstSum = recursiveSum(nums1, 0, m - 1);
        double secondSum = recursiveSum(nums2, 0, n - 1);

        return (firstSum + secondSum) / (m + n);

    }

    public static double recursiveSum(int[] nums, int low, int high) {
        if (low > high) return 0;
        if (low == high) return nums[low];
        int median = (low + high) / 2;
        double leftPartSum = recursiveSum(nums, low, median);
        double rightPartSum = recursiveSum(nums, median + 1, high);
        return leftPartSum + rightPartSum;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3}; // 10
        int[] nums2 = {2,7}; // 18
        System.out.println(findMedianSortedArrays(nums1, nums2));

    }
}
