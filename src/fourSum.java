import java.util.Arrays;

public class fourSum {
    public static int ThreeSumClosest
            (int[] nums, int target) {
        if (nums.length < 3) return 0;
        // 1,0,-1,0,-2,2
        Arrays.sort(nums);
        // -2  -1  0 0 1 2
        //   ^  ^      r
        int len = nums.length;
        int min = Integer.MAX_VALUE;
        int closestTarget = 0;
        for (int i = 0; i < len - 2; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int l = i + 1;
            int r = len - 1;
            while (l < r) {
                int sum = nums[i];
                sum += nums[l];
                sum += nums[r];
                if (sum == target) {
                    return 0;
                }
                if (Math.abs(sum - target) < min) {
                    min = Math.abs(sum - target);
                    closestTarget = sum;
                }
                if (sum > target)
                    r--;
                else {
                    l++;
                }

            }
        }
        return closestTarget;


    }

    public static void main(String[] args) {
        //List<List<Integer>> quadruplets = new ArrayList<>();
        System.out.println(ThreeSumClosest(new int[]{0,0,0},1));


    }
}
